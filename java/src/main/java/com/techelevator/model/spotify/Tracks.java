package com.techelevator.model.spotify;

import java.util.ArrayList;

public class Tracks{
    public String href;
    public ArrayList<Item> items;
    public int limit;
    public String next;
    public int offset;
    public Object previous;

    public Tracks(String href, ArrayList<Item> items, int limit, String next, int offset, Object previous, int total) {
        this.href = href;
        this.items = items;
        this.limit = limit;
        this.next = next;
        this.offset = offset;
        this.previous = previous;
        this.total = total;
    }

    public int total;
}