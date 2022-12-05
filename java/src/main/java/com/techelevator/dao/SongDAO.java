package com.techelevator.dao;
import com.techelevator.model.Song;

import java.util.Queue;

public interface SongDao {

    Queue<Song> getAllSongsByEventId(int eventId);
    Queue<Song> getEventPlaylist(int eventId);//should playlist be its own object?
    Queue<Song> getSongListByDJid(int userId);
    boolean addSongsToPlaylist (int userId);
    boolean submitASong();
    boolean voteOnASong();



}