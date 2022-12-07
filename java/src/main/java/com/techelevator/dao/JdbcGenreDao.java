package com.techelevator.dao;

import com.techelevator.model.Genre;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcGenreDao implements GenreDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcGenreDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcGenreDao(DataSource dataSource, JdbcGenreDao jdbcGenreDao) {
    }

    //TODO: I'm not sure we need to retrieve all genres
//    @Override
//    public List<Genre> getAllGenres() {
//    }

    @Override
    public List<Genre> getGenresByDjId(int djId) {
        List<Genre> djGenreList = new ArrayList<>();
        String sql = "SELECT genre_id, genre_name " +
                "FROM genre WHERE dj_id = ?; ";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, djId);
        while(results.next()){
            djGenreList.add(mapRowToGenre(results));
        }
        return djGenreList;
     }

    @Override
    public List<Genre> getGenresByEventId(int eventId) {
        List<Genre> eventGenres = new ArrayList<>();
        String sql = "SELECT genre_id, genre_name" +
                "FROM event e JOIN event_genre eg ON e.event_id = eg.event_id " +
                "JOIN genre g ON eg.genre_id = g.genre_id WHERE e.event_id=?" +
                "ORDER BY genre_name; ";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, eventId);
        while(results.next()){
            eventGenres.add(mapRowToGenre(results));
        }
        return eventGenres;
    }

    @Override
    public void addGenreByEventId(int genreId, int eventId) {
        String sql = "INSERT INTO event_genre (genre_id, event_id)" +
                "VALUES (?,?); ";
        jdbcTemplate.queryForObject(sql, Integer.class, genreId,eventId);
    }


    private Genre mapRowToGenre(SqlRowSet rowSet) {
        Genre genre = new Genre();

        genre.setGenreId(rowSet.getInt("genre_id"));
        genre.setGenreName(rowSet.getString("genre_name"));

        return genre;
    }



}
