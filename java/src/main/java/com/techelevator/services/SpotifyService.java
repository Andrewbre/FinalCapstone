package com.techelevator.services;

import com.techelevator.model.spotify.Root;
import org.springframework.web.client.RestTemplate;

public class SpotifyService {
    private final String API_BASE_URL = "https://api.spotify.com/v1/playlists/";
    private final String API_KEY = "?apikey=0348";
    final RestTemplate restTemplate = new RestTemplate();

    @Override
    public Root getSpotifyPlaylist(){
        Root root = restTemplate.getForObject(API_BASE_URL, Root.class);
        return root;
    }
}
