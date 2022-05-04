package com.aaviles.cocktail.repository;

import com.aaviles.cocktail.models.Cocktail;
import com.aaviles.cocktail.models.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Set;

public interface CocktailRepository extends JpaRepository<Cocktail, Long> {
    Cocktail findByName(String name);

    @Query(value = "SELECT c FROM Cocktail c JOIN c.tagList t WHERE t.tagName IN :tagName")
    List<Cocktail> findAll(String tagName);

}
