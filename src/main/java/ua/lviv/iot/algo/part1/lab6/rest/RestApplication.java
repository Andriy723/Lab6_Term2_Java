package ua.lviv.iot.algo.part1.lab6.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"ua.lviv.iot.algo.part1.lab6.rest",
        "ua.lviv.iot.algo.part1.lab6.rest.controller",
        "ua.lviv.iot.algo.part1.lab6.business",
        "ua.lviv.iot.algo.part1.lab6.repository"})

@EnableJpaRepositories({"ua.lviv.iot.algo.part1.lab6.rest.controller"})
public class RestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApplication.class, args);
    }
}