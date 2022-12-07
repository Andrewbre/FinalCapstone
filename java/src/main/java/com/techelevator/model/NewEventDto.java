package com.techelevator.model;

import java.util.Queue;

public class NewEventDto {
    private int eventId;
    private int djId;
    private Queue<User> listOfHosts;
    private String eventName;
    private String eventInformation;

    public int getDJ() {
        return djId;
    }

    public void setDJ(int djId) {
        this.djId = djId;
    }

    public int getEventId(int eventId) {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public Queue<User> getListOfHosts(Queue listOfHosts) {
        return listOfHosts;
    }

    public void setListOfHosts(Queue listOfHosts) {
        this.listOfHosts = listOfHosts;
    }

    public String getEventName(String eventName) {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName  = eventName;
    }

    public String getEventInformation(String eventInformation) {
        return eventInformation;
    }

    public void setEventInformation(String eventInformation) {
        this.eventInformation  = eventInformation;
    }

}
