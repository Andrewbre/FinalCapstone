package com.techelevator.controller;

import com.techelevator.dao.SongDao;
import com.techelevator.model.Song;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@RestController
@CrossOrigin

public class SongController {

    private SongDao songDao;

    public SongController(SongDao Songdao) {
        this.songDao = Songdao;
    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<Song> getAllSongsByEventId(int eventId) {
        List<Song> output = new ArrayList<>();
        return output;
    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    public Queue<Song> getEventPlaylist(int eventId) {
        Queue<Song> output = new LinkedList<>();
        return output;

    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    public Queue<Song> getSongListByDjId(int eventId) {
        Queue<Song> output = new LinkedList<>();
        return output;
    }
    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping(path = "", method = RequestMethod.PUT)
    public boolean addSongsToPlaylist(int userId) {

        return false;
    }
    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping(path = "", method = RequestMethod.PUT)
    public boolean submitASong() {
        return false;
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping(path = "", method = RequestMethod.PUT)
    public boolean voteOnASong() {
        return false;
    }
}
