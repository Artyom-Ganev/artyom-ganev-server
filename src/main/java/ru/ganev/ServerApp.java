package ru.ganev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

/**
 * Server Application main class
 *
 * @author Artyom Ganev
 */
@Controller
@SpringBootApplication
public class ServerApp {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ServerApp.class, args);
    }
}
