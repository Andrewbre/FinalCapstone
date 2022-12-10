package com.techelevator.model;

public class Song {

    private int songId;
    private int artistId;
    private String songName;
    private String featuredArtist;
    private int djId;
    private int eventId;


    public Song(int songId, int artistId, String songName, String featuredArtist) {
        this.songId = songId;
        this.artistId = artistId;
        this.songName = songName;
        this.featuredArtist = featuredArtist;
    }

    public Song() {

    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getFeaturedArtist() {
        return featuredArtist;
    }

    public void setFeaturedArtist(String featuredArtist) {
        this.featuredArtist = featuredArtist;
    }

    public int getDjId() {
        return djId;
    }

    public void setDjId(int djId) {
        this.djId = djId;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }
}
