package com.aaviles.cocktail.service;


import com.aaviles.cocktail.models.Ingredient;

import java.util.List;

public interface IngredientService {
    List<Ingredient> getAllIngredients();
    Ingredient saveIngredient(Ingredient ingredient);

    List<Ingredient> saveAllIngredients(List<Ingredient> ingredientList);
}
