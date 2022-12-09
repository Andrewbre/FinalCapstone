package com.techelevator.model;

public class Genre {

    private int genreId;
    private String genreName;
    private int djId;
    private int eventId;
    public Genre(int genreId, String genreName, int djId, int eventId) {
        this.genreId = genreId;
        this.genreName = genreName;
        this.djId = djId;
        this.eventId = eventId;
    }

    public Genre() { }

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

}
