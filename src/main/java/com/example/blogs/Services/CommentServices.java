package com.example.blogs.Services;


import com.example.blogs.Domain.DTOs.CommentsDTO;
import com.example.blogs.Domain.Entity.Comment;

public interface CommentServices {
    CommentsDTO createComment(Comment comment);

    CommentsDTO findCommentByID(long commentId);

    void deleteCommentById(long commentId);
}
