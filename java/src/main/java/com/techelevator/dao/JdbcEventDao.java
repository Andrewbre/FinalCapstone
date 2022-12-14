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
    JdbcUserDao jdbcUserDao;
    JdbcSongsDao jdbcSongsDao;
    JdbcGenreDao jdbcGenreDao;

    public JdbcEventDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.jdbcUserDao =  new JdbcUserDao(jdbcTemplate);
        this.jdbcSongsDao = new JdbcSongsDao(jdbcTemplate);
        this.jdbcGenreDao = new JdbcGenreDao(jdbcTemplate);
    }



    @Override
    public List<Event> getAllEvents() {
        List<Event> eventList = new ArrayList<>();

        SqlRowSet results = jdbcTemplate.queryForRowSet("" +
                "SELECT event_id, dj_id, event_name, information, event_status " +
                "FROM event " +
                "ORDER BY event_name ASC;");
       try {
           while (results.next()) {
               eventList.add(mapRowToEvent(results));
           }
       } catch (Exception e) {
           System.out.println(" Error occurred - can't locate list of events");
       }
        return eventList;
    }

    @Override
    public Event getEventsByEventId(int eventId) {

        String sql = "SELECT event_id, dj_id, event_name, information, event_status " +
                "FROM event " +
                "WHERE event_id = ?; ";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, eventId);

        if (results.next()) {
            return mapRowToEvent(results);
        } else {
            return null;
        }
    }

    @Override
    public Event getEventsByEventName(String eventName) {

        String sql = "SELECT event_id, dj_id, event_name, information, event_status " +
                "FROM event " +
                "WHERE event_name = ?; ";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, eventName);

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
    public List<Event> getEventsByDjId(int djId) {
        List<Event> EventsByDJList = new ArrayList<>();
        String sql = "SELECT event_id, dj_id, event_name, information " +
                "FROM event " +
                "WHERE dj_id = ?;";

        try {

            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, djId);
            while (results.next()) {
                EventsByDJList.add(mapRowToEvent(results));
            }
        } catch (Exception e) {
            System.out.println("Error occurred - unable to retrieve events filtered by DJ");
        }
        return EventsByDJList;
    }

    @Override
    public Event getEventByHostId(int hostId) {

        String sql = "SELECT event_id, dj_id, event_name, information " +
                "FROM event e JOIN event_host h on e.event_id=h.event_id " +
                "WHERE host_id = ?;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, hostId);

        if (results.next()) {
            return mapRowToEvent(results);
        } else {
            return null;
        }
    }

    @Override
    public boolean createEvent(int djId, List<Integer> hostIds, String eventName) {
        String sql = "" +
                "INSERT INTO event (event_name, dj_id) " +
                "VALUES (?,?) RETURNING event_id;";

        Integer newEventId = null;
        try {
            newEventId = jdbcTemplate.queryForObject(sql, Integer.class, eventName, djId);
            for (Integer host : hostIds) {
                String sqlAddHost = "" +
                        "INSERT INTO event_host (event_id, host_id) " +
                        "VALUE (?,?);";
                jdbcTemplate.queryForRowSet(sqlAddHost, newEventId, host);
            }
        } catch (Exception e) {
            System.out.println("Error occurred - can't create a new event");
        }
        return newEventId != null;
    }

    @Override
    public boolean updatedEvent(int eventId, boolean eventStatus, String eventInformation){
        String sql = "UPDATE event " +
                "SET event_status = ?, information = ? " +
                "WHERE event_id = ?;";
        int updateStatus = jdbcTemplate.update(sql, eventStatus, eventInformation, eventId);

        return (updateStatus == 1);

    }


    @Override
    public boolean addGenreToEvent(int genreId, int eventId) {

            String sql = "INSERT INTO event_genre (genre_id, event_id)" +
                    "VALUES (?,?); ";

               int updateSuccess = jdbcTemplate.queryForObject(sql, Integer.class, genreId, eventId);

           return updateSuccess == 1;

    }



    private Event mapRowToEvent(SqlRowSet rowSet) {
        Event event = new Event();

        event.setEventId(rowSet.getInt("event_id"));
        event.setDjId(rowSet.getInt("dj_id"));
        event.setEventName(rowSet.getString("event_name"));
        event.setEventInformation(rowSet.getString("information"));
        event.setEventStatus(rowSet.getBoolean("event_status"));

        return event;
    }
}
