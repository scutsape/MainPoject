package com.kb.manager.controller;

import com.kb.manager.editor.*;
import com.kb.manager.entity.*;
import com.kb.manager.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrdersController {

    @Autowired
    private OrdersService ordersService;
    @Autowired
    private OrdersEditor ordersEditor;

    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerEditor customerEditor;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private EmployeeEditor employeeEditor;
    @Autowired
    private ProductsService productsService;
    @Autowired
    private ProductsEditor productsEditor;
    @Autowired
    private ServicesService servicesService;
    @Autowired
    private ServicesEditor servicesEditor;


    public void setOrdersService(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @GetMapping("order")
    public String order(Model model) {
        model.addAttribute("customer", customerService.findAll());
        model.addAttribute("employee", employeeService.findAllWithAll());
        model.addAttribute("products", productsService.findAllWithCategSuppl());
        model.addAttribute("service", servicesService.findAll());
        model.addAttribute("order", ordersService.findAllWithCustEmpCit());
        model.addAttribute("ord", new Orders());
        return "order/order";
    }


    @ModelAttribute("order")
    public Orders orders() {
        return new Orders();
    }

    @PostMapping("saveOrder")
    public String saveOrder(@ModelAttribute("order") Orders orders) {
        ordersService.save(orders);
        return "redirect:/order";
    }

    @GetMapping("editOrder-{id}")
    public String editOrder(@ModelAttribute("id") int id, Model model) {
        Orders orders = ordersService.findByIdWithCustEmpProdServ(id);
        model.addAttribute("customer", customerService.findAll());
        model.addAttribute("employee", employeeService.findAllWithAll());
        model.addAttribute("product", productsService.findAllWithCategSuppl());
        model.addAttribute("service", servicesService.findAll());
        model.addAttribute("order", orders);
        return "order/editOrder";
    }

    @PostMapping("editOrder")
    public String editOrder(@ModelAttribute("order") Orders orders) {
        ordersService.save(orders);
        return "redirect:/order";
    }

    @GetMapping("deleteOrder-{delete}")
    public String deleteOrder(@ModelAttribute("delete") int id, Model model) {
        Orders orders = ordersService.findByIdWithCustEmpProdServ(id);
        ordersService.delete(orders);
        return "redirect:/order";
    }

    @InitBinder
    public void binder(WebDataBinder webDataBinder) {
        webDataBinder.registerCustomEditor(Customer.class, customerEditor);
        webDataBinder.registerCustomEditor(Employee.class, employeeEditor);
        webDataBinder.registerCustomEditor(Products.class, productsEditor);
        webDataBinder.registerCustomEditor(Services.class, servicesEditor);
        webDataBinder.registerCustomEditor(Orders.class, ordersEditor);
    }
}
