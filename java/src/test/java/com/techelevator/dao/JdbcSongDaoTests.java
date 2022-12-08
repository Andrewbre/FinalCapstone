package com.techelevator.dao;

import com.techelevator.dao.BaseDaoTests;
import com.techelevator.dao.JdbcEventDao;
import com.techelevator.dao.JdbcSongsDao;
import com.techelevator.model.Event;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class JdbcSongDaoTests extends BaseDaoTests {

    private JdbcSongsDao sut;


    @Before
    public void setup() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        sut = new JdbcSongsDao(jdbcTemplate);


    }


}