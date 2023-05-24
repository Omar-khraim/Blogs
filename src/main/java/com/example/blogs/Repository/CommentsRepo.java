package com.example.blogs.Repository;

import com.example.blogs.Domain.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepo extends JpaRepository<Comment, Long> {
}
