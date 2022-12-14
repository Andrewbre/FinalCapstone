package com.techelevator.services;

import com.techelevator.model.Song;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import com.techelevator.model.spotify.Root;

@Component
public class RestSongService implements SongService{
    private final String API_BASE_URL = "https://api.spotify.com/v1/playlists/";
    private final String API_KEY = "?apikey=0348";
    final RestTemplate restTemplate = new RestTemplate();

    @Override
    public Root getSong() {
        Root rawdata = restTemplate.getForObject(API_BASE_URL, Root.class);//this should be root... but where?
        return rawdata;
    }
}




