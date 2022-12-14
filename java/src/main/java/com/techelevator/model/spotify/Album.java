package com.techelevator.model.spotify;

import java.util.ArrayList;

public class Album{
    public String album_type;
    public ArrayList<Artist> artists;
    public ArrayList<String> available_markets;
    public ExternalUrls external_urls;
    public String href;
    public String id;
    public ArrayList<Image> images;
    public String name;
    public String release_date;
    public String release_date_precision;
    public int total_tracks;
    public String type;
    public String uri;

    public Album(String album_type, ArrayList<Artist> artists, ArrayList<String> available_markets, ExternalUrls external_urls, String href, String id, ArrayList<Image> images, String name, String release_date, String release_date_precision, int total_tracks, String type, String uri) {
        this.album_type = album_type;
        this.artists = artists;
        this.available_markets = available_markets;
        this.external_urls = external_urls;
        this.href = href;
        this.id = id;
        this.images = images;
        this.name = name;
        this.release_date = release_date;
        this.release_date_precision = release_date_precision;
        this.total_tracks = total_tracks;
        this.type = type;
        this.uri = uri;
    }
}
