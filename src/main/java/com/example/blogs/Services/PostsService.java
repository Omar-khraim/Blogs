package com.example.blogs.Services;


import com.example.blogs.Domain.DTOs.PostsDTO;
import com.example.blogs.Domain.Entity.Post;

public interface PostsService {

    PostsDTO createPost(Post post);
    PostsDTO findPostByID(long postId);
    void deletePostById(long postId);
}
