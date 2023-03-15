package com.spring.myblog.repository;

import com.spring.myblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodeBlogRepository extends JpaRepository<Post, Long> {
}
