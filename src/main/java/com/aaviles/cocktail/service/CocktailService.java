package com.aaviles.cocktail.service;

import com.aaviles.cocktail.models.Cocktail;
import com.aaviles.cocktail.models.Tag;


import java.util.List;
import java.util.Set;


public interface CocktailService {

    List<Cocktail> getAllCocktails();
    Cocktail findByName(String name);
    Cocktail saveCocktail(Cocktail cocktail);

    List<Cocktail> getAllCocktailsByTag(String tagName);

}
