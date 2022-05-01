package com.aaviles.cocktail.models;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(columnDefinition = "integer default 0")
    private Integer likes;

    @Column(nullable = false)
    private String postString;

    @OneToOne(cascade = CascadeType.ALL)
    private Cocktail cocktail;

    @OneToMany(cascade = CascadeType.ALL)
    List<Comment> commentList = new ArrayList<>();


}
