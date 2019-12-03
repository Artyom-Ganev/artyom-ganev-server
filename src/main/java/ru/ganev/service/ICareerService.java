package ru.ganev.service;

import ru.ganev.model.Career;

import java.util.List;
import java.util.UUID;

public interface ICareerService {

    List<Career> getList();

    Career getItem(UUID id);

}
