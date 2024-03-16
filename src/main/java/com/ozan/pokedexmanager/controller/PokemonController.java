package com.ozan.pokedexmanager.controller;

import com.ozan.pokedexmanager.service.PokemonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PokemonController {


    private PokemonService service;

    public PokemonController(PokemonService service) {
        super();
        this.service = service;
    }


    @GetMapping("/pokemons")
    public String listPokemons(Model model) {
        service.getAllPokemon();
        model.addAttribute("pokemons", service.getAllPokemon());
        return "pokemons";
    }
}
