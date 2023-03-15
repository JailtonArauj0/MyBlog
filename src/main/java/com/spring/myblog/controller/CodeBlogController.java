package com.spring.myblog.controller;

import com.spring.myblog.model.Post;
import com.spring.myblog.service.CodeBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.List;

@Controller
public class CodeBlogController {

    @Autowired
    CodeBlogService codeBlogService;

    @GetMapping("/posts")
    public ModelAndView getPosts() {
        ModelAndView view = new ModelAndView("posts");
        List<Post> posts = codeBlogService.findAll();
        return view.addObject("posts", posts);
    }

    @GetMapping("/posts/{id}")
    public ModelAndView getArticle(@PathVariable(name = "id") Long id) {
        ModelAndView view = new ModelAndView("article");
        Post article = codeBlogService.findById(id);
        return view.addObject("article", article);
    }

    @GetMapping("/posts/new")
    public String newPost() {
        return "articleForm";
    }

    @PostMapping("/posts/new")
    public ModelAndView savePost(Post post) {
        post.setDate(LocalDate.now());
        codeBlogService.save(post);
        return getPosts();
    }

}
