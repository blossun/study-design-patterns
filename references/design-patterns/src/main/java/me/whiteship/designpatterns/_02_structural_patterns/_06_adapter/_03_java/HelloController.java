package me.whiteship.designpatterns._02_structural_patterns._06_adapter._03_java;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hi";
    }

}
