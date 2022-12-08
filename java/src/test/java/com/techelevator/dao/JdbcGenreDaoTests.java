package com.techelevator.dao;

import com.techelevator.dao.BaseDaoTests;
import com.techelevator.dao.JdbcEventDao;
import com.techelevator.dao.JdbcGenreDao;
import com.techelevator.model.Genre;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class JdbcGenreDaoTests extends BaseDaoTests {

   private static final Genre GENRE_1 = new Genre (1, "Pop");
    private static final Genre GENRE_2 = new Genre (2, "Grunge");
    private static final Genre GENRE_3 = new Genre (3, "Rap");

    private JdbcGenreDao sut;
    private Genre testGenre;

    @Before
    public void setup() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        sut = new JdbcGenreDao(jdbcTemplate);

    }

    @Test
    public void getGenresByDjId_Happy_Path(){
    List<Genre> actual = sut.getGenresByDjId();
     Assert.assertEquals();

    }
    @Test
    public void getGenresByEventId_Happy_Path(){
   List<Genre> actual = sut.getGenresByEventId();
   Assert.assertEquals();

    }
    @Test
    public void getGenresByGenreId_Happy_Path(){
     Genre actual = sut.getGenresByGenreId(3);
     Assert.assertEquals(GENRE_3, actual);

    }
}