package com.ozan.pokedexmanager.controller;

import com.ozan.pokedexmanager.entity.Pokemon;
import com.ozan.pokedexmanager.service.PokemonService;
import com.ozan.pokedexmanager.service.enums.Evolution;
import com.ozan.pokedexmanager.service.enums.Type;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PokemonController {


    private PokemonService service;

    public PokemonController(PokemonService service) {
        super();
        this.service = service;
    }


    @GetMapping("/pokemons")
    public String listPokemons(Model model, @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
        Page<Pokemon> pokemonPage = service.findPaginated(page, size);
        model.addAttribute("pokemons", pokemonPage.getContent());
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", (int) pokemonPage.getTotalPages());
        model.addAttribute("nextPage", page + 1); // Calculate next page
        model.addAttribute("prevPage", page - 1); // Calculate previous page
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
