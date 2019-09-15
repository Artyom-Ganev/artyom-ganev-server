package ru.ganev.service;

import ru.ganev.model.Blog;

import java.util.List;
import java.util.UUID;

public interface IBlogService {

    List<Blog> getBlogList();

    Blog getBlog(UUID id);

}
