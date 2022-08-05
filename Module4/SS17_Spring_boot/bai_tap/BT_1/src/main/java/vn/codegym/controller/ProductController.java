package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import vn.codegym.service.IProductService;

@Controller
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("productList", productService.findAll());
        return "list";
    }
}
