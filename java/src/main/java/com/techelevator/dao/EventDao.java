package com.techelevator.dao;

import com.techelevator.model.Event;
import com.techelevator.model.Genre;
import com.techelevator.model.NewEventDto;

import java.util.List;

public interface EventDao {

    List<Event> getAllEvents();

    Event getEventsByEventId(int eventId);

    List<Event>getEventsByDjId (int djId);

    Event getEventByHostId (int userId);

    Event getEventsByEventName(String eventName);

    int getHostIdByUsername(String username);

    boolean createEvent(String eventName, String eventInformation);

    boolean updatedEvent(int eventId, boolean eventStatus, String eventInformation);

    boolean addGenreToEvent(int genreId, int eventId);
}
