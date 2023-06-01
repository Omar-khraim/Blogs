package com.example.blogs.Repository;

import com.example.blogs.Domain.Entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogsRepo extends JpaRepository<Blog, Long> {


}
