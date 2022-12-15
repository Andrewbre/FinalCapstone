package com.techelevator.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class NewEventDto {
    @NotNull
    @JsonProperty("event_name")
    private String event_name;
    @NotNull
    @JsonProperty("information")
    private String information;

    NewEventDto(String event_name, String information){
        this.event_name=event_name;
        this.information=information;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
