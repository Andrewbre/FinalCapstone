package com.techelevator.dao;

import com.techelevator.model.Event;
import com.techelevator.model.Genre;
import com.techelevator.model.User;

import java.util.List;

public interface EventDao {

    List<Event> getAllEvents();

    Event getEventsByEventId(int eventId);

    List<Event>getEventsByDjId (int djId);

    Event getEventByHostId (int userId);

    boolean createEvent(int djId, List<User> hosts, String eventName);

    public int getHostIdByUsername(String username);

    boolean updatedEventStatus(int eventId);

    List<Integer> addGenresToEvent(List<Integer> genreList, int eventId);

    Event updatedEventInformation(int event_id, String information);


}
