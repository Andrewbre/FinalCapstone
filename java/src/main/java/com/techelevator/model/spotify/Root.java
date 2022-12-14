package com.techelevator.model.spotify;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Root{
    public boolean collaborative;
    public String description;
    public ExternalUrls external_urls;
    public Followers followers;
    public String href;
    public String id;
    public ArrayList<Image> images;
    public String name;
    public Owner owner;
    public Object primary_color;
    @JsonProperty("public")
    public boolean mypublic;
    public String snapshot_id;
    public Tracks tracks;
    public String type;

    public Root(boolean collaborative, String description, ExternalUrls external_urls, Followers followers, String href, String id, ArrayList<Image> images, String name, Owner owner, Object primary_color, boolean mypublic, String snapshot_id, Tracks tracks, String type, String uri) {
        this.collaborative = collaborative;
        this.description = description;
        this.external_urls = external_urls;
        this.followers = followers;
        this.href = href;
        this.id = id;
        this.images = images;
        this.name = name;
        this.owner = owner;
        this.primary_color = primary_color;
        this.mypublic = mypublic;
        this.snapshot_id = snapshot_id;
        this.tracks = tracks;
        this.type = type;
        this.uri = uri;
    }

    public String uri;
}