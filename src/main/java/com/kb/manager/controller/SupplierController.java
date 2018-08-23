package com.kb.manager.controller;



import com.kb.manager.entity.Supplier;
import com.kb.manager.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SupplierController {

    @Autowired
    private SupplierService supplierService;


    public void setSupplierService(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @GetMapping("supplier")
    public String supplier(Model model) {
        model.addAttribute("supplier", supplierService.findAll());
        return "supplier/supplier";
    }

    @ModelAttribute("supplier")
    public Supplier supplier() {
        return new Supplier();
    }

    @PostMapping("saveSupplier")
    public String saveSupplier(@ModelAttribute("supplier") Supplier supplier) {
        supplierService.save(supplier);
        return "redirect:/supplier";
    }
    @GetMapping("editSupplier-{id}")
    public String editSupplier( @ModelAttribute("id") int id, Model model){
       Supplier supplier = supplierService.findById(id);
        model.addAttribute("supplier", supplier);
        return "supplier/editSupplier";
    }
    @PostMapping("editSupplier")
    public String editSuppliert ( @ModelAttribute("supplier") Supplier supplier){
        supplierService.save(supplier);
        return "redirect:/supplier";
    }
    @GetMapping("deleteSupplier-{delete}")
    public String deleteSuppliert ( @ModelAttribute("delete") int id, Model model){
           Supplier supplier = supplierService.findById(id);
           supplierService.delete(supplier);
        return "redirect:/supplier";
    }

}
