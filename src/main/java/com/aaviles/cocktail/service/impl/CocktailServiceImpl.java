package com.aaviles.cocktail.service.impl;


import com.aaviles.cocktail.models.Cocktail;
import com.aaviles.cocktail.models.Ingredient;
import com.aaviles.cocktail.models.Tag;
import com.aaviles.cocktail.repository.CocktailRepository;
import com.aaviles.cocktail.repository.IngredientRepository;
import com.aaviles.cocktail.service.CocktailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class CocktailServiceImpl implements CocktailService {

    private CocktailRepository cocktailRepository;



    @Autowired
    public CocktailServiceImpl(CocktailRepository cocktailRepository) {
        this.cocktailRepository = cocktailRepository;
    }


    @Override
    public List<Cocktail> getAllCocktails() {
        return cocktailRepository.findAll();
    }

    @Override
    public Cocktail findByName(String name) {
        return cocktailRepository.findByName(name);
    }

    @Override
    public Cocktail saveCocktail(Cocktail cocktail) {
        return cocktailRepository.save(cocktail);
    }

   @Override
   public List<Cocktail> getAllCocktailsByTag(String tagName) {
        return cocktailRepository.findCocktailsByTagList_TagName(tagName);
    }

    @Override
    public Set<Cocktail> getAllCocktailsByTags(List<Tag> tags) {
        return cocktailRepository.findByTagListIn(tags);
    }
}
