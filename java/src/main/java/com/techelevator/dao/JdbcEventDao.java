package com.techelevator.dao;

import com.techelevator.model.Event;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;



@Component
public class JdbcEventDao implements EventDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcEventDao(DataSource datasource) {
        this.jdbcTemplate = new JdbcTemplate(datasource);
    }

    @Override
    public List<Event> getAllEvents() {
        List<Event> eventList = new ArrayList<>();

        String sql = "SELECT event_id, dj_id, event_name, information " +
                "FROM event " +
                "ORDER BY event_id ASC;"; //TODO Should this order by event_name?

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while (results.next()) {
            eventList.add(mapRowToEvent(results));
        }
        return eventList;
    }

    @Override
    public Event getEventsByEventId(int eventId) {

        String sql = "SELECT event_id, dj_id, event_name, information, host_id " +
                "FROM event " +
                "WHERE event_id =?;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, eventId);

        if (results.next()) {
            return mapRowToEvent(results);
        } else {
            return null;
        }
    }

    @Override
    public List<Event> getEventsByDjId() {
        List<Event> EventsByDJList = new ArrayList<>();

        String sql = "SELECT event_id, dj_id, event_name, information " +
                     "FROM event " +
                     "WHERE dj_id =?;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
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
    public boolean create(int djId, int hostId) {
        String sql = "INSERT INTO event (dj_id, event_name, information) " +
                "VALUES (?, ?, ?, ?) RETURNING event_id;";
        Integer newEventId = jdbcTemplate.queryForObject(sql, Integer.class);
        String sql2 = "INSERT INTO event_host (event_id, host_id) " +
                "VALUES (?,?);";
        Integer results = jdbcTemplate.queryForObject(sql2, Integer.class, newEventId,hostId);
        return results != null;
    }

    //TODO: need create event_status column in event table
    @Override
    public boolean updatedEventStatus(int eventId) {
        return false;
    }

<<<<<<< HEAD
    @Override
    public boolean updatedEventInformation(int eventId) {
        return false;
    }
//  @Override
//  public boolean updatedEventInformation(Event event, int eventId) {
=======
>>>>>>> f61d274e57669090eec8e88567fbba22c6a7c9f6

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
