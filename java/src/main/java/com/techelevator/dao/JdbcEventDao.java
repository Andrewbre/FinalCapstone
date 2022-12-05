package com.techelevator.dao;

import com.techelevator.model.Event;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;




public class JdbcEventDao implements EventDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcEventDao(DataSource datasource) {
        this.jdbcTemplate = new JdbcTemplate(datasource);
    }
    @Override
    public List<Event> getAllEvents() {
        List<Event> eventList = new ArrayList<>();

        String sql = "SELECT event_id, dj_id, event_name, information" +
                "FROM event" +
                "ORDER BY event_id ASC;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while (results.next()) {
            eventList.add(mapRowToEvent(results));
        }

        return eventList;
    }

    @Override
    public Event getEventsByEventId(int eventId) {
        return null;
    }

    @Override
    public Event getEventsByDjId(int userId) {
        return null;
    }

    @Override
    public Event getEventByHostId(int userId) {
        return null;
    }

    @Override
    public boolean create(int eventId) {
        return false;
    }

    @Override
    public boolean updatedEventStatus(int eventId) {
        return false;
    }

    @Override
    public boolean updatedEventInformation(int event_id) {
        return false;
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
