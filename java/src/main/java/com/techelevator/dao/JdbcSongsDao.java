package com.techelevator.dao;

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
        String sql = "SELECT s.song_id, artist_id, song_name, featured_artist" +
                "FROM event e JOIN event_genre eg ON e.event_id = eg.event_id " +
                "JOIN genre g ON g.genre_id=eg.genre_id " +
                "JOIN song_genre sg ON sg.genre_id=g.genre_id " +
                "JOIN song s on s.song_id = sg.song_id " +
                "WHERE event_id = ? " +
                "ORDER BY song_order DESC;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, eventId);
        while (results.next()) {
            allSongList.add(mapRowToSong(results));
        }

        return allSongList;
    }



    @Override
    public Queue<Song> getEventPlaylist(int eventId) {
        Queue<Song> eventPlaylist = new LinkedList<Song>();
        String sql = "SELECT s.song_id, artist_id, song_name, featured_artist " +
                "FROM event_song es " +
                "JOIN song s on es.song_id=s.song_id " +
                "WHERE event_id ? " +
                "GROUP BY song_id " +
                "ORDER BY song_order DESC;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, eventId);
        while (results.next()) {
            eventPlaylist.add(mapRowToSong(results));
        }

        return eventPlaylist;

    }

    @Override
    public boolean submitASong(List<Integer> songIds, int eventId) {
        Integer returnedEvent = null;
        for(int songId : songIds){

            String sql = "INSERT INTO event_song (song_id, event_id) " +
                    "VALUES (?, ?) RETURNING (event_id);";
            returnedEvent = jdbcTemplate.queryForObject(sql, Integer.class, songId, eventId);
        }

        //TODO need to fix
        return returnedEvent!=null;
    }

    @Override
    public Queue<Song> getSongListByDJid(int djId) {
        Queue<Song> djAllSongs = new LinkedList<Song>();

        String sql = "SELECT s.song_id, artist_id, song_name, featured_artist " +
                "FROM song s JOIN song_genre sg ON s.song_id=sg.song_id " +
                "WHERE dj_id = ? " +
                "GROUP BY song_id; ";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, djId);
        while (results.next()) {
            djAllSongs.add(mapRowToSong(results));
        }

        return djAllSongs;
    }

    //TODO add isApproved to addSongsToPlaylist

    @Override
    public void addSongsToPlaylist(int playlistID, int songID) { //event_song table
        //might need to do returning - need to test
        String sql = "INSERT INTO event_song (song_id,event_id,song_order) " +
                "VALUES (?,?,0) ;";

        jdbcTemplate.queryForObject(sql, Integer.class, playlistID, songID);
    }



    @Override
    public void voteOnASong(int song_id, int event_id) {
        String sql = "UPDATE event_song SET song_order = song_order + 1 " +
                "WHERE song_id = ? AND event_id = ?;";
        jdbcTemplate.update(sql, Integer.class, song_id, event_id);

    }


    private Song mapRowToSong(SqlRowSet rowSet) {
        Song song = new Song();
        song.setSongId(rowSet.getInt("s.song_id"));
        song.setArtistId(rowSet.getInt("artist_id"));
        song.setSongName(rowSet.getString("song_name"));
        song.setFeaturedArtist(rowSet.getString("featured_artist"));

        return song;

<<<<<<< HEAD
    }}
=======
    }
}
>>>>>>> 15d2e1c2b6d1082735be0ecad87003c928030b73

