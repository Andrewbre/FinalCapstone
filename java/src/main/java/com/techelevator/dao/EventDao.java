package com.techelevator.dao;

import com.techelevator.model.Event;

import java.util.List;

public interface EventDao {

    List<Event> getAllEvents();

    Event getEventsByEventId(int eventId);

    List<Event>getEventsByDjId (int djId);

    Event getEventByHostId (int userId);

    Event getEventsByEventName(String eventName);

    Integer createEvent(String eventName, String eventInformation,
                        String streetAddress, String city, String state);

    boolean updatedEvent(int eventId, boolean eventStatus, String eventInformation);

    boolean addGenreToEvent(int eventId);
}
