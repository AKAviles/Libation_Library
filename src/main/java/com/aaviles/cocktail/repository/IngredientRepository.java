package com.aaviles.cocktail.repository;

import com.aaviles.cocktail.models.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
