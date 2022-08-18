package vn.codegym.bt_1.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import vn.codegym.bt_1.dto.UserDto;
import vn.codegym.bt_1.model.User;

import javax.validation.Valid;

@Controller
public class FormController {

    @GetMapping("/create")
    public String showForm(Model model) {
        model.addAttribute("userDto", new UserDto());
        return "index";
    }

    @PostMapping("/create")
    public String create(@Valid @ModelAttribute("useDto") UserDto userDto, BindingResult bindingResult, Model model) {
        new UserDto().validate(userDto, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("userDto",new UserDto());
            return "index";
        } else {
            User user = new User();
            BeanUtils.copyProperties(userDto, user);
            return "result";
        }
    }
}
