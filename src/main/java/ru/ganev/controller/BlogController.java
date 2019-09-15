package ru.ganev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.ganev.model.Blog;
import ru.ganev.service.IBlogService;

import java.util.List;


@RestController
public class BlogController {

    @Autowired
    IBlogService blogService;

    @RequestMapping("/blog")
    @ResponseBody
    List<Blog> blog() {
        return blogService.getBlogList();
    }
}
