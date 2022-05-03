package com.aaviles.cocktail.service.impl;

import com.aaviles.cocktail.models.Ingredient;
import com.aaviles.cocktail.repository.IngredientRepository;
import com.aaviles.cocktail.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IngredientServiceImpl implements IngredientService {

    private IngredientRepository ingredientRepository;

    @Autowired
    public IngredientServiceImpl(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public List<Ingredient> getAllIngredients() {
        return ingredientRepository.findAll();
    }

    @Override
    public Ingredient saveIngredient(Ingredient ingredient) {
        return ingredientRepository.save(ingredient);
    }

    @Override
    public List<Ingredient> saveAllIngredients(List<Ingredient> ingredientList) {
        return ingredientRepository.saveAll(ingredientList);
    }
}
