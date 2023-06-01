package com.example.blogs.Services.Impl;

import com.example.blogs.Domain.DTOs.PostsDTO;
import com.example.blogs.Domain.Entity.Post;
import com.example.blogs.Services.PostsService;
import org.springframework.stereotype.Service;

@Service
public class PostsServiceImpl implements PostsService {

    @Override
    public PostsDTO createPost(Post post) {
        return null;
    }

    @Override
    public PostsDTO findPostByID(long postId) {
        return null;
    }

    @Override
    public void deletePostById(long postId) {

    }
}
