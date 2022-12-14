package com.techelevator.model.spotify;

public class Artist{
    public Artist(ExternalUrls external_urls, String href, String id, String name, String type, String uri) {
        this.external_urls = external_urls;
        this.href = href;
        this.id = id;
        this.name = name;
        this.type = type;
        this.uri = uri;
    }

    public ExternalUrls external_urls;
    public String href;
    public String id;
    public String name;
    public String type;
    public String uri;
}
