package com.techelevator.controller;

import com.techelevator.dao.EventDao;
import com.techelevator.dao.UserDao;
import com.techelevator.model.Event;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin

public class EventController {

private EventDao eventDao;
private UserDao userDao;


    public EventController(EventDao eventDao) {
        this.eventDao = eventDao;
    }


    @RequestMapping(path = "/api/events", method = RequestMethod.GET)
    public List<Event> getAllEvents(){
        return eventDao.getAllEvents();
    }
    @RequestMapping(path = "/api/events/{id}", method = RequestMethod.GET)
    public Event getEventsByEventId(int eventId){
        return eventDao.getEventsByEventId(eventId);
    }
    @RequestMapping(path = "/api/events/dj/{id}", method = RequestMethod.GET)
    public List<Event> getEventsByDjId(){
        return eventDao.getEventsByDjId();
    }
    @RequestMapping(path = "/api/events/host/{id}", method = RequestMethod.GET)
    public Event getEventByHostId(int userId){
        return eventDao.getEventByHostId(userId);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/api/events", method = RequestMethod.POST)
    public boolean createEvent(int eventId){
        return eventDao.create(eventId);
    }
    @RequestMapping(path = "/api/events", method = RequestMethod.PUT)
    public boolean updatedEventStatus(int eventId) {
        return false;
    }
    @RequestMapping(path = "/api/events", method = RequestMethod.PUT)
    public boolean updatedEventInformation(int event_id) {
        return true;
    }
    //@RequestMapping(path = "/api/events", method = RequestMethod.PUT)
    //public boolean updatedEventInformation(Event event, int eventId) {
       //return eventDao.updatedEventInformation(event, eventId);
    //}
}
//GET - getAllEvents ----
//GET - getEventsByEventId ---
//GET - getEventByDJId(?)---
//GET - getEventByHostId(?)--
//POST - createEvent--
//PUT - enabledOrDisabled
//PUT - updateEvent--