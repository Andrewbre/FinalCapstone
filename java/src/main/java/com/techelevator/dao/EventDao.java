package com.techelevator.dao;

import com.techelevator.model.Event;
import com.techelevator.model.Genre;
import com.techelevator.model.User;

import java.util.List;

public interface EventDao {

    List<Event> getAllEvents();

    Event getEventsByEventId(int eventId);

    List<Event>getEventsByDjId ();

    Event getEventByHostId (int userId);

    boolean createEvent(int djId, List<User> hosts, String eventName);

    public int getHostIdByUsername(String username);

    boolean updatedEventStatus(int eventId);

    void addGenresToEvent(List<Genre> genreList, int eventId);

    void updatedEventInformation(int event_id, String information);

}
