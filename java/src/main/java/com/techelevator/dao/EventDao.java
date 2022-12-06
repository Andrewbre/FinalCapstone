package com.techelevator.dao;

import com.techelevator.model.Event;

import java.util.List;

public interface EventDao {

    List<Event> getAllEvents();

    Event getEventsByEventId(int eventId);

    List<Event>getEventsByDjId ();

    Event getEventByHostId (int userId);

    boolean create(int eventId, int djId);

    boolean updatedEventStatus(int eventId);

    void updatedEventInformation(int event_id, String information);

}
