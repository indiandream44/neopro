package com.example.nitin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RestController
    static class FirstController {

        public FirstController() {
            super();
        }

        @RequestMapping("/")
        public String root() {
            return "<h1> Project Sayona </h1>";
        }
    }
}
