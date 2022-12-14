package com.techelevator.model.spotify;

import java.util.Date;

public class Item{

    public Date added_at;

    public Date getAdded_at() {
        return added_at;
    }

    public void setAdded_at(Date added_at) {
        this.added_at = added_at;
    }

    public AddedBy getAdded_by() {
        return added_by;
    }

    public void setAdded_by(AddedBy added_by) {
        this.added_by = added_by;
    }

    public boolean isIs_local() {
        return is_local;
    }

    public void setIs_local(boolean is_local) {
        this.is_local = is_local;
    }

    public Object getPrimary_color() {
        return primary_color;
    }

    public void setPrimary_color(Object primary_color) {
        this.primary_color = primary_color;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public VideoThumbnail getVideo_thumbnail() {
        return video_thumbnail;
    }

    public void setVideo_thumbnail(VideoThumbnail video_thumbnail) {
        this.video_thumbnail = video_thumbnail;
    }

    public AddedBy added_by;
    public boolean is_local;
    public Object primary_color;
    public Track track;
    public VideoThumbnail video_thumbnail;
}