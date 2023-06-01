package com.example.blogs.Repository;

import com.example.blogs.Domain.Entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagsRepo extends JpaRepository<Tag, Long> {
}
