package ru.ganev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.ganev.model.Career;
import ru.ganev.service.ICareerService;

import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * Blog Controller
 *
 * @author Artyom Ganev
 */
@RestController
@RequestMapping("/career")
public class CareerController {

    @Autowired
    ICareerService careerService;

    @CrossOrigin
    @ResponseBody
    @RequestMapping("/")
    List<Career> list() {
        return careerService.getList()
                .stream()
                .sorted(Comparator.comparing(Career::getStartDate))
                .collect(Collectors.toList());
    }

    @CrossOrigin
    @GetMapping("/{id}")
    @ResponseBody
    public Career getItem(@PathVariable("id") UUID id) {
        return careerService.getItem(id);
    }
}
