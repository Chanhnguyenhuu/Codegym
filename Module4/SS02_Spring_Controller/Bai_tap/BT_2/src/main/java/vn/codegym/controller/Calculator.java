package vn.codegym.controller;

import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculator {

    @GetMapping
    public String view() {
        return "index";
    }

    @PostMapping
    public String action(@RequestParam String calculator, int a, int b, Model model) {
        int result = 0;
        switch (calculator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
        }
        model.addAttribute("result", result);
        return "index";
    }
}
