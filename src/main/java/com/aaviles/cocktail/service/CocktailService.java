package com.aaviles.cocktail.service;

import com.aaviles.cocktail.models.Cocktail;
import com.aaviles.cocktail.models.Tag;


import java.util.List;
import java.util.Set;


public interface CocktailService {

    List<Cocktail> getAllCocktails();
    Cocktail saveCocktail(Cocktail cocktail);
    Cocktail findByName(String name);
    List<Cocktail> getAllCocktailsByTag(String tagName);
    Set<Cocktail> getAllCocktailsByTags(List<Tag> tags);

}
