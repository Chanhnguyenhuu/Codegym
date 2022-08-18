package vn.codegym.bt_11.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.bt_11.model.Blog;
import vn.codegym.bt_11.service.IBlogService;


@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private IBlogService blogService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("blogList", blogService.findAll());
        return "blog/list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("blog", new Blog());
        return "blog/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        blogService.create(blog);
        redirectAttributes.addFlashAttribute("message", "Tạo mới thành công");
        return "redirect:list";
    }

    @GetMapping("/edit")
    public String edit(@RequestParam int edit, Model model) {
        model.addAttribute("blog", blogService.findById(edit).get());
        return "blog/edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        blogService.create(blog);
        redirectAttributes.addFlashAttribute("message", "Cập nhật thành công");
        return "redirect:list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int delete, Model model) {
        model.addAttribute("blog", blogService.findById(delete).get());
        return "blog/delete";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam int delete, RedirectAttributes redirectAttributes) {
        blogService.delete(delete);
        redirectAttributes.addFlashAttribute("message", "Xoá thành công");
        return "redirect:list";
    }

    @GetMapping("/view")
    public String view(@RequestParam int view, Model model) {
        model.addAttribute("blog", blogService.findById(view).get());
        return "blog/view";
    }

}
