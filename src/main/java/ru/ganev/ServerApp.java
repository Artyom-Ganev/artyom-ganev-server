package ru.ganev;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import javax.sql.DataSource;

@Controller
@SpringBootApplication
public class ServerApp {

    private static final String DRIVER_CLASS_NAME = "org.postgresql.Driver";

    @Value("${spring.datasource.url}")
    private String dbUrl;

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ServerApp.class, args);
    }

    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                .driverClassName(DRIVER_CLASS_NAME)
                .url(dbUrl)
                .build();
    }

}
