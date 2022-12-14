package com.techelevator.services;

import com.techelevator.model.spotify.Root;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


public class SpotifyService {
    private final String API_BASE_URL = "https://api.spotify.com/v1/users/ethancopperman/playlists/7zK2WjuX5otv9au92VXsKc";
    private final String API_KEY = "BQBfiPmKm8lYU-qRVu2i72JhpCxwAdsu-KsJwvmItziw9tdiyVJDlSBCOVwm-Axfy1rbEh2ySVo5ABFTMWSVsvxu2r-TwuulnHCZ-yWm9om3LZPISycKda71O9Xi8RwdRuVe8RoIiBdX8Ixa7BFMa8h-0iIimVg2P_5psUe9VKOAIdJkrHDNK6mGgR8EIP_pdHFZ";
    final RestTemplate restTemplate = new RestTemplate();

    public Root getSpotifyPlaylist(){
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(API_KEY);
        ResponseEntity<Root> response = restTemplate.exchange(API_BASE_URL, HttpMethod.GET,new HttpEntity<>(headers),Root.class);
        return response.getBody();
    }
}




