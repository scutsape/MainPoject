package com.kb.manager.controller;



import com.kb.manager.entity.*;

import com.kb.manager.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;



    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("customer")
    public String customer(Model model) {
        model.addAttribute("cust", customerService.findAll());
        model.addAttribute("custom", new Customer());
        return "customer/customer";
    }


    @ModelAttribute("cust")
    public Customer customer() {
        return new Customer();
    }

    @PostMapping("saveCustomer")
    public String saveCustomer(@ModelAttribute("cust") Customer customer) {
        customerService.save(customer);
        return "redirect:/customer";
    }

    @GetMapping("editCustomer-{id}")
    public String editCustomer(@ModelAttribute("id") int id, Model model) {
        Customer customer = customerService.findById(id);
        model.addAttribute("cust", customer);
        return "customer/editCustomer";
    }

    @PostMapping("editCustomer")
    public String editCustomer(@ModelAttribute("cust") Customer customer) {
        customerService.save(customer);
        return "redirect:/customer";
    }

    @GetMapping("deleteCustomer-{delete}")
    public String deleteCustomer(@ModelAttribute("delete") int id, Model model) {
        Customer customer = customerService.findById(id);
        customerService.delete(customer);
        return "redirect:/customer";
    }


}
