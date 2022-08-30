package vn.codegym.bt_1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.codegym.bt_1.model.Blog;
import vn.codegym.bt_1.service.IBlogService;

import java.util.List;

@Controller
public class BlogController {

    @Autowired
    private IBlogService blogService;

    @GetMapping
    public String getAllBlog(Model model) {
        model.addAttribute("blogs", blogService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("blog", new Blog());
        return "create";
    }

//    @PostMapping("/create")
//    public String create(@ModelAttribute Blog blog) {
//        blogService.create(blog);
//        return "redirect:/";
//    }

    @PostMapping("create")
    public ResponseEntity<List<Blog>> create(@RequestParam("name") String name,
                                             @RequestParam("date") String date,
                                             @RequestParam("category") String category,
                                             @RequestParam("content") String content,
                                             @RequestParam("img") String img) {
        Blog blog = new Blog(name, date, category, content, img);
        blogService.create(blog);
        return new ResponseEntity<>(blogService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/delete/{id}")
    public ResponseEntity<List<Blog>> delete(@PathVariable int id) {
        if (blogService.findById(id) == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        blogService.delete(id);
        return new ResponseEntity<>(blogService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id).get());
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Blog blog) {
        blogService.update(blog);
        return "redirect:/";
    }


}
