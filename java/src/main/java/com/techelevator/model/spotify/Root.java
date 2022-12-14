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

    public boolean isCollaborative() {
        return collaborative;
    }

    public void setCollaborative(boolean collaborative) {
        this.collaborative = collaborative;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ExternalUrls getExternal_urls() {
        return external_urls;
    }

    public void setExternal_urls(ExternalUrls external_urls) {
        this.external_urls = external_urls;
    }

    public Followers getFollowers() {
        return followers;
    }

    public void setFollowers(Followers followers) {
        this.followers = followers;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Image> getImages() {
        return images;
    }

    public void setImages(ArrayList<Image> images) {
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Object getPrimary_color() {
        return primary_color;
    }

    public void setPrimary_color(Object primary_color) {
        this.primary_color = primary_color;
    }

    public boolean isMypublic() {
        return mypublic;
    }

    public void setMypublic(boolean mypublic) {
        this.mypublic = mypublic;
    }

    public String getSnapshot_id() {
        return snapshot_id;
    }

    public void setSnapshot_id(String snapshot_id) {
        this.snapshot_id = snapshot_id;
    }

    public Tracks getTracks() {
        return tracks;
    }

    public void setTracks(Tracks tracks) {
        this.tracks = tracks;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

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