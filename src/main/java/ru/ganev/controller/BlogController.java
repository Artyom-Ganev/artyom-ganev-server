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
@CrossOrigin(origins = "https://shielded-brushlands-46595.herokuapp.com", maxAge = 3600)
public class BlogController {

    @Autowired
    IBlogService blogService;

    @ResponseBody
    List<Blog> blog() {
        return blogService.getBlogList();
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public Blog retrieve(@PathVariable UUID id) {
        return blogService.getBlog(id);
    }
}
