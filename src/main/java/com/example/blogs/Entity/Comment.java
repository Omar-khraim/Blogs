package com.example.blogs.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false)
    private String content ;

    @ManyToOne
    private Post post;

    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime created ;

    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    private LocalDateTime updated ;
}
