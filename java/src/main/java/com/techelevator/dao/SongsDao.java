package com.techelevator.dao;
import com.techelevator.model.Song;

import java.util.List;
import java.util.Queue;

public interface SongsDao {

    List<Song> getAllSongsAvailableByEventId(int eventId);

    Queue<Song> getEventPlaylist(int eventId);

    boolean submitASong(List<Integer> songId, int eventId);

    Queue<Song> getSongListByDjId(int djId);

    Song addSongToPlaylist (int eventId, int songId);

    int voteOnASong(int songId, int eventId);

    Song getSongBySongId(int songId);


}
