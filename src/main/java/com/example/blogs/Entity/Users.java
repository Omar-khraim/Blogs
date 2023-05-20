package com.example.blogs.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    @Basic(fetch = FetchType.LAZY)
    private String password;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastname;

    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime created;


    @Temporal(TemporalType.DATE)
    @UpdateTimestamp
    private LocalDate updated;

    @OneToMany(mappedBy = "author")
    private List<Post> posts;

    @OneToMany(mappedBy = "owner")
    private List<Blog> ownedBlogs;

    @ManyToMany
    private List<Blog> enrolledBlogs;


}

