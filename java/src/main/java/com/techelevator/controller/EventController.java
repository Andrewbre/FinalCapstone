package com.techelevator.controller;

import com.techelevator.dao.EventDao;
import com.techelevator.dao.UserDao;
import com.techelevator.model.Event;
import com.techelevator.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@PreAuthorize("isAuthenticated()")
public class EventController {

private EventDao eventDao;
private UserDao userDao;


    public EventController(EventDao eventDao) {
        this.eventDao = eventDao;
    }


    @RequestMapping(path = "/events", method = RequestMethod.GET)
    public List<Event> getEveryEvent(){
        return eventDao.getAllEvents();
    }
    @RequestMapping(path = "/events/{id}", method = RequestMethod.GET)
    public Event getEventsEventId(@PathVariable int eventId){
        return eventDao.getEventsByEventId(eventId);
    }
    @RequestMapping(path = "/events/dj/{id}", method = RequestMethod.GET)
    public List<Event> getEventsDjId(){
        return eventDao.getEventsByDjId();
    }
    @RequestMapping(path = "/events/host/{id}", method = RequestMethod.GET)
    public Event getEventHostId(@PathVariable int userId){
        return eventDao.getEventByHostId(userId);
    }

//
//    @ResponseStatus(HttpStatus.CREATED)
//    @RequestMapping(path = "/events", method = RequestMethod.POST)
//    public boolean createEvent(@RequestBody Event event, User user){
//        return eventDao.create(event.getDjId(), user.get);
//    }
    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping(path = "/events", method = RequestMethod.PUT)
    public boolean updatedEventStat(@PathVariable int eventId, @RequestBody EventDao eventDao) {
        return false;
    }
    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping(path = "/events", method = RequestMethod.PUT)
    public boolean updatedEventInfo(@PathVariable int event_id, @RequestBody EventDao eventDao) {
        return true;
    }}

//GET - getAllEvents ----
//GET - getEventsByEventId ---
//GET - getEventByDJId(?)---
//GET - getEventByHostId(?)--
//POST - createEvent--
//PUT - enabledOrDisabled
//PUT - updateEvent--