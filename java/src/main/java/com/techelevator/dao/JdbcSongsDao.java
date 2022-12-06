package com.techelevator.dao;

import com.techelevator.model.Song;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;


public class JdbcSongsDao implements SongsDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcSongsDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
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
    public List<Song> getEventPlaylist(int eventId) {
        List<Song> eventPlaylist = new ArrayList<>();

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

//    @Override
//    public boolean submitASong()
//    return true;
//    }

    @Override
    public List<Song> getSongListByDJid(int djId) {
        List<Song> djAllSongs = new ArrayList<>();

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

    @Override
    public void addSongsToPlaylist(int playlistID, int songID) { //event_song table
        //might need to do returning - need to test
        String sql = "INSERT INTO event_song (song_id,event_id,song_order) " +
                "VALUES (?,?,0) ;";

        jdbcTemplate.queryForObject(sql, Integer.class, playlistID, songID);
    }

    //TODO: we would need to create a songs_submitted table to implement this
//    @Override
//    public boolean submitASong() {
//        return false;
//    }


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

    }
}

