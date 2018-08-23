package com.kb.manager.controller;


import com.kb.manager.editor.DepartmentEditor;
import com.kb.manager.editor.DependentEditor;
import com.kb.manager.editor.EmployeeEditor;
import com.kb.manager.editor.StoreEditor;
import com.kb.manager.entity.*;
import com.kb.manager.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private EmployeeEditor employeeEditor;
    @Autowired
    private StoreService storeService;
    @Autowired
    private StoreEditor storeEditor;
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private DepartmentEditor departmentEditor;
    @Autowired
    private DependentEditor dependentEditor;
    @Autowired
    private DependentService dependentService;



    public void setWorkersService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("employee")
    public String employee(Model model) {
        model.addAttribute("stores", storeService.findAll());
        model.addAttribute("department", departmentService.findAll());
        model.addAttribute("dependent", dependentService.findAll());
        model.addAttribute("employee", employeeService.findAllWithAll());
        model.addAttribute("emptyEmployee", new Employee());
        return "employee/employee";
    }


    @ModelAttribute("employee")
    public Employee employee() {
        return new Employee();
    }

    @PostMapping("saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.save(employee);
        return "redirect:/employee";
    }

    @GetMapping("editEmployee-{id}")
    public String editEmployee(@ModelAttribute("id") int id, Model model) {
        Employee employee = employeeService.findByIdWithStores(id);
        model.addAttribute("stores", storeService.findAll());
        model.addAttribute("department", departmentService.findAll());
        model.addAttribute("dependent", dependentService.findAll());
        model.addAttribute("employee", employee);
        return "employee/editEmployee";
    }

    @PostMapping("editEmployee")
    public String EditEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.save(employee);
        return "redirect:/employee";
    }

    @GetMapping("deleteEmployee-{delete}")
    public String deleteEmployee(@ModelAttribute("delete") int id, Model model) {
        Employee employee = employeeService.findById(id);
        employeeService.delete(employee);
        return "redirect:/employee";
    }

    @InitBinder
    public void binder(WebDataBinder webDataBinder) {
        webDataBinder.registerCustomEditor(Store.class, storeEditor);
        webDataBinder.registerCustomEditor(Department.class, departmentEditor);
        webDataBinder.registerCustomEditor(Dependent.class, dependentEditor);
        webDataBinder.registerCustomEditor(Employee.class, employeeEditor);
    }


}
