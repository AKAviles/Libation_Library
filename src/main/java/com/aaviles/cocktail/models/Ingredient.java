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

    @Column(name = "ingredient_name", nullable = false, unique = false)
    private String name;

    @Column(name= "amount", nullable = false)
    private double amount;
}
