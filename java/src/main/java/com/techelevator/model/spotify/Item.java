package com.techelevator.model.spotify;

import javax.sound.midi.Track;
import java.util.Date;

public class Item{
    public Item(Date added_at, AddedBy added_by, boolean is_local, Object primary_color, Track track, VideoThumbnail video_thumbnail) {
        this.added_at = added_at;
        this.added_by = added_by;
        this.is_local = is_local;
        this.primary_color = primary_color;
        this.track = track;
        this.video_thumbnail = video_thumbnail;
    }

    public Date added_at;
    public AddedBy added_by;
    public boolean is_local;
    public Object primary_color;
    public Track track;
    public VideoThumbnail video_thumbnail;
}