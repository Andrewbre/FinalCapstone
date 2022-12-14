package com.techelevator.model.spotify;

public class Followers{
    public Followers(Object href, int total) {
        this.href = href;
        this.total = total;
    }

    public Object href;
    public int total;
}