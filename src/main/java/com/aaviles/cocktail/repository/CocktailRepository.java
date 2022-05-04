package com.aaviles.cocktail.repository;

import com.aaviles.cocktail.models.Cocktail;
import com.aaviles.cocktail.models.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Set;

public interface CocktailRepository extends JpaRepository<Cocktail, Long> {
    Cocktail findByName(String name);

    @Query("select c from Cocktail c join c.tagList t WHERE t.tagName = :tagName")
    List<Cocktail> findCocktailsWithTag(String tagName);

}
