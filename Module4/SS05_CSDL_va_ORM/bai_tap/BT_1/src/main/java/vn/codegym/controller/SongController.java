package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.model.Song;
import vn.codegym.service.ISongService;

@Controller
public class SongController {
    @Autowired
    private ISongService songService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("songList", songService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String createForm(Model model) {
        Song song = new Song();
        model.addAttribute("song", song);
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Song song, Model model, RedirectAttributes redirectAttributes) {
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
        Song song = songService.findOne(edit);
        model.addAttribute("song", song);
        return "update";
    }

    @PostMapping("/update")
    public String edit(@ModelAttribute Song song, RedirectAttributes redirectAttributes) {
        songService.update(song);
        redirectAttributes.addFlashAttribute("message", "Cập nhật bài hát thành công");
        return "redirect:/list";
    }
}
