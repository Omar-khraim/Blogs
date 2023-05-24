package com.example.blogs.Services;

import com.example.blogs.Domain.DTOs.TagsDTO;
import com.example.blogs.Domain.Entity.Tag;

public interface TagService {
    TagsDTO createTag(Tag tag);
    TagsDTO findTagByID(long tagId);
    void deleteTagById(long tagId);
}
