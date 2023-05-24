package com.example.blogs.Repository;

import com.example.blogs.Domain.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepo extends JpaRepository<Post, Long> {
}
