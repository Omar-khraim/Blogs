package com.example.blogs.Services.Impl;

import com.example.blogs.Domain.DTOs.TagsDTO;
import com.example.blogs.Domain.Entity.Tag;
import com.example.blogs.Services.BlogsService;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements BlogsService {
    @Override
    public TagsDTO createTag(Tag tag) {
        return null;
    }

    @Override
    public TagsDTO findTagByID(long tagId) {
        return null;
    }

    @Override
    public void deleteTagById(long tagId) {

    }
}
