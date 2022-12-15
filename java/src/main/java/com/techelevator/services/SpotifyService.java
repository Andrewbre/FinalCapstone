package com.techelevator.services;

import com.techelevator.model.spotify.Root;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


public class SpotifyService {
    private final String API_BASE_URL = "https://api.spotify.com/v1/users/ethancopperman/playlists/7zK2WjuX5otv9au92VXsKc";
    private final String API_KEY = "BQDfvgy1onANUQlZm7-jqyGbFMUtTY2tF7jG-_TW5dWE4n44-KRFW4sULcpHmoxT6FgQB01-bp3rK259NsUXQqCUx1J3LK6Qa63M2-GH9w9uEBMhRnHu7CiP1nqPW6B4L6SIOrHKhAi-wofXGRKHLPLwX87Z5wNQIeRyAgJaPUJQvA73A67_TTaM8vP2MfyuNqoY";
    final RestTemplate restTemplate = new RestTemplate();

    public Root getSpotifyPlaylist(){
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(API_KEY);
        ResponseEntity<Root> response = restTemplate.exchange(API_BASE_URL, HttpMethod.GET,new HttpEntity<>(headers),Root.class);
        return response.getBody();
    }
}




