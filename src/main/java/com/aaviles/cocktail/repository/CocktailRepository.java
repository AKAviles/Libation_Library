package com.aaviles.cocktail.repository;

import com.aaviles.cocktail.models.Cocktail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CocktailRepository extends JpaRepository<Cocktail, Long> {
}
