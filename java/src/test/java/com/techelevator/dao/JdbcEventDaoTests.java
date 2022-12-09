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
import java.util.List;

public class JdbcEventDaoTests extends BaseDaoTests {

    private JdbcEventDao sut;
    private Event testEvent;
    UserDao userDao;
    SongsDao songsDao;
    GenreDao genreDao;

    @Before
    public void setup() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        sut = new JdbcEventDao(jdbcTemplate);

    }
}


    @Test
    public void getAllEvents_not_null() {
        List<Event> actual = sut.getAllEvents();
        Assert.assertNotNull(actual);
        Assert.assertEquals(3, actual.size());
        Assert.assertEquals(EVENT_1, actual.get(0));
        Assert.assertEquals(EVENT_2, actual.get(1));
        Assert.assertEquals(EVENT_3, actual.get(2));
    }
}
    /*Test
    public void getEventsByEventId_not_null() {
        Event actual = sut.getEventsByEventId(2);
        Assert.assertNotNull(actual);
    }
*/
//    @Test
//    public void getEventsByDjId() {
//        List<Event> actual = sut.getEventsByDjId();
//        Assert.assertNotNull(actual);
//
//    }
//    @Test
//    public void createNewEvent_new_id_not_null() {
//
//        Event testEvent = new Event();
//        testEvent.
//        testTransfer.setTransferType("Send");
//        testTransfer.setUserFrom(USER_1.getId());
//        testTransfer.setUserTo(USER_2.getId());
//        Transfer createdTransfer = sut.createNewTransfer(testTransfer); //create Java Object
//        int newId = createdTransfer.getTransferId(); //get primary key from object returned to us
//        Assert.assertTrue(newId > 0); // validate, no longer 0
//
//    }
//
//    @Test
//    public void updateEvent_not_null() {
//        Transfer updatedTransfer = sut.getTransferById(1);
//        updatedTransfer.setAmount(BigDecimal.valueOf(740.00));
//        updatedTransfer.setUserTo(USER_2);
//        updatedTransfer.setTransferStatus("Pending");
//        updatedTransfer.setTransferType("Request");
//
//        Assert.assertNotNull(updatedTransfer);
//
//    }
//
//    @Test
//    public void getTransferById_Happy_Path() {
//        Transfer actual = sut.getTransferById(1);
//        assertTransfersEqual(TRANSFER_1, actual);
//    }
//
//    @Test
//    public void createTransfer_Happy_Path() {
//        NewTransferDto input = new NewTransferDto();
//        input.setUserTo(3);
//        input.setUserFrom(2);
//        input.setTransferType("Send");
//        input.setAmount(new BigDecimal("10.00"));
//        Transfer expected = new Transfer();
//        expected.setUserTo(USER_3);
//        expected.setUserFrom(USER_2);
//        expected.setTransferStatus("Approved");
//        expected.setTransferType("Send");
//        expected.setAmount(new BigDecimal("10.00"));
//
//        Transfer output = sut.createNewTransfer(input);
//
//        Assert.assertNotEquals(0, output.getTransferId());
//        expected.setTransferId(output.getTransferId());
//
//        assertTransfersEqual(expected, output);
//
//    }
//
//    @Test
//    public void getAllTransfersByUserId_Happy_Path() {
//
//        List<Transfer> actual = sut.getAllTransfersByUserId(1);
//        Assert.assertEquals(2, actual.size());
//
//        assertTransfersEqual(TRANSFER_1, actual.get(0));
//        assertTransfersEqual(TRANSFER_2, actual.get(1));
//    }
//
//    @Test
//    public void transfer_zero() {
//        Transfer input = sut.getTransferById(3);
//        input.setAmount(BigDecimal.valueOf(0.00));
//
//        Assert.assertNotSame(input.getAmount(), TRANSFER_3.getAmount());
//
//    }
//
//    private void assertTransfersEqual(Event testEvent, Event actualEvent) {
//        Assert.assertEquals(expectedTransfer.getAmount(), actualTransfer.getAmount());
//        Assert.assertEquals(expectedTransfer.getTransferStatus(), actualTransfer.getTransferStatus());
//        Assert.assertEquals(expectedTransfer.getTransferType(), actualTransfer.getTransferType());
//        Assert.assertEquals(expectedTransfer.getUserFrom().getId(), actualTransfer.getUserFrom().getId());
//        Assert.assertEquals(expectedTransfer.getUserTo().getId(), actualTransfer.getUserTo().getId());
//    }
//
//}
//}