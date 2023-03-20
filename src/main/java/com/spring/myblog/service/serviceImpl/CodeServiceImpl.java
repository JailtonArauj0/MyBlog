package com.spring.myblog.service.serviceImpl;

import com.spring.myblog.model.Post;
import com.spring.myblog.repository.CodeBlogRepository;
import com.spring.myblog.service.CodeBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeServiceImpl implements CodeBlogService {

    @Autowired
    CodeBlogRepository codeBlogRepository;

    @Override
    public List<Post> findAll() {
        return codeBlogRepository.findAll();
    }

    @Override
    public Post findById(Long id) {
        return codeBlogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return codeBlogRepository.save(post);
    }

    @Override
    public List<Post> findByTitle(String title) {
        return codeBlogRepository.findByTitle(title);
    }
}
