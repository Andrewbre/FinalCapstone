package com.techelevator.model.spotify;

public class AddedBy {
    public ExternalUrls external_urls;
    public String href;
    public String id;
    public String type;
    public String uri;


    public AddedBy(ExternalUrls external_urls, String href, String id, String type, String uri) {
        this.external_urls = external_urls;
        this.href = href;
        this.id = id;
        this.type = type;
        this.uri = uri;
    }
}
