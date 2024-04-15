package ru.maxima.user_controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/hello-user")
    public String sayHelloUser(Model model) {
        String userName = "Ivan Pupkin";
        model.addAttribute("userName", userName);
        return "user/hello-user";
    }
}
