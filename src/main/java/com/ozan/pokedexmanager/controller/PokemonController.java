package com.ozan.pokedexmanager.controller;

import com.ozan.pokedexmanager.entity.Pokemon;
import com.ozan.pokedexmanager.service.PokemonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PokemonController {


    private PokemonService service;

    public PokemonController(PokemonService service) {
        super();
        this.service = service;
    }


    @GetMapping("/pokemons")
    public String listPokemons(@RequestParam(required = false) String search, Model model) {
        List<Pokemon> pokemons;
        if (search != null && !search.isEmpty()) {
            pokemons = service.searchPokemon(search);
        } else {
            pokemons = service.getAllPokemon();
        }
        model.addAttribute("pokemons", pokemons);
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
        service.savePokemon(pokemon);
        return "redirect:/pokemons";
    }
    @GetMapping("/pokemons/edit/{id}")
    public String editPokemon(@PathVariable Long id, Model model) {
        model.addAttribute("pokemon", service.getPokemonById(id));
        return "edit_pokemon";
    }

    @PostMapping("/pokemons/{id}")
    public String updatePokemon(@PathVariable Long id, @ModelAttribute("pokemon") Pokemon pokemon, Model model) {

        // Get pokemon from database
        Pokemon existingPokemon = service.getPokemonById(id);

        existingPokemon.setId(id);
        existingPokemon.setName(pokemon.getName());
        existingPokemon.setEvolution(pokemon.getEvolution());
        existingPokemon.setType(pokemon.getType());
        existingPokemon.setEvolutionFrom(pokemon.getEvolutionFrom());
        existingPokemon.setSpecializationOne(pokemon.getSpecializationOne());
        existingPokemon.setSpecializationTwo(pokemon.getSpecializationTwo());
        existingPokemon.setHealth(pokemon.getHealth());
        existingPokemon.setWeakness(pokemon.getWeakness());
        existingPokemon.setResistance(pokemon.getResistance());
        existingPokemon.setRetreat(pokemon.getRetreat());
        existingPokemon.setDescription(pokemon.getDescription());

        // save edited pokemon

        service.updatePokemon(existingPokemon);
        return "redirect:/pokemons";
    }


    @GetMapping("/pokemons/delete/{id}")
    public String deletePokemon(@PathVariable Long id) {
        service.deletePokemonById(id);
        return "redirect:/pokemons";
    }



}
