package ru.ganev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @ResponseBody
    @RequestMapping("/")
    String startPage() {
        return "https://shielded-brushlands-46595.herokuapp.com/actuator/health";
    }
}
