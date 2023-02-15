package com.aaviles.cocktail.models;

import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Data
@Entity
@Table(name = "cocktails")
public class Cocktail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name= "cocktail_name", nullable = false, unique = true)
    private String name;

    //TODO: look into adding photo and video to db

    @Column
    private String method;

    @Column
    private String complexity;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Set<Ingredient> ingredientList = new HashSet<>();

    @ManyToMany(cascade = CascadeType.ALL)
    Set<Tag> tagList = new HashSet<>();

    @Column
    private String instructions;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cocktail cocktail = (Cocktail) o;
        return Objects.equals(id, cocktail.id) && Objects.equals(name, cocktail.name) && Objects.equals(method, cocktail.method) && Objects.equals(complexity, cocktail.complexity) && Objects.equals(ingredientList, cocktail.ingredientList) && Objects.equals(tagList, cocktail.tagList) && Objects.equals(instructions, cocktail.instructions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, method, complexity, ingredientList, tagList, instructions);
    }
}
