package com.aaviles.cocktail.controller;

import com.aaviles.cocktail.models.Cocktail;
import com.aaviles.cocktail.models.Tag;
import com.aaviles.cocktail.service.CocktailService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/cocktail")

public class CocktailController {

    private CocktailService cocktailService;

    @Autowired
    public CocktailController (CocktailService cocktailService){
                this.cocktailService = cocktailService;

    }

    @PostMapping
    public ResponseEntity<Cocktail> saveCocktail(@RequestBody Cocktail cocktail){
        return new ResponseEntity<>(cocktailService.saveCocktail(cocktail), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Cocktail>> getAllCocktails() {
        return new ResponseEntity<>(cocktailService.getAllCocktails(), HttpStatus.OK);
    }

    @GetMapping("/tag")
    public ResponseEntity<List<Cocktail>> getCocktailsByTag(@RequestParam(value = "tagName") String tagName) {
        return new ResponseEntity<>(cocktailService.getAllCocktailsByTag(tagName), HttpStatus.OK);
    }
}
