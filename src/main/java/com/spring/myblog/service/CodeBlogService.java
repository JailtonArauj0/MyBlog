package com.spring.myblog.service;

import com.spring.myblog.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CodeBlogService {

    List<Post> findAll();
    Post findById(Long id);
    Post save(Post post);
}
