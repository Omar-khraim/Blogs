package com.example.blogs.Services.Impl;

import com.example.blogs.Domain.DTOs.CommentsDTO;
import com.example.blogs.Domain.Entity.Comment;
import com.example.blogs.Services.CommentServices;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentServices {
    @Override
    public CommentsDTO createComment(Comment comment) {
        return null;
    }

    @Override
    public CommentsDTO findCommentByID(long commentId) {
        return null;
    }

    @Override
    public void deleteCommentById(long commentId) {

    }
}
