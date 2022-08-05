package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import vn.codegym.service.IBlogService;

@Controller
public class BlogController {
    @Autowired
    private IBlogService blogService;

    @GetMapping("list")
    public String list(Model model) {
        model.addAttribute("blogList", blogService.findAll());
        return "list";
    }

}
