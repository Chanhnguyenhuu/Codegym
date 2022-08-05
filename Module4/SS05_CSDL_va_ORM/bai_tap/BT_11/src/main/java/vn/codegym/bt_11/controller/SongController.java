package vn.codegym.bt_11.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.bt_11.model.Song;
import vn.codegym.bt_11.service.ICategoryService;
import vn.codegym.bt_11.service.ISongService;

import java.util.Optional;

@Controller
public class SongController {
    @Autowired
    private ISongService songService;
    @Autowired
    private ICategoryService categoryService;

    @RequestMapping("/list")
    public String list(Model model) {
        model.addAttribute("songList", songService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String createForm(Model model) {
        model.addAttribute("song", new Song());
        model.addAttribute("categoryList", categoryService.findAll());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Song song, RedirectAttributes redirectAttributes) {
        songService.create(song);
        redirectAttributes.addFlashAttribute("message", "Tạo mới bài hát "+song.getName() +" do ca sĩ "+ song.getSinger()+" trình bày thành công");
        return "redirect:/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int delete, RedirectAttributes redirectAttributes) {
        songService.delete(delete);
        redirectAttributes.addFlashAttribute("message", "Xoá bài hát thành công");
        return "redirect:/list";
    }

    @GetMapping("/edit")
    public String edit(@RequestParam int edit, Model model) {
        Optional<Song> song = songService.findById(edit);
        model.addAttribute("song", song.get());
        model.addAttribute("categoryList", categoryService.findAll());
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Song song, RedirectAttributes redirectAttributes) {
        songService.update(song);
        redirectAttributes.addFlashAttribute("message", "Cập nhật bài hát "+song.getName() +" do ca sĩ "+ song.getSinger()+" trình bày thành công");
        return "redirect:/list";
    }
}
