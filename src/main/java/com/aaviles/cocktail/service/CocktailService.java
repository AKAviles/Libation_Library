package com.aaviles.cocktail.service;

import com.aaviles.cocktail.models.Cocktail;


import java.util.List;


public interface CocktailService {

    List<Cocktail> getAllCocktails();
    Cocktail findByName(String name);
    Cocktail saveCocktail(Cocktail cocktail);

}
