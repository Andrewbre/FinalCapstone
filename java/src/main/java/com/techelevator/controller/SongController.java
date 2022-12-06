package com.techelevator.controller;

import com.techelevator.dao.GenreDao;
import com.techelevator.dao.SongDao;
import com.techelevator.model.Song;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@RestController
@CrossOrigin
@PreAuthorize("isAuthenticated()")

public class SongController {

    private SongDao songDao;
    private GenreDao genreDao;

    public SongController(SongDao Songdao) {
        this.songDao = Songdao;
    }

    @RequestMapping(path = "/api/events/{id}", method = RequestMethod.GET)
    public List<Song> getAllSongsByEventId(@PathVariable int eventId) {
        List<Song> output = new ArrayList<>();
        return output;
    }

    @RequestMapping(path = "/api/events/playlist", method = RequestMethod.GET)
    public Queue<Song> getEventPlaylist(@ PathVariable int eventId) {
        Queue<Song> output = new LinkedList<>();
        return output;

    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    public Queue<Song> getSongListByDjId(@PathVariable int eventId) {
        Queue<Song> output = new LinkedList<>();
        return output;
    }
    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping(path = "", method = RequestMethod.PUT)
    public boolean addSongsToPlaylist(@PathVariable int userId, @RequestBody SongDao songDao) {

        return false;
    }
    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping(path = "", method = RequestMethod.PUT)
    public boolean submitASong(@RequestBody SongDao songDao) {
        return false;
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping(path = "", method = RequestMethod.PUT)
    public boolean voteOnASong(@RequestBody SongDao songDao) {
        return false;
    }
}
//GET - getAllSongsByEventId
//GET - getEventPlaylist
//GET - getGenreListByEventId
//GET - getGenreListByDJId
//GET - getSongListByDJid
//POST - addGenreListByEventId
//POST - makeGenreOfSongs(DJ)
//POST - addSongsToPlaylist (DJ and HOST)
//POST - submitASong(GUEST)
//PUT - voteOnASong(GUEST OPTIONAL)