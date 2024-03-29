package com.aaviles.cocktail.repository;

import com.aaviles.cocktail.models.Cocktail;
import com.aaviles.cocktail.models.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
    Cocktail findByTagName(String tag);
}
