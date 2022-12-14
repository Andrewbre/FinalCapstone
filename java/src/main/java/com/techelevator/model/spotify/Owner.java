package com.techelevator.model.spotify;

public class Owner{
    public Owner(String display_name, ExternalUrls external_urls, String href, String id, String type, String uri) {
        this.display_name = display_name;
        this.external_urls = external_urls;
        this.href = href;
        this.id = id;
        this.type = type;
        this.uri = uri;
    }

    public String display_name;
    public ExternalUrls external_urls;
    public String href;
    public String id;
    public String type;
    public String uri;
}