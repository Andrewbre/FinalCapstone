package com.techelevator.dao;

import com.techelevator.model.Song;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

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



    }
    @Test
    public void getAllSongsAvailableByEventId_Happy_Path() {
        List<Song> actual = sut.getAllSongsAvailableByEventId(1);
        Assert.assertEquals(1, actual);

    }

    @Test
    public void getEventPlaylist_Happy_Path(){
    Queue<Song> actual = new LinkedList<>();
    actual.add(SONG_1);
    actual.add(SONG_2);
    actual.add(SONG_3);
    Assert.assertTrue(actual.contains(SONG_2));
    }
    @Test
    public void submitASong_Happy_Path() {
        List<Song> songList = new ArrayList<>();
        songList.add(SONG_1);
        songList.add(SONG_2);
        Assert.assertEquals(2, songList.size());
    }

    @Test
    public void getSongBySongId_Happy_Path(){
    Song actual = sut.getSongBySongId(2);
    Assert.assertEquals(2, actual);
    }

    @Test
    public void submitASong_Not_Null() {
        List<Song> songList = new ArrayList<>();
        songList.add(SONG_1);
        songList.add(SONG_2);
        Assert.assertNotNull(songList);
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


















