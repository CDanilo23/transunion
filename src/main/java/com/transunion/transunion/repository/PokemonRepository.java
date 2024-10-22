package com.transunion.transunion.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class PokemonRepository {
    private final RestTemplate restTemplate = new RestTemplate();
    private static final String POKEAPI_URL = "https://pokeapi.co/api/v2/pokemon?offset=%d&limit=%d";

    public String getPokemonPage(int offset, int limit) {
        String url = String.format(POKEAPI_URL, offset, limit);
        return restTemplate.getForObject(url, String.class);
    }
}
