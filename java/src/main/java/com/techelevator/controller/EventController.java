package com.techelevator.controller;

import com.techelevator.dao.EventDao;
import com.techelevator.dao.UserDao;
import com.techelevator.model.Event;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@PreAuthorize("isAuthenticated()")
@RequestMapping("/api/")
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
    public Event getEventByHostId(@PathVariable int userId){
        return eventDao.getEventByHostId(userId);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/api/events", method = RequestMethod.POST)
    public boolean createEvent(@PathVariable int eventId, @RequestBody EventDao eventDao){
        return eventDao.create(eventId);
    }
    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping(path = "/api/events", method = RequestMethod.PUT)
    public boolean updatedEventStatus(@PathVariable int eventId, @RequestBody EventDao eventDao) {
        return false;
    }
    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping(path = "/api/events", method = RequestMethod.PUT)
    public boolean updatedEventInformation(@PathVariable int event_id, @RequestBody EventDao eventDao) {
        return true;
    }}

//GET - getAllEvents ----
//GET - getEventsByEventId ---
//GET - getEventByDJId(?)---
//GET - getEventByHostId(?)--
//POST - createEvent--
//PUT - enabledOrDisabled
//PUT - updateEvent--