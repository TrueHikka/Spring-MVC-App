package ru.maxima.calc_controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/calc")
public class CalculatorController {
    @GetMapping("/calculator")
    public String sayHelloUser(HttpServletRequest request, Model model) {
        String a = request.getParameter("par1");
        String b = request.getParameter("par2");
        String action = request.getParameter("action");

        Calculator calculator = new Calculator();

        String resultClass = switch (action) {
            case "add" -> "result-add";
            case "subtract" -> "result-subtract";
            case "multiply" -> "result-multiply";
            case "divide" -> "result-divide";
            default -> "result";
        };

        try {
            Double result = calculator.calculate(a, b, action);
            model.addAttribute("result", result);
            model.addAttribute("resultClass", resultClass);
            model.addAttribute("action", action);
        } catch (IllegalArgumentException e) {
            model.addAttribute("error", e.getMessage());
        }

        return "calculator/calculator";
    }
}
