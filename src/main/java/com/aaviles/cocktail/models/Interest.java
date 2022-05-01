package com.aaviles.cocktail.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "interest")
public class Interest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "interest_labels", nullable = false, unique = true)
    private String interestLabel;


}
