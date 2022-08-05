package vn.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.model.Email;
import vn.codegym.service.EmailService;
import vn.codegym.service.IEmailService;

import java.util.ArrayList;
import java.util.List;

@Controller

public class EmailController {

    IEmailService emailService = new EmailService();

    @GetMapping("/create")
    public String emailForm(Model model) {
        List<String> languageList = new ArrayList<>();

        languageList.add("English");
        languageList.add("Vietnamese");
        languageList.add("Japanese");
        languageList.add("Chinese");

        List<Integer> pageSizeList = new ArrayList<>();

        pageSizeList.add(5);
        pageSizeList.add(10);
        pageSizeList.add(15);
        pageSizeList.add(25);
        pageSizeList.add(50);
        pageSizeList.add(100);

        Email email = new Email();
        model.addAttribute("languageList", languageList);
        model.addAttribute("pageSizeList", pageSizeList);
        model.addAttribute("email", email);
        return "index";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Email email, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("message", "Tạo mới thành công");
        emailService.save(email);
        return "redirect:";
    }
}
