package com.techelevator.controller;

import com.techelevator.dao.EventDao;
import com.techelevator.dao.UserDao;
import com.techelevator.model.Event;
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
    //GET - getAllEvents ----
    //GET - getEventsByEventId ---
   //GET - getEventByDJId(?)---
    //GET - getEventByHostId(?)
    //POST - createEvent--
    //PUT - enabledOrDisabled
    //PUT - updateEvent


    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<Event> getAllEvents(){
        return eventDao.getAllEvents();
    }

   // @RequestMapping(path = "", method = RequestMethod.GET)
    //public Event getEventById(){
        //return eventDao.getEventsByEventId();
    //}

    @RequestMapping(path = "", method = RequestMethod.GET)
    public Event getEventsByEventId(){
        return eventDao.getEventsByEventId();
    }
    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<Event> getEventsByDjId(){
        return eventDao.getEventsByDjId();
    }
    @RequestMapping(path = "", method = RequestMethod.POST)
    public Event createEvent(){
        return eventDao.create();
    }


}
