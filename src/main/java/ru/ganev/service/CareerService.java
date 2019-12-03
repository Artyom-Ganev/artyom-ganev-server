package ru.ganev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ganev.model.Career;
import ru.ganev.repository.CareerRepository;

import java.util.List;
import java.util.UUID;

@Service
public class CareerService implements ICareerService {
    @Autowired
    private CareerRepository careerRepository;

    @Override
    public List<Career> getList() {
        return careerRepository.findAll();
    }

    @Override
    public Career getItem(UUID id) {
        return careerRepository.findById(id).orElse(null);
    }
}
