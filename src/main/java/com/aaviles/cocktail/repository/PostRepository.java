package com.aaviles.cocktail.repository;

import com.aaviles.cocktail.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long > {
}
