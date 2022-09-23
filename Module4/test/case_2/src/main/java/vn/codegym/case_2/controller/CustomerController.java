package vn.codegym.case_2.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.case_2.dto.CustomerDto;
import vn.codegym.case_2.model.Customer;
import vn.codegym.case_2.service.ICustomerService;
import vn.codegym.case_2.service.ICustomerTypeService;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @Autowired
    private ICustomerTypeService customerTypeService;

    @GetMapping
    public String list(Model model,
                       @PageableDefault(value = 2) Pageable pageable,
                       @RequestParam(value = "key", required = false, defaultValue = "") String key,
                       @RequestParam(value = "value", required = false, defaultValue = "") String value) {
        model.addAttribute("key", key);
        model.addAttribute("value", value);
        model.addAttribute("customers", customerService.find(key, value, pageable));
        return "customer/list";
    }

    @GetMapping("/create")
    public ModelAndView create() {
        ModelAndView modelAndView = new ModelAndView("customer/create", "customer", new CustomerDto());
        return modelAndView;
    }

    @PostMapping("/create")
    public String create(@Validated @ModelAttribute("customer") CustomerDto customerDto,
                         BindingResult bindingResult, Model model,
                         RedirectAttributes redirectAttributes) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("customer", customerDto);
            return "customer/create";
        } else {
            Customer customer = new Customer();
            BeanUtils.copyProperties(customerDto, customer);
            customerService.create(customer);
            redirectAttributes.addFlashAttribute("message", "Tạo mới thành công");
            return "redirect:/customers";
        }
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        CustomerDto customerDto = new CustomerDto();
        Customer customer = customerService.findById(id).get();
        BeanUtils.copyProperties(customer, customerDto);
        model.addAttribute("customer", customerDto);
        return "customer/edit";
    }

    @PostMapping("/edit")
    public String edit(@Validated @ModelAttribute("customer") CustomerDto customerDto,
                       BindingResult bindingResult,
                       RedirectAttributes redirectAttributes,
                       Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("customer", customerDto);
            return "customer/edit";
        } else {
            Customer customer = new Customer();
            BeanUtils.copyProperties(customerDto, customer);
            customerService.edit(customer);
            redirectAttributes.addFlashAttribute("message", "Cập nhật thành công");
            return "redirect:/customers";
        }
    }
}
