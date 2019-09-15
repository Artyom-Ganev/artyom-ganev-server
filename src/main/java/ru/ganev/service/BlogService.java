package ru.ganev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ganev.model.Blog;
import ru.ganev.repository.BlogRepository;

import java.util.List;
import java.util.UUID;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private BlogRepository productRepository;

    @Override
    public List<Blog> getBlogList() {
        return productRepository.findAll();
    }
}
