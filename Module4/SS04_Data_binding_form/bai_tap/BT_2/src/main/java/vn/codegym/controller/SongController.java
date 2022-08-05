package vn.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.model.Song;
import vn.codegym.service.ISongService;
import vn.codegym.service.SongService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SongController {

    private ISongService songService = new SongService();

    @GetMapping("/list")
    public String list(Model model) {
        List<Song> songList = songService.findAll();
        model.addAttribute("songList", songList);
        return "/list";
    }

    @GetMapping("/upload")
    public String upload(Model model) {

        List<String> categoryList = new ArrayList<>();

        categoryList.add("pop");
        categoryList.add("ballad");
        categoryList.add("rock");
        categoryList.add("jaz");

        Song song = new Song();
        model.addAttribute("song",song);
        model.addAttribute("categoryList", categoryList);
        return "/index";
    }

    @PostMapping("/upload")
    public String create(@ModelAttribute Song song, RedirectAttributes redirectAttributes) {
        songService.create(song);
        redirectAttributes.addFlashAttribute("message", "Tạo mới thành công");
        return "redirect:/list";
    }
}
