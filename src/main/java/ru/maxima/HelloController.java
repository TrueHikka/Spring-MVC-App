package ru.maxima;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// localhost:8080/hello
@Controller
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        return "world/hello-world-from-package-views";
    }




}
