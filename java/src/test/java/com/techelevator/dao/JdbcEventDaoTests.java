package com.techelevator.dao;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.techelevator.model.Event;
import com.techelevator.model.Genre;
import com.techelevator.model.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
<<<<<<< HEAD

import java.util.ArrayList;
=======
>>>>>>> 5ec7bff7e13686d7a1029885c26556a35e3b8e6b
import java.util.List;
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = TestingDatabaseConfig.class)
public class JdbcEventDaoTests extends BaseDaoTests{

    private static final User USER_1 = new User(1, "user","$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC","ROLE_USER");
    private static final User USER_2 = new User(2, "admin","$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC","ROLE_ADMIN");
    private static final User USER_3 = new User(3, "dj1","$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC","ROLE_DJ");
    private static final User USER_4 = new User(4, "dj2","$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC","ROLE_DJ");
    private static final User USER_5 = new User(5, "host1","$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC","ROLE_HOST");
    private static final User USER_6 = new User(6, "host2","$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC","ROLE_HOST");

    private static final Event EVENT_1 = new Event(1, 2, "Yeet","Some party info",true);
    private static final Event EVENT_2 = new Event(2,3, "Alex Wedding", "Goof Not Balling",true);
    private static final Event EVENT_3 = new Event(3, 4,"Bobby's Graduation", "New Time",false);





    private JdbcEventDao sut;
    private Event testEvent;

    @Before
    public void setup() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        sut = new JdbcEventDao(jdbcTemplate);


    }

    @Test
    public void getAllEvents_Happy_Path(){
        List<Event> actual = sut.getAllEvents();
        Assert.assertNotNull(actual);
        Assert.assertEquals(3, actual.size());
        Assert.assertEquals(EVENT_1, actual.get(0));
        Assert.assertEquals(EVENT_2, actual.get(1));
        Assert.assertEquals(EVENT_3, actual.get(2));
    }
    @Test
    public void getEventByDjId_Happy_Path() {
        List<Event> actual = sut.getEventsByDjId(4);
        Assert.assertTrue(actual.contains(EVENT_3));

    }
    @Test
    public void createEvent_Happy_Path() {
        Event testEvent = new Event();
        testEvent.setEventId(6);
        testEvent.setDjId(5);
        testEvent.setEventName("John's Birthday");
        testEvent.setEventInformation("Good Times");
        int newId = testEvent.getEventId(); //get primary key from object returned to us
        Assert.assertTrue(newId > 0); // validate, no longer

    }

//    @Test
//    public void getEventByHostId_Happy_Path(){
//        List<User> eventUsers = new ArrayList<>();
//        eventUsers.add(USER_5);
//
//
//    Event actual = sut.getEventByHostId(5);
//    Assert.assertEquals(eventUsers.contains(USER_5), actual);
//    }

//    @Test
//    public void updateEventInformation_Happy_Path(){
//        Event testEvent = sut.updatedEventInformation(2,"Goof Not Balling");
//        CheckEventEquals(testEvent, EVENT_2);
//
//    }



    @Test
    public void getAllEvents_not_null() {
        List<Event> actual = sut.getAllEvents();
        Assert.assertNotNull(actual);
        Assert.assertEquals(3, actual.size());
        Assert.assertEquals(EVENT_1, actual.get(0));
        Assert.assertEquals(EVENT_2, actual.get(1));
        Assert.assertEquals(EVENT_3, actual.get(2));
    }

    private void CheckEventEquals(Event actual, Event expected) {
        Assert.assertEquals(actual.getDjId(),expected.getDjId());
        Assert.assertEquals(actual.getEventId(), expected.getDjId());
        Assert.assertEquals(actual.getEventName(), expected.getEventInformation());

    }
}
//    private void assertTransfersEqual(Event testEvent, Event actualEvent) {
//        Assert.assertEquals(expectedTransfer.getAmount(), actualTransfer.getAmount());
//        Assert.assertEquals(expectedTransfer.getTransferStatus(), actualTransfer.getTransferStatus());
//        Assert.assertEquals(expectedTransfer.getTransferType(), actualTransfer.getTransferType());
//        Assert.assertEquals(expectedTransfer.getUserFrom().getId(), actualTransfer.getUserFrom().getId());
//        Assert.assertEquals(expectedTransfer.getUserTo().getId(), actualTransfer.getUserTo().getId());
//    }
