package com.techelevator.model;

import java.util.List;
import java.util.Queue;

public class Event {

    private int eventId;
    private int djId;
    private List<User> eventListOfHosts;
    private List<Genre> eventListOfGenres;
    private String eventName;
    private String eventInformation;
    private int hostId;
    private String userName;
    private String genre;
    private Boolean eventStatus;




    public Event(int eventId, int djId, String eventName, String eventInformation) {
        this.eventId = eventId;
        this.djId = djId;
        this.eventName = eventName;
        this.eventInformation = eventInformation;

    }

    public Event(int eventId, int djId, String eventName, String eventInformation, int hostId, String userName, String genre, Boolean eventStatus) {
        this.eventId = eventId;
        this.djId = djId;
        this.eventName = eventName;
        this.eventInformation = eventInformation;
        this.hostId = hostId;
        this.userName = userName;
        this.genre = genre;
        this.eventStatus = eventStatus;
    }

    public List<User> getEventListOfHosts() {
        return eventListOfHosts;
    }

    public void setEventListOfHosts(List<User> eventListOfHosts) {
        this.eventListOfHosts = eventListOfHosts;
    }

    public List<Genre> getEventListOfGenres() {
        return eventListOfGenres;
    }

    public void setEventListOfGenres(List<Genre> eventListOfGenres) {
        this.eventListOfGenres = eventListOfGenres;
    }

    public Event() { }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public int getDjId() {
        return djId;
    }

    public void setDjId(int djId) {
        this.djId = djId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventInformation() {
        return eventInformation;
    }

    public void setEventInformation(String eventInformation) {
        this.eventInformation = eventInformation;
    }

}

