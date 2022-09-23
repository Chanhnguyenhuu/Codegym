package vn.codegym.kt_2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.codegym.kt_2.service.IQuestionContentService;
import vn.codegym.kt_2.service.IQuestionTypeService;

@Controller
public class QuestionContentController {

    @Autowired
    private IQuestionContentService questionContentService;

    @Autowired
    private IQuestionTypeService questionTypeService;

    @GetMapping
    public String list(Model model,
                       @PageableDefault(value = 2) Pageable pageable,
                       @RequestParam(value = "key", required = false, defaultValue = "") String key,
                       @RequestParam(value = "value", required = false, defaultValue = "") String value) {
        model.addAttribute("key", key);
        model.addAttribute("value", value);
        model.addAttribute("questionContent", questionContentService.findAll(pageable));
        return "list";
    }
}
