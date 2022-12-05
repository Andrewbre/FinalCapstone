package com.techelevator.dao;

import com.techelevator.model.Event;

import java.util.List;

public interface EventDao {

    List<Event> getAllEvents();

    Event getEventsByEventId(int eventId);

    List<Event>getEventsByDjId ();

    Event getEventByHostId (int userId);

    boolean create(int eventId);

    boolean updatedEventStatus(int eventId);

    boolean updatedEventInformation(int event_id);

}
