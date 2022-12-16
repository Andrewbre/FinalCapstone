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
    private Boolean eventStatus;
    private String street_address;
    private String city;
    private String state;



    public Event(int eventId, int djId, String eventName, String eventInformation, boolean eventStatus, String street_address, String city, String state) {
        this.eventId = eventId;
        this.djId = djId;
        this.eventName = eventName;
        this.eventInformation = eventInformation;
        this.eventStatus = eventStatus;
        this.street_address = street_address;
        this.city = city;
        this.state = state;
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

    public boolean getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(Boolean eventStatus) {
        this.eventStatus = eventStatus;
    }

    public String getStreet_address() {
        return street_address;
    }

    public void setStreet_address(String street_address) {
        this.street_address = street_address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}



