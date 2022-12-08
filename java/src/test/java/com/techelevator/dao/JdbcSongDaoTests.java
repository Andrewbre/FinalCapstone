package com.techelevator.dao;

import com.techelevator.dao.BaseDaoTests;
import com.techelevator.dao.JdbcEventDao;
import com.techelevator.dao.JdbcSongsDao;
import com.techelevator.model.Event;
import com.techelevator.model.Genre;
import com.techelevator.model.Song;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class JdbcSongDaoTests extends BaseDaoTests {


    private static final Song SONG_1 = new Song (1, 2, "AbbaJabba", "Cher");
    private static final Song SONG_2 = new Song(2,4, "Gin and Juice", "Snoop Dog");
    private static final Song SONG_3 = new Song(3,5, "Apple Fritz","Jimmy Buffet"  );


    private JdbcSongsDao sut;


    @Before
    public void setup() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        sut = new JdbcSongsDao(jdbcTemplate);


    }
    @Test
    public void getAllSongsAvailableByEventId_Happy_Path(){

    }
    @Test
    public void submitASong_Happy_Path(){

    }
    @Test
    public void getSongListByDJid_Happy_Path(){

    }

    @Test
    public void addSongToPlaylist_Happy_Path(){

    }
    @Test
    public void voteOnASong_Happy_Path(){


    }
    @Test
    public void getSongBySongId_Happy_Path(){

    }
    @Test
    public void submitASong_Not_Null(){

    }
    @Test
    public void addSongToPlaylist_Not_Null(){

    }
}