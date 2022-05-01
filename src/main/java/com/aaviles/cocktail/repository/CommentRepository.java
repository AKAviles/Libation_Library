package com.aaviles.cocktail.repository;

import com.aaviles.cocktail.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
