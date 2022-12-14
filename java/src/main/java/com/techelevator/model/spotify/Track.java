package com.techelevator.model.spotify;

import java.util.ArrayList;

public class Track{
    public Album album;
    public ArrayList<Artist> artists;
    public ArrayList<String> available_markets;
    public int disc_number;
    public int duration_ms;
    public boolean episode;
    public boolean explicit;
    public ExternalIds external_ids;
    public ExternalUrls external_urls;
    public String href;
    public String id;
    public boolean is_local;
    public String name;
    public int popularity;
    public String preview_url;
    public boolean track;
    public int track_number;
    public String type;

    public Track(Album album, ArrayList<Artist> artists, ArrayList<String> available_markets, int disc_number, int duration_ms, boolean episode, boolean explicit, ExternalIds external_ids, ExternalUrls external_urls, String href, String id, boolean is_local, String name, int popularity, String preview_url, boolean track, int track_number, String type, String uri) {
        this.album = album;
        this.artists = artists;
        this.available_markets = available_markets;
        this.disc_number = disc_number;
        this.duration_ms = duration_ms;
        this.episode = episode;
        this.explicit = explicit;
        this.external_ids = external_ids;
        this.external_urls = external_urls;
        this.href = href;
        this.id = id;
        this.is_local = is_local;
        this.name = name;
        this.popularity = popularity;
        this.preview_url = preview_url;
        this.track = track;
        this.track_number = track_number;
        this.type = type;
        this.uri = uri;
    }

    public String uri;
}