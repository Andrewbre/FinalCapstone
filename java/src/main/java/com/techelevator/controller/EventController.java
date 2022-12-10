package com.techelevator.controller;

import com.techelevator.dao.*;
import com.techelevator.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@PreAuthorize("isAuthenticated()")
public class EventController {

    private EventDao eventDao;

    public EventController(EventDao eventDao) {
        this.eventDao = eventDao;
    }


    @RequestMapping(path = "/events", method = RequestMethod.GET)
    public List<Event> getAllEvents(){
        return eventDao.getAllEvents();
    }
    @RequestMapping(path = "/events/{eventId}", method = RequestMethod.GET)
    public Event getEventsEventId(@PathVariable int eventId){
        return eventDao.getEventsByEventId(eventId);
    }
    @RequestMapping(path = "/events/dj/{djId}", method = RequestMethod.GET)
    public List<Event> getEventsDjId(@PathVariable int djId){
        return eventDao.getEventsByDjId(djId);
    }
    @RequestMapping(path = "/events/host/{hostId}", method = RequestMethod.GET)
    public Event getEventHostId(@PathVariable int hostId){
        return eventDao.getEventByHostId(hostId);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/events/", method = RequestMethod.POST)
    public boolean createEvent(int djId, List<User> host, String event_name, @RequestBody NewEventDto newEventDto){
        return eventDao.createEvent(djId, host, event_name);

    }
    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping(path = "/events/status/{eventId}", method = RequestMethod.PUT)
    public boolean updatedEventStatus(@PathVariable int eventId, @RequestBody NewEventDto newEventDto) {
        return eventDao.updatedEventStatus(eventId);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping(path = "/events/information/{eventId}", method = RequestMethod.PUT)
    public Event updatedEventInformation(@PathVariable int eventId, String information) {
        return eventDao.updatedEventInformation(eventId, information);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/events/{eventId}", method = RequestMethod.POST)
    public List<Genre> addGenreToEventId(List<Genre> genreList, @PathVariable int eventId) {
        return eventDao.addGenresToEvent(genreList, eventId);
    }
}

