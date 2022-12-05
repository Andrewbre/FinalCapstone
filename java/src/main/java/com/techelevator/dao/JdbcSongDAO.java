package com.techelevator.dao;

import com.techelevator.model.Song;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.LinkedList;
import java.util.Queue;

public class JdbcSongDao implements SongDao {
    private JdbcTemplate jdbcTemplate;
    public JdbcSongDao(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    @Override
    public Queue<Song> getAllSongsByEventId(int eventId) {

        Queue<Song> allSongList = new LinkedList<Song>();
        String sql = "SELECT song_id, artist_id, song_name, featured_artist" +
                "FROM song_event" +
                "WHERE event_id = ?" +
                "ORDER BY ASC";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while (results.next()) {
            allSongList.offer(mapRowToSong(results));
        }

        return allSongList;
    };

    @Override
    public Queue<Song> getEventPlaylist(int eventId) {
        Queue<Song> eventPlaylist = new LinkedList<Song>();
        
        return null;
    }

    @Override
    public Queue<Song> getSongListByDJid(int userId) {
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
        song.setSongId(rowSet.getInt("song_id"));
        song.setArtistId(rowSet.getInt("artist_id"));
        song.setSongName(rowSet.getString("song_name"));
        song.setFeaturedArtist(rowSet.getString("featured_artist"));

        return song;

    }
}
