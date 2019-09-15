package ru.ganev.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BlogController {

    @RequestMapping("/blog")
    String blog() {
        return "Hello";
    }
}
