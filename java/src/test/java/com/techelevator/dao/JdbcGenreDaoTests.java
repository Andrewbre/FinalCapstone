package com.techelevator.dao;

import com.techelevator.dao.BaseDaoTests;
import com.techelevator.dao.JdbcEventDao;
import com.techelevator.dao.JdbcGenreDao;
import com.techelevator.model.Genre;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcGenreDaoTests extends BaseDaoTests {

   private final Genre GENRE_1 = new Genre (1, "Pop");
    private final Genre GENRE_2 = new Genre (2, "Grunge");
    private final Genre GENRE_3 = new Genre (3, "Rap");
    
    private JdbcGenreDao sut;
    private Genre testGenre;

    @Before
    public void setup() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        sut = new JdbcGenreDao(jdbcTemplate);

    }

    @Test
    public void getGenresByDjId_Happy_Path(){

    }
    @Test
    public void getGenresByEventId_Happy_Path(){

    }
    @Test
    public void getGenresByGenreId_Happy_Path(){

    }
}