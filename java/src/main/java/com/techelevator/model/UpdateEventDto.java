package com.techelevator.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateEventDto {
//    @JsonProperty
//    private String eventName;
    @JsonProperty
    private String eventInformation;
    @JsonProperty
    private boolean eventStatus;

//    public String getEventName() {
//        return eventName;
//    }
//
//    public void setEventName(String eventName) {
//        this.eventName = eventName;
//    }

    public String getEventInformation() {
        return eventInformation;
    }

    public void setEventInformation(String eventInformation) {
        this.eventInformation = eventInformation;
    }

    public boolean getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(boolean eventStatus) {
        this.eventStatus = eventStatus;
    }
}
