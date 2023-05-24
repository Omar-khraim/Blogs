package com.example.blogs.Repository;

import com.example.blogs.Domain.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepository<Users, Long> {
}
