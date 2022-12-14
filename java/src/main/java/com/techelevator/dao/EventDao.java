package com.techelevator.dao;

import com.techelevator.model.Event;
import com.techelevator.model.Genre;

import java.util.List;

public interface EventDao {

    List<Event> getAllEvents();

    Event getEventsByEventId(int eventId);

    List<Event>getEventsByDjId (int djId);

    Event getEventByHostId (int userId);

    boolean createEvent(int djId, List<Integer> hostIds, String eventName);

    Event getEventsByEventName(String eventName);

    int getHostIdByUsername(String username);

    boolean updatedEventStatus(int eventId, boolean eventStatus);

    boolean addGenreToEvent(int genreId, int eventId);

    boolean updatedEventInformation(int event_id, String information);



}
