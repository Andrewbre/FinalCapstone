package com.techelevator.controller;

import com.techelevator.dao.SongsDao;
import com.techelevator.model.Song;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@RestController
@CrossOrigin
@PreAuthorize("isAuthenticated()")

public class SongController {

    private SongsDao songsDao;

    public SongController(SongsDao songsDao) {
        this.songsDao = songsDao;
    }

    @RequestMapping(path = "/events/availableSongs/{eventId}", method = RequestMethod.GET)
    public List<Song> getAllSongsByEventId(@PathVariable int eventId) {
        return songsDao.getAllSongsAvailableByEventId(eventId);
    }

    @RequestMapping(path = "/events/playlist/{eventId}", method = RequestMethod.GET)
    public Queue<Song> getEventPlaylist(@PathVariable int eventId) {
        return songsDao.getEventPlaylist(eventId);

    }

    @RequestMapping(path = "/events/playlist/dj/{djId}", method = RequestMethod.GET)
    public Queue<Song> getSongListByDjId(@PathVariable int djId) {
        return songsDao.getSongListByDjId(djId);
    }

    @RequestMapping(path = "/events/playlist/{eventId}/{songId}", method = RequestMethod.PUT)
    public Song addSongsToPlaylist(@PathVariable int eventId, @PathVariable int songId) {
        songsDao.addSongToPlaylist(eventId, songId);
        return songsDao.getSongBySongId(songId);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/events/{event_id}/", method = RequestMethod.POST)
    public boolean submitASong(int eventId, int songId) {
        return songsDao.submitASong(songId, eventId);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping(path="/events/{event_id}/playlist/{song_id}", method = RequestMethod.PUT)
    public int voteOnASong(@PathVariable int song_id, @PathVariable int event_id) {
        return songsDao.voteOnASong(song_id, event_id);
    }
}