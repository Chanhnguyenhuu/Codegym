package vn.codegym.case_1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.codegym.case_1.model.Customer;
import vn.codegym.case_1.service.ICustomerService;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping
    public String list(Model model) {
        model.addAttribute("customers", customerService.findAll());
        return "customer/list";
    }

    @PostMapping("/delete/{id}")
    public ResponseEntity<List<Customer>> delete(@PathVariable Long id) {
        if (customerService.findById(id) == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        customerService.delete(id);
        return new ResponseEntity<>(customerService.findAll(), HttpStatus.OK);
    }
}
