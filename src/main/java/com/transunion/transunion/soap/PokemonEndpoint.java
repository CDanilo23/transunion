package com.transunion.transunion.soap;

import com.transunion.transunion.dto.GetPokemonRequest;
import com.transunion.transunion.dto.GetPokemonResponse;
import com.transunion.transunion.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;



@Endpoint
public class PokemonEndpoint {

    private static final String NAMESPACE_URI = "http://example.com/pokemon";

    @Autowired
    private PokemonService pokemonService;


    // Metodo que maneja la solicitud SOAP para obtener Pokémon paginados
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetPokemonRequest")
    @ResponsePayload
    public GetPokemonResponse getPokemon(@RequestPayload GetPokemonRequest request) {

        GetPokemonResponse response = new GetPokemonResponse();
        // Llama a la capa de servicio pasando offset y limit
        response.setPokemonPaginated(pokemonService.getPokemonPaginated(request.getOffset(), request.getLimit()));

        return response;
    }
}
