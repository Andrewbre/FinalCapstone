package com.techelevator.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    @RequestMapping(path = "/events/host/{hostId}", method = RequestMethod.GET)//fix
    public Event getEventHostId(@PathVariable int hostId){
        return eventDao.getEventByHostId(hostId);
    }

    @ResponseStatus(HttpStatus.CREATED)//fix
    @RequestMapping(path = "/events/create", method = RequestMethod.POST)
    public boolean createEvent(int djId, List<Integer> hostIds, String event_name){
        return eventDao.createEvent(djId, hostIds, event_name);

    }
    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping(path = "/events/{eventId}", method = RequestMethod.PUT)
    public boolean updatedEventStatus(@PathVariable int eventId, boolean eventStatus) {
        return eventDao.updatedEventStatus(eventId, eventStatus);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)   //have to change to just put string value
    @RequestMapping(path = "/events/information/{eventId}", method = RequestMethod.PUT)
    public boolean updatedEventInformation(@PathVariable int eventId, @RequestBody String eventInformation) {
        return eventDao.updatedEventInformation(eventId, eventInformation);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)   //TODO test if working - Ij
    @RequestMapping(path = "/events/{eventId}/{genreId}", method = RequestMethod.POST)
    public boolean addGenreToEventId(@PathVariable int eventId, @PathVariable int genreId) {
        return eventDao.addGenreToEvent(genreId, eventId);
    }
}

