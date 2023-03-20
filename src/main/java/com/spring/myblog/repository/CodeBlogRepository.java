package com.spring.myblog.repository;

import com.spring.myblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface CodeBlogRepository extends JpaRepository<Post, Long> {

    @Transactional
    @Query("select u from Post u where u.title like %?1%")
    List<Post> findByTitle(String title);
}
