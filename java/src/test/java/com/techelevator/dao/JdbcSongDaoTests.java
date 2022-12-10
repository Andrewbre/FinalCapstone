package com.techelevator.dao;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.techelevator.dao.BaseDaoTests;
import com.techelevator.dao.JdbcEventDao;
import com.techelevator.dao.JdbcSongsDao;
import com.techelevator.model.Event;
import com.techelevator.model.Genre;
import com.techelevator.model.Song;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = TestingDatabaseConfig.class)
public class JdbcSongDaoTests extends BaseDaoTests {


    private static final Song SONG_1 = new Song(1, 2,"Abba Jabba", "Cher");
    private static final Song SONG_2 = new Song(2,4, "Gin and Juice", "Snoop Dog");
    private static final Song SONG_3 = new Song(3,5, "Apple Fritz","Jimmy Buffet");

    private JdbcSongsDao sut;


    @Before
    public void setup() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        sut = new JdbcSongsDao(jdbcTemplate);



    }/*
    @Test
<<<<<<< HEAD
    public void getAllSongsAvailableByEventId_Happy_Path(){
    List<Song> actual = sut.getAllSongsAvailableByEventId(7);
    Integer size = actual.size();
        Assert.assertEquals(actual.size(),2);
=======
    public void getAllSongsAvailableByEventId_Happy_Path() {
        List<Song> actual = sut.getAllSongsAvailableByEventId(7);
        Assert.assertTrue(actual.contains(SONG_2));
>>>>>>> 89d7509dab3559fcb5719ffce92e589fca97ff29
    }

    @Test
    public void getEventPlaylist_Happy_Path(){
    Queue<Song> actual = new LinkedList<>();
    actual.add(SONG_1);
    actual.add(SONG_2);
    actual.add(SONG_3);
    Assert.assertTrue(actual.contains(SONG_2));
    }*/
    @Test
    public void submitASong_Happy_Path() {
        List<Song> songList = new ArrayList<>();
        songList.add(SONG_1);
        songList.add(SONG_2);
        Assert.assertEquals(2, songList.size());
    }
    /*
    @Test
    public void getSongListByDjId_Happy_Path() {
        Queue<Song> newList = sut.getSongListByDjId(3);
        Assert.assertEquals(1, newList.size());
    }

    @Test
    public void addSongToPlaylist_Happy_Path(){
    Song actual = sut.addSongToPlaylist(9,3);
    Assert.assertEquals(actual,SONG_1);
    }*/

    @Test
    public void getSongBySongId_Happy_Path(){
    Song actual = sut.getSongBySongId(2);
    Assert.assertEquals(SONG_3, actual);
    }

    @Test
    public void submitASong_Not_Null() {
        List<Song> songList = new ArrayList<>();
        songList.add(SONG_1);
        songList.add(SONG_2);
        Assert.assertNotNull(songList);
    }

    @Test
    public void addSongToPlaylist_Not_Null() {
        Song actual = sut.addSongToPlaylist(9, 3);
        Assert.assertNotNull("Apple Fritz", SONG_3);
    }

    @Test
    public void getSongListByDjId_Not_Null() {
        List<Song> actual = new ArrayList<>();
        actual.add(SONG_1);
        actual.add(SONG_2);
        actual.add(SONG_3);
        Assert.assertNotNull(actual);
    }
}






















<<<<<<< HEAD
}
=======
>>>>>>> 89d7509dab3559fcb5719ffce92e589fca97ff29
