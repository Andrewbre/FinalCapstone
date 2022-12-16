package com.techelevator.dao;
import com.techelevator.model.NewEventSongDto;
import com.techelevator.model.Song;

import java.util.List;
import java.util.Queue;

public interface SongsDao {

    List<Song> getAllSongsAvailableByEventId(int eventId);

    List<Song> getEventPlaylist(int eventId);

    boolean submitASong(NewEventSongDto newEventSongDto);

    Queue<Song> getSongListByDjId(int djId);

    void addSongToPlaylist (NewEventSongDto newEventSongDto);

    void voteOnASong(NewEventSongDto newEventSongDto);

    Song getSongBySongId(int songId);


    String findArtistNameByArtistID(int artist_id);
}
