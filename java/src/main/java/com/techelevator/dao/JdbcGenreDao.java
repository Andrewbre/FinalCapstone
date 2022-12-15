package com.techelevator.dao;

import com.techelevator.model.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcGenreDao implements GenreDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcGenreDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Genre> getGenresByEventId(int eventId) {
        List<Genre> eventGenres = new ArrayList<>();
        String sql = "SELECT g.genre_id, genre_name " +
                "FROM event_genre eg " +
                "JOIN genre g ON eg.genre_id = g.genre_id WHERE eg.event_id=? " +
                "ORDER BY genre_name; ";
        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, eventId);
            while (results.next()) {
                eventGenres.add(mapRowToGenre(results));
            }
        } catch (Exception e) {
            System.out.println("Error occurred - unable to retrieve genres filtered by event");
        }
        return eventGenres;
    }

    @Override
    public List<Genre> getGenresByDjId(int djId) {
        List<Genre> djGenreList = new ArrayList<>();
        String sql = "SELECT genre_id, genre_name " +
                "FROM genre WHERE dj_id = ?; ";

       try {
           SqlRowSet results = jdbcTemplate.queryForRowSet(sql, djId);
           while (results.next()) {
               djGenreList.add(mapRowToGenre(results));
           }
       } catch (Exception e) {
           System.out.println("Error occurred - unable to retrieve genres filtered by DJ");
       }
        return djGenreList;
     }

     public Genre getGenresByGenreId(int genreId) {
         String sql = "SELECT genre_id, genre_name " +
                 "FROM genre WHERE genre_id = ?; ";

         SqlRowSet results = jdbcTemplate.queryForRowSet(sql, genreId);

         if (results.next()) {
             return mapRowToGenre(results);
         } else {
             return null;
         }
    }

    @Override
    public List<Genre> getAllGenres() {
        List<Genre> genreList = new ArrayList<>();

        SqlRowSet results = jdbcTemplate.queryForRowSet("" +
                "SELECT event_id, dj_id, event_name, information, event_status " +
                "FROM event " +
                "ORDER BY event_name ASC;");
        try {
            while (results.next()) {
                genreList.add(mapRowToGenre(results));
            }
        } catch (Exception e) {
            System.out.println(" Error occurred - can't locate list of genres");
        }
        return genreList;
    }


    private Genre mapRowToGenre(SqlRowSet rowSet) {
        Genre genre = new Genre();

        genre.setGenreId(rowSet.getInt("genre_id"));
        genre.setGenreName(rowSet.getString("genre_name"));

        return genre;
    }



}
