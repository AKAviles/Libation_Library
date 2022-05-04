package com.aaviles.cocktail.controller;

import com.aaviles.cocktail.models.Cocktail;
import com.aaviles.cocktail.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/tag")
public class TagController {

    private TagService tagService;

    @Autowired

    public TagController(TagService tagService) {
        this.tagService = tagService;
    }

    @GetMapping
    public ResponseEntity<Cocktail> getCocktailByTag(@RequestParam(value="tag") String tag) {
        return new ResponseEntity<>(tagService.findCocktailByTag(tag), HttpStatus.OK);
    }
}
