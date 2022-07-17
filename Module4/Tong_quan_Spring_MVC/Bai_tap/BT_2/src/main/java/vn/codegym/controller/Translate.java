package vn.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Translate {

    @GetMapping("/translate")
    public String translate() {
        return "index";
    }

    @PostMapping("/translate")
    public String translate(@RequestParam String word, Model model) {
        String result = null;
        String[] english = {"hello", "banana", "orange", "school"};
        String[] vietnam = {"xin chào", "chuối", "orange", "trường học"};
        for (int i = 0; i < english.length; i++) {
            if (english[i].equals(word)) {
                result = vietnam[i];
                break;
            } else {
                result = "Không tìm thấy kết quả";
            }
        }
        model.addAttribute("result", result);
        return "index";
    }
}
