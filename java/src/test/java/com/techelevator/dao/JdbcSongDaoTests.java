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


    private static final Song SONG_1 = new Song (1, 2,"Abba Jabba", "Cher",1,7);
    private static final Song SONG_2 = new Song(2,4, "Gin and Juice", "Snoop Dog",2,7);
    private static final Song SONG_3 = new Song(3,5, "Apple Fritz","Jimmy Buffet",3,9 );




    private JdbcSongsDao sut;



    //@Before
    //public void setup() {
     //   JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
     //   sut = new JdbcSongsDao(jdbcgit 