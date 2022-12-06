package com.techelevator.dao;
import com.techelevator.model.Song;

import java.util.List;
import java.util.Queue;

public interface SongDao {

    List<Song> getAllSongsAvailableByEventId(int eventId);
    List<Song> getEventPlaylist(int eventId);//should playlist be its own object?
    List<Song> getSongListByDJid(int djId);
    void addSongsToPlaylist (int playlistId, int song_id); //event_song table
    //TODO - need to build submit song table
    //boolean submitASong();
    void voteOnASong(int song_id, int event_id);




}
