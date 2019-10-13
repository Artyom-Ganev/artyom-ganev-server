package ru.ganev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.ganev.model.Blog;
import ru.ganev.service.IBlogService;

import java.util.List;
import java.util.UUID;

/**
 * Blog Controller
 *
 * @author Artyom Ganev
 */
@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    IBlogService blogService;

    @CrossOrigin
    @ResponseBody
    @RequestMapping("/")
    List<Blog> blog() {
        return blogService.getBlogList();
    }

    @CrossOrigin
    @GetMapping("/{id}")
    @ResponseBody
    public void getBlog(@PathVariable UUID id) {
        blogService.getBlog(id);
    }
}
