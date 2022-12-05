package com.techelevator.model;

public class Event {

    private int eventId;
    private int djId;
    private String eventName;
    private String eventInformation;


    public Event() {
        this.eventId = eventId;
        this.djId = djId;
        this.eventName = eventName;
        this.eventInformation = eventInformation;
    }

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

