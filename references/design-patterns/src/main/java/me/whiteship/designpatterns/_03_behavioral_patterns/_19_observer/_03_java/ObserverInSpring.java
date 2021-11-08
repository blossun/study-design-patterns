package me.whiteship.designpatterns._03_behavioral_patterns._19_observer._03_java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ObserverInSpring {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ObserverInSpring.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);
    }

}
