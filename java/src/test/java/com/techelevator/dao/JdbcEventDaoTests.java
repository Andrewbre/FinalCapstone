package com.techelevator.dao;

import com.techelevator.model.Event;
import com.techelevator.model.Genre;
import org.junit.Before;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class JdbcEventDaoTests extends BaseDaoTests{
    private JdbcEventDao sut;
    private Event testEvent;

    @Before
    public void setup() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        sut = new JdbcEventDao(dataSource, new JdbcEventDao(JdbcTemplate));


    }
}
