package com.codegym.service;

import com.codegym.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    Page<Blog> findAll(String keywork, Pageable pageable);

    void create(Blog blog);

    Blog findById(Integer id);

    void update(Blog blog);

    void delete(Blog blog);

    List<Blog> search(String nameSearch);
}
