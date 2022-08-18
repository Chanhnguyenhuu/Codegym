package vn.codegym.bt_11.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.bt_11.model.Category;
import vn.codegym.bt_11.service.ICategoryService;

import java.util.Optional;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("categoryList", categoryService.findAll());
        return "/category/list";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable("id") int id, Model model) {
        model.addAttribute("category", categoryService.findById(id).get());
        return "/category/edit";
    }

    @PostMapping("/edit")
    public ModelAndView edit(@ModelAttribute("category") Category category) {
        categoryService.create(category);
        ModelAndView modelAndView = new ModelAndView("/category/edit");
        modelAndView.addObject("category", category);
        modelAndView.addObject("message", "Edit thành công");
        return modelAndView;
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("category", new Category());
        return "/category/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("category") Category category, RedirectAttributes redirectAttributes) {
        categoryService.create(category);
        redirectAttributes.addFlashAttribute("message", "Tạo mới thành công");
        return "redirect:/category/create";
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") int id) {
        Optional<Category> category = categoryService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/category/delete");
        modelAndView.addObject("category", category.get());
        modelAndView.addObject("message", "Xoá thành công");
        return modelAndView;
    }

    @PostMapping("/delete")
    public ModelAndView delete(@ModelAttribute("category") Category category) {
        categoryService.delete(category.getId());
        ModelAndView modelAndView = new ModelAndView("/category/delete");
        modelAndView.addObject("message", "Xoá thành công");
        return modelAndView;
    }
}
