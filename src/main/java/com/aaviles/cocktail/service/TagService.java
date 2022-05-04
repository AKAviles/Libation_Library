package com.aaviles.cocktail.service;

import com.aaviles.cocktail.models.Cocktail;

public interface TagService {
    Cocktail findCocktailByTag(String tag);
}
