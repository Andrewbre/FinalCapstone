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

    public int getHostIdByUsername(String username);

    boolean updatedEventStatus(int eventId, boolean eventStatus);

    List<Genre> addGenresToEvent(List<Integer> genreList, int eventId);

    boolean updatedEventInformation(int event_id, String information);



}
