package com.kb.manager.controller;

import com.kb.manager.entity.Employee;
import com.kb.manager.service.MailService;
import com.kb.manager.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;


@Controller
public class MainController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private MailService mailService;

    @GetMapping("/")
    public String firstPage() {
        return "login";
    }

    @GetMapping("welcome")
    public String welcome(Model model, Principal principal) {
        System.out.println("LOGIN DEFAULT URL");
        model.addAttribute("principal", principal != null ? principal.getName() : "anaon");
        return "welcome";
    }

    @PostMapping("login")
    public String login(@ModelAttribute("log") Employee employee) {
        return "welcome";
    }

    @GetMapping("login")
    public String login() {
        return "login";
    }

    @GetMapping("lostPassword")
    public String lostPassword(Model model) {
        return "lostPassword";
    }

    @PostMapping("sendEmail")
    public String sendEmail(Employee employee) {
        mailService.sendEmail(employee);
        return "lostPassword";
    }

    @GetMapping("/citySerarch")
    public String citySerarch(){
        return "citySerarch";
    }


}
