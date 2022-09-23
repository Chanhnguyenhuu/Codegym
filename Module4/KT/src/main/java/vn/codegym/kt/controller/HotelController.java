package vn.codegym.kt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.codegym.kt.service.IE2Service;

@Controller
@RequestMapping("/e2")
public class E2Controller {

    @Autowired
    private IE2Service e2Service;
}
