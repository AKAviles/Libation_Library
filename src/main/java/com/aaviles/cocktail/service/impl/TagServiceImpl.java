package com.aaviles.cocktail.service.impl;

import com.aaviles.cocktail.models.Cocktail;
import com.aaviles.cocktail.repository.TagRepository;
import com.aaviles.cocktail.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagServiceImpl implements TagService {
    private TagRepository tagRepository;

    @Autowired
    public TagServiceImpl(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

    @Override
    public Cocktail findCocktailByTag(String tag) {
        return tagRepository.findByTagName(tag);
    }
}
