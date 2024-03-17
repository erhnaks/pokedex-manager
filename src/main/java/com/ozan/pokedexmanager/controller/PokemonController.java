package com.ozan.pokedexmanager.controller;

import com.ozan.pokedexmanager.entity.Pokemon;
import com.ozan.pokedexmanager.service.PokemonService;
import com.ozan.pokedexmanager.service.enums.Evolution;
import com.ozan.pokedexmanager.service.enums.Type;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/pokemons/new")
    public String createPokemonForm(Model model) {
        Pokemon pokemon = new Pokemon();
        model.addAttribute("pokemon", pokemon);
        return "create_pokemon";
    }
    @PostMapping("/pokemons")
    public String savePokemon(@ModelAttribute("pokemon") Pokemon pokemon) {
        System.out.println(pokemon);
        service.savePokemon(pokemon);
        return "redirect:/pokemons";
    }



}
