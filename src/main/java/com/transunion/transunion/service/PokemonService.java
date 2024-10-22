package com.transunion.transunion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.transunion.transunion.repository.PokemonRepository;

@Service
public class PokemonService {

    private final PokemonRepository pokemonRepository;

    @Autowired
    public PokemonService(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    public String getPokemonPaginated(int offset, int limit) {
        return pokemonRepository.getPokemonPage(offset, limit);
    }
}
