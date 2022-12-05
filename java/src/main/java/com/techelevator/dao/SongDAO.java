package com.techelevator.dao;
import com.techelevator.model.Song;

import java.util.List;
import java.util.Queue;

public interface SongDAO {

    List<Song> getAllSongsByEventId(int eventId);
    List<Song> getEventPlaylist(int eventId);//should playlist be its own object?
    List<Song> getSongListByDJid(int userId);
    boolean addSongsToPlaylist (int userId);
    boolean submitASong();
    boolean voteOnASong();



}
