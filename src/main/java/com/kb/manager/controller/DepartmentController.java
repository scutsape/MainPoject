package com.kb.manager.controller;

import com.kb.manager.entity.Department;
import com.kb.manager.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;


    public void setDepartmentService(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("department")
    public String department(Model model) {
        model.addAttribute("department", departmentService.findAll());
        return "department/department";
    }



    @ModelAttribute("department")
    public Department department() {
        return new Department();
    }


    @PostMapping("saveDepartment")
    public String saveDepartment(@ModelAttribute("department") Department department) {
        departmentService.save(department);
        return "redirect:/department";
    }

    @GetMapping("editDepartment-{id}")
    public String editDepartment(@ModelAttribute("id") int id, Model model) {
        Department department = departmentService.findById(id);
        model.addAttribute("department", department);
        return "department/editDepartment";
    }

    @PostMapping("editDepartment")
    public String EditDepartment(@ModelAttribute("department") Department department) {
        departmentService.save(department);
        return "redirect:/department";
    }

    @GetMapping("deleteDepartment-{delete}")
    public String deleteDepartment(@ModelAttribute("delete") int id, Model model) {
        Department department = departmentService.findById(id);
        departmentService.delete(department);
        return "redirect:/department";
    }

}
