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
        while (results.next()) {
            eventList.add(mapRowToEvent(results));
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

    public int getHostIdByUsername(String username){
        return 1;
    }

    @Override
    public List<Event> getEventsByDjId(int djId) {
        List<Event> EventsByDJList = new ArrayList<>();
        String sql = "SELECT event_id, dj_id, event_name, information " +
                "FROM event " +
                "WHERE dj_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, djId);
        while (results.next()) {
            EventsByDJList.add(mapRowToEvent(results));
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
                "VALUES (?,?) RETURNING event_id;" ;
        Integer newEventId = jdbcTemplate.queryForObject(sql, Integer.class, eventName, djId);
        for(Integer host : hostIds) {
            String sqlAddHost = "" +
                    "INSERT INTO event_host (event_id, host_id) " +
                    "VALUE (?,?);";
            jdbcTemplate.queryForRowSet(sqlAddHost, newEventId, host);
        }
        return newEventId!=null;
    }

    @Override
    public boolean updatedEventStatus(int eventId, boolean eventStatus){
        String sql = "UPDATE event " +
                "SET event_status = ? " +
                "WHERE event_id = ?;";
        int update = jdbcTemplate.update(sql, eventStatus, eventId);
        if(update == 1){
            return true;
        } else {
            return false;
        }

    }

    @Override
    public List<Genre> addGenresToEvent(List<Integer> genreList, int eventId) {
        List<Genre> updatedGenreList = new ArrayList<>();
        for(Integer genre: genreList) {
            String sql = "INSERT INTO event_genre (genre_id, event_id)" +
                    "VALUES (?,?); ";

            Integer genreId = jdbcTemplate.queryForObject(sql, Integer.class, genre, eventId);
            updatedGenreList.add(jdbcGenreDao.getGenresByGenreId(genreId));
        }
        return updatedGenreList;
    }


  @Override
  public boolean updatedEventInformation(int eventId, String information) {

        String sql = "UPDATE event " +
                "SET information = ? " +
                "WHERE event_id = ?;";

      int update = jdbcTemplate.update(sql, information, eventId);
        if(update == 1){
            return true;
        } else {
            return false;
        }
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
