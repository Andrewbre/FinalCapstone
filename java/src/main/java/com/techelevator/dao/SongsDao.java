package com.techelevator.dao;
import com.techelevator.model.Song;

import java.util.List;
import java.util.Queue;

public interface SongsDao {

    List<Song> getAllSongsAvailableByEventId(int eventId);
    Queue<Song> getEventPlaylist(int eventId);//should playlist be its own object?

    boolean submitASong(List<Integer> songIds, int eventId);

    Queue<Song> getSongListByDJid(int djId);
    void addSongsToPlaylist (int playlistId, int songId); //event_song table


    void voteOnASong(int songId, int eventId);


}
