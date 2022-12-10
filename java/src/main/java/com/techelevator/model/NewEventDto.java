package com.techelevator.model;

import java.util.Queue;

public class NewEventDto {
    private int eventId;
    private int djId;
    private Queue<Integer> listOfHostIds;
    private String eventName;
    private String eventInformation;

    public int getDJ() {
        return djId;
    }

    public void setDJ(int djId) {
        this.djId = djId;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public Queue<Integer> getListOfHosts(Queue listOfHost) {
        return listOfHostIds;
    }

    public void setListOfHosts(Queue listOfHosts) {
        this.listOfHostIds = listOfHosts;
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
