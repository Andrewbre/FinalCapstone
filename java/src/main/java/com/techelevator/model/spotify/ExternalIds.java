package com.techelevator.model.spotify;

public class ExternalIds{
    public ExternalIds(String isrc) {
        this.isrc = isrc;
    }

    public String getIsrc() {
        return isrc;
    }

    public void setIsrc(String isrc) {
        this.isrc = isrc;
    }

    public String isrc;
}