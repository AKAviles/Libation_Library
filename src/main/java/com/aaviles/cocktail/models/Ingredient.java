package com.aaviles.cocktail.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ingredients")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ingredient_name", nullable = false, unique = true)
    private String name;

    @Column(name= "amount", nullable = false)
    private int amount;
}
