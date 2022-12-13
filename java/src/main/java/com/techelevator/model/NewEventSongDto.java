package com.techelevator.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;
import java.util.Queue;

public class NewEventSongDto {
    @JsonProperty
    @NotNull
    private int eventId;
    @JsonProperty
    @NotNull
    private int songId;

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }
}
