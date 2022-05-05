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

    @Column(name = "completion_time")
    private Integer estCompletionTime;

    @Column
    private String complexity;

        @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Set<Ingredient> ingredientList = new HashSet<>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "cocktails_tagList",
        joinColumns = @JoinColumn(name = "cocktail_id",
        referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "tag_id",
        referencedColumnName = "id"))
    Set<Tag> tagList = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cocktail cocktail = (Cocktail) o;
        return Objects.equals(id, cocktail.id) && Objects.equals(name, cocktail.name) && Objects.equals(method, cocktail.method) && Objects.equals(estCompletionTime, cocktail.estCompletionTime) && Objects.equals(complexity, cocktail.complexity) && Objects.equals(ingredientList, cocktail.ingredientList) && Objects.equals(tagList, cocktail.tagList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, method, estCompletionTime, complexity, ingredientList, tagList);
    }
}
