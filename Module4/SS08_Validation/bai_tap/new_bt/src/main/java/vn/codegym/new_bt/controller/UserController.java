package vn.codegym.new_bt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import vn.codegym.new_bt.dto.UserDto;
import vn.codegym.new_bt.model.User;

@Controller
public class UserController {
    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("userDto", new UserDto());
        return "index";
    }

    @PostMapping("/create")
    public String create(@Validated @ModelAttribute("userDto") UserDto userDto, BindingResult bindingResult, Model model) {
        new UserDto().validate(userDto, bindingResult);
        if(bindingResult.hasFieldErrors()) {
//            model.addAttribute("userDto", userDto);
            return "index";
        }
        else {
            User user = new User();
            return "result";
        }
    }
}
