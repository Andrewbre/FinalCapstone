package com.techelevator.model.spotify;

public class Followers{

    public Object getHref() {
        return href;
    }

    public void setHref(Object href) {
        this.href = href;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Object href;
    public int total;
}