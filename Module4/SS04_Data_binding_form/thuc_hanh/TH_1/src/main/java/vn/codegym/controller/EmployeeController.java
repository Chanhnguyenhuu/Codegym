package vn.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.codegym.model.Employee;

@Controller
//@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/showform")
    public String showForm(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "index";
    }

    @PostMapping("/addEmployee")
    public String information(@ModelAttribute Employee employee, Model model) {
//        model.addAttribute("id",employee.getId());
//        model.addAttribute("name",employee.getName());
//        model.addAttribute("contactNumber",employee.getContactNumber());
        model.addAttribute("employee", employee);
        return "infor";
    }
}
