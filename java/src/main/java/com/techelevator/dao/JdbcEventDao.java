package com.techelevator.dao;

import com.techelevator.model.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;



@Component
public class JdbcEventDao implements EventDao {

    private final JdbcTemplate jdbcTemplate;
    UserDao userDao;
    SongsDao songsDao;

    public JdbcEventDao(JdbcTemplate jdbcTemplate, UserDao userDao, SongsDao songsDao) {
        this.jdbcTemplate = jdbcTemplate;
        this.userDao = userDao;
        this.songsDao = songsDao;
    }

    @Override
    public List<Event> getAllEvents() {
        List<Event> eventList = new ArrayList<>();

        SqlRowSet results = jdbcTemplate.queryForRowSet("" +
                "SELECT event_id, dj_id, event_name, information " +
                "FROM event " +
                "ORDER BY event_name ASC;");
        while (results.next()) {
            eventList.add(mapRowToEvent(results));
        }
        return eventList;
    }

    @Override
    public Event getEventsByEventId(int eventId) {

        String sql = "SELECT event_id, dj_id, event_name, information, host_id " +
                "FROM event " +
                "WHERE event_id =?; ";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, eventId);

        if (results.next()) {
            return mapRowToEvent(results);
        } else {
            return null;
        }
    }

    public int getHostIdByUsername(String username){
        return 1;
    }

    @Override
    public List<Event> getEventsByDjId() {
        List<Event> EventsByDJList = new ArrayList<>();

        SqlRowSet results = jdbcTemplate.queryForRowSet("" +
                "SELECT event_id, dj_id, event_name, information " +
                "FROM event " +
                "WHERE dj_id =?;");
        while (results.next()) {
            EventsByDJList.add(mapRowToEvent(results));
        }

        return EventsByDJList;
    }

    @Override
    public Event getEventByHostId(int hostId) {

        String sql = "SELECT event_id, dj_id, event_name, information " +
                "FROM event e JOIN event_host h on e.event_id=h.event_id" +
                "WHERE host_id = ?;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, hostId);

        if (results.next()) {
            return mapRowToEvent(results);
        } else {
            return null;
        }
    }

    @Override
    public boolean createEvent(int djId, List<User> hosts, String eventName) {
        String sql = "" +
                "INSERT INTO event (event_name, dj_id) " +
                "VALUES (?,?) RETURNING event_id;" ;
        Integer newEventId = jdbcTemplate.queryForObject(sql, Integer.class, eventName, djId);
        for(User host : hosts) {
            String sqlAddHost = "" +
                    "INSERT INTO event_host (event_id, host_id) " +
                    "VALUE (?,?);";
            SqlRowSet newEvent = jdbcTemplate.queryForRowSet(sqlAddHost, newEventId,host);
        }
        return newEventId!=null;
    }

    //TODO: need create event_status column in event table
    @Override
    public boolean updatedEventStatus(int eventId) {
        return false;
    }

    @Override
    public void addGenresToEvent(List<Genre> genreList, int eventId) {
        for(Genre genre: genreList) {
            String sql = "INSERT INTO event_genre (genre_id, event_id)" +
                    "VALUES (?,?); ";
            jdbcTemplate.queryForObject(sql, Integer.class, genre.getGenreId(), eventId);
        }
    }


  @Override
  public void updatedEventInformation(int eventId, String information) {

        String sql = "UPDATE event " +
                "SET information = ? " +
                "WHERE event_id = ?;";

      jdbcTemplate.update(sql, information, eventId);

    }

    private Event mapRowToEvent(SqlRowSet rowSet) {
        Event event = new Event();

        event.setEventId(rowSet.getInt("event_id"));
        event.setDjId(rowSet.getInt("user_id"));
        event.setEventName(rowSet.getString("event_name"));
        event.setEventInformation(rowSet.getString("information"));

        return event;
    }
}
