package com.example.blogs.Domain.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String title;

    @ManyToOne
    @JsonBackReference
    private Users owner;

    @JsonIgnoreProperties("enrolledBlogs")
    @ManyToMany(mappedBy = "enrolledBlogs", fetch = FetchType.LAZY)
    private List<Users> members;


}
