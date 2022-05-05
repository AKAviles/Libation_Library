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

//    SELECT  *
//    FROM cocktails c
//    JOIN cocktails_tag_list ct ON c.id = ct.cocktail_id
//    JOIN tags t ON t.id = ct.tag_id WHERE t.tag_name = "Whiskey"
//    @Query(value = "SELECT c FROM Cocktail c JOIN c.tagList t WHERE t.tagName = :tagName")
//    List<Cocktail> findCocktailsWithTag(String tagName);
    List<Cocktail> findCocktailsByTagList_TagName(String tagName);

}
