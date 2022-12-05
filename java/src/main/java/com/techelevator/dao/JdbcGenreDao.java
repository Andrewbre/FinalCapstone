package com.techelevator.dao;

import com.techelevator.model.Event;
import com.techelevator.model.Genre;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JdbcGenreDao implements GenreDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcGenreDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Genre> getAllGenres() {
        return null;
    }

    @Override
    public List<Genre> getGenresByDjId() {
        return null;
    }

    @Override
    public List<Genre> getGenresByEventId() {
        return null;
    }

    @Override
    public boolean addGenreByEventId() {
        return false;
    }

    private Genre mapRowToGenre(SqlRowSet rowSet) {
        Genre genre = new Genre();

        genre.setGenreId(rowSet.getInt("genre_id"));
        genre.setGenreName(rowSet.getString("genre_name"));

        return genre;
    }

}
