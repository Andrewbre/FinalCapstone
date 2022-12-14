package com.techelevator.controller;

import com.techelevator.dao.SongsDao;
import com.techelevator.model.NewEventSongDto;
import com.techelevator.model.Song;
import com.techelevator.model.spotify.Root;
import com.techelevator.services.SpotifyService;
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

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/events/playlist/", method = RequestMethod.POST)
    public void addSongsToPlaylist(@RequestBody NewEventSongDto newEventSongDto) {
        songsDao.addSongToPlaylist(newEventSongDto);

    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/events/playlist/song/", method = RequestMethod.POST)
    public boolean submitASong(@RequestBody NewEventSongDto newEventSongDto) { return songsDao.submitASong(newEventSongDto);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping(path = "/events/playlist/song/", method = RequestMethod.PUT)
    public void voteOnASong(@RequestBody NewEventSongDto newEventSongDto) {
        songsDao.voteOnASong(newEventSongDto);
    }

    @GetMapping(path="/ethan/playlist")
    public Root get90sPlaylist(){
        SpotifyService spotifyService = new SpotifyService();
        Root allinfo = spotifyService.getSpotifyPlaylist();
        return allinfo;
    }
}