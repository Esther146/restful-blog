package com.esther.fashion_ecommerce.repository;

import com.esther.fashion_ecommerce.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
