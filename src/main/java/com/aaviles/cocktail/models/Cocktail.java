package com.aaviles.cocktail.models;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Ingredient> ingredientList = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL)
    List<Tag> tagList = new ArrayList<>();

}
