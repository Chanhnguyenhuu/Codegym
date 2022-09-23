package vn.codegym.kt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.codegym.kt.service.IE1Service;

@Controller
@RequestMapping("/e1")
public class E1Controller {

    @Autowired
    private IE1Service e1Service;

    @GetMapping
    public String list() {
        return "create";
    }
}
