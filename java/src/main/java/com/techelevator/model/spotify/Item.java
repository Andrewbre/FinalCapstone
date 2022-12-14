package com.techelevator.model.spotify;

import javax.sound.midi.Track;
import java.util.Date;

public class Item{
    public Date added_at;
    public AddedBy added_by;
    public boolean is_local;
    public Object primary_color;
    public Track track;
    public VideoThumbnail video_thumbnail;
}