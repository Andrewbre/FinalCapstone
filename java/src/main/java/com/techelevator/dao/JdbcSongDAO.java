package com.techelevator.dao;

import com.techelevator.model.Event;
import com.techelevator.model.Song;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class JdbcSongDAO implements SongDAO {
    private JdbcTemplate jdbcTemplate;
    public JdbcSongDAO(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    @Override
    public List<Song> getAllSongsByEventId(int eventId) {

        List<Song> allSongList = new ArrayList<>();
        String sql = "SELECT s.song_id, artist_id, song_name, featured_artist" +
                "FROM song s JOIN event_song es ON s.song_id=es.song_id " +
                "JOIN event e ON e.event_id=es.event_id "+
                "WHERE event_id = ? " +
                "ORDER BY song_order DESC;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, eventId);
        while (results.next()) {
            allSongList.add(mapRowToSong(results));
        }

        return allSongList;
    };

    @Override
    public List<Song> getEventPlaylist(int eventId) {
        List<Song> eventPlaylist = new ArrayList<>();

        String sql = "SELECT s.so"
        
        return null;
    }

    @Override
    public List<Song> getSongListByDJid(int userId) {
        return null;
    }

    @Override
    public boolean addSongsToPlaylist(int userId) {
        return false;
    }

    @Override
    public boolean submitASong() {
        return false;
    }

    @Override
    public boolean voteOnASong() {
        return false;
    }

    private Song mapRowToSong(SqlRowSet rowSet){
        Song song = new Song();
        song.setSongId(rowSet.getInt("s.song_id"));
        song.setArtistId(rowSet.getInt("artist_id"));
        song.setSongName(rowSet.getString("song_name"));
        song.setFeaturedArtist(rowSet.getString("featured_artist"));

        return song;

    }
}
