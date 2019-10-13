package ru.ganev.repository;

import org.reflections.Reflections;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import javax.persistence.Entity;
import java.util.Set;

@Configuration
class RestConfigurer implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        Reflections reflections = new Reflections("ru.ganev.model");
        Set<Class<?>> idExposedClasses = reflections.getTypesAnnotatedWith(Entity.class, false);
        idExposedClasses.forEach(config::exposeIdsFor);
        RepositoryRestConfigurer.super.configureRepositoryRestConfiguration(config);
    }
}
