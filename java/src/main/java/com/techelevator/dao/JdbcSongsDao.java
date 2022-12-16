package com.techelevator.dao;

import com.techelevator.model.NewEventSongDto;
import com.techelevator.model.Song;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@Component
public class JdbcSongsDao implements SongsDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcSongsDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }



    @Override
    public List<Song> getAllSongsAvailableByEventId(int eventId) {

        List<Song> allSongList = new ArrayList<>();
        String sql = "SELECT s.song_id, artist_id, song_name, featured_artist, e.dj_id, e.event_id FROM event e " +
                "JOIN event_genre eg ON e.event_id = eg.event_id JOIN genre g ON g.genre_id=eg.genre_id " +
                "JOIN song_genre sg ON sg.genre_id=g.genre_id JOIN song s on s.song_id = sg.song_id WHERE e.event_id = ?;";

        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, eventId);
            while (results.next()) {
                allSongList.add(mapRowToSong(results));
            }
        } catch (Exception e) {
            System.out.println("Can't locate those songs filtered by event");
        }

        return allSongList;
    }

    @Override
    public List<Song> getEventPlaylist(int eventId) {
        List<Song> eventPlaylist = new ArrayList<>();
        String sql = "SELECT s.song_id, artist_id, song_name, featured_artist, e.dj_id, e.event_id \n" +
                "                FROM event_song es\n" +
                "                JOIN song s on es.song_id=s.song_id\n" +
                "                JOIN event e on e.event_id = es.event_id\n" +
                "                WHERE e.event_id = ? AND es.isApproved = true;";


        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, eventId);
            while (results.next()) {
                eventPlaylist.add(mapRowToSong(results));
            }
        } catch (Exception e) {
            System.out.println("Error occurred - can't locate that playlist");
        }

        return eventPlaylist;

    }

    @Override
    public boolean submitASong(NewEventSongDto newEventSongDto) {
        int songId = newEventSongDto.getSongId();
        int eventId = newEventSongDto.getEventId();

        String sql = "INSERT INTO event_song (song_id, event_id) " +
                "VALUES (?, ?) RETURNING (event_id);";

        Integer returnValue = null;

        try {
            returnValue = jdbcTemplate.queryForObject(sql, Integer.class, songId, eventId);
        } catch (Exception e) {
            System.out.println("Error occurred - unable to submit a song");
        }
        return returnValue != null;

    }

    @Override
    public Queue<Song> getSongListByDjId(int djId) {
        Queue<Song> djAllSongs = new LinkedList<Song>();

        String sql = "SELECT s.song_id, artist_id, song_name, featured_artist, g.dj_id, event_id " +
                "FROM song s JOIN song_genre sg ON s.song_id=sg.song_id " +
                "JOIN genre g ON g.genre_id = sg.genre_id " +
                "JOIN event e ON e.dj_id = g.dj_id " +
                "WHERE g.dj_id = ?; ";
//                "GROUP BY s.song_id; ";
        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, djId);
            while (results.next()) {
                djAllSongs.add(mapRowToSong(results));
            }
        } catch (Exception e) {
            System.out.println("Can't locate this list of songs filtered by DJ");
        }
        return djAllSongs;
    }

    @Override
    public void addSongToPlaylist(NewEventSongDto newEventSongDto) {
        int songId = newEventSongDto.getSongId();
        int eventId = newEventSongDto.getEventId();

        String sql = "UPDATE event_song SET isApproved = true WHERE event_id = ? and song_id = ?;";

        try {
            jdbcTemplate.update(sql, eventId, songId);
        } catch (Exception e) {
            System.out.println("Error occurred - unable to add song to playlist");
        }
    }

    @Override
    public Song getSongBySongId(int songId) {
        String sql = "SELECT song_id, artist_id, song_name, featured_artist " +
                "FROM s.song " +
                "WHERE s.song_id = ?;";

            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, songId);

            if (results.next()) {
                return mapRowToSong(results);
            } else {
                return null;
            }
        }

    @Override
    public void voteOnASong(NewEventSongDto newEventSongDto) {
        int songId= newEventSongDto.getSongId();
        int eventId = newEventSongDto.getEventId();
        String sql = "UPDATE event_song SET song_order = song_order + 1 " +
                "WHERE song_id = ? AND event_id = ?; ";
       try {
        jdbcTemplate.update(sql, songId, eventId);

       } catch (Exception e) {
           System.out.println("Error occurred - unable to vote on a song");
       }
    }

    @Override
    public String findArtistNameByArtistID(int artist_id){
        String sql = "SELECT artist_name FROM artist WHERE artist_id = ? RETURNING artist_name;";
        String results = jdbcTemplate.queryForObject(sql, String.class, artist_id);
        return results.toString();
    }

    private Song mapRowToSong(SqlRowSet rowSet) {
        Song song = new Song();
        song.setSongId(rowSet.getInt("song_id"));
        song.setArtistId(rowSet.getInt("artist_id"));
        song.setSongName(rowSet.getString("song_name"));
        song.setFeaturedArtist(rowSet.getString("featured_artist"));
        song.setDjId(rowSet.getInt("dj_id"));
        song.setEventId(rowSet.getInt("event_id"));

        return song;

    }
}

