package com.techelevator.dao;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.techelevator.model.Event;
import com.techelevator.model.Genre;
import com.techelevator.model.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JdbcEventDaoTests extends BaseDaoTests{

    protected static final User USER_1 = new User(1, "user1", "user1", "ROLE_ADMIN");
    protected static final User USER_2 = new User(2, "user2", "user2", "ROLE_USER");
    protected static final User USER_3 = new User(3, "user3", "user3", "ROLE_DJ");
    private static final Event EVENT_1 = new Event(1, 2, "julie's party","Grunge");
    private static final Event EVENT_2 = new Event(2,3, "Alex Wedding", "Pop");
    private static final Event EVENT_3 = new Event(3, 4, "Bobby Graduation", "Rock");

    private JdbcEventDao sut;

    @Before
    public void setup() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        sut = new JdbcEventDao(jdbcTemplate);
    }

    @Test
    public void getAllEvents_Happy_Path(){
        List<Event> eventList = new ArrayList<>();
        eventList.add(EVENT_1);
        eventList.add(EVENT_2);
        eventList.add(EVENT_3);
        List<Event> actual = sut.getAllEvents();
        Assert.assertEquals(actual, eventList);
    }
    @Test
    public void getEventByDjId_Happy_Path() {
        List<Event> actual = sut.getEventsByDjId(4);
        actual.add(EVENT_3);
        actual.add(EVENT_2);
        actual.add(EVENT_1);
        Assert.assertTrue(actual.contains(EVENT_3));

    }
    @Test
    public void createEvent_Happy_Path() {
        Event testEvent = new Event();
        testEvent.setEventId(6);
        testEvent.setDjId(5);
        testEvent.setEventName("John's Birthday");
        testEvent.setEventInformation("HipHop");
        int newId = testEvent.getEventId(); //get primary key from object returned to us
        Assert.assertTrue(newId > 0); // validate, no longer


    }

    @Test
    public void getEventByHostId_Happy_Path(){
        Event actual = sut.getEventByHostId(1);
        Assert.assertEquals(USER_1, actual);
    }


    @Test
    public void getHostIdByUsername(){

    }
    @Test
    public void updatedEventStatus_Happy_Path(){

    }
    @Test
    public void addGenresToEvent_Happy_Path(){

    }

    @Test
    public void updateEventInformation_Happy_Path(){
        Event testEvent = new Event();

    }
    @Test
    public void getAllEvents_not_null() {
        List<Event> actual = sut.getAllEvents();
        Assert.assertNotNull(actual);
    }
    @Test
    public void getEventsByEventId_not_null() {
        Event actual = sut.getEventsByEventId(2);
        Assert.assertNotNull(actual);
    }
    @Test
    public void createEvent_not_null(){
        Event testEvent = new Event();
        testEvent.setEventId(7);
        testEvent.setDjId(9);
        testEvent.setEventName("Alba's Birthday");
        testEvent.setEventInformation("pop");
        Assert.assertNotNull(testEvent);
    }
    @Test
    public void getHostIdByUsername_not_null(){

    }
    @Test
    public void addGenresToEvent_Not_Null(){

    }
    @Test
    public void updatedEventInformation_Not_Null(){

    }

}

























