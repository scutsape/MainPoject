package com.kb.manager.controller;

import com.kb.manager.editor.CategoriesEditor;
import com.kb.manager.editor.ProductsEditor;
import com.kb.manager.editor.SupplierEditor;
import com.kb.manager.entity.Categories;
import com.kb.manager.entity.Products;
import com.kb.manager.entity.Supplier;
import com.kb.manager.service.CategoriesService;
import com.kb.manager.service.ProductsService;
import com.kb.manager.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductsController {
    @Autowired
    private ProductsService productsService;
    @Autowired
    private ProductsEditor productsEditor;
    @Autowired
    private SupplierService supplierService;
    @Autowired
    private SupplierEditor supplierEditor;
    @Autowired
    private CategoriesService categoriesService;
    @Autowired
    private CategoriesEditor categoriesEditor;

    public void setProductsService(ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping("product")
    public String product(Model model) {
        model.addAttribute("categories", categoriesService.findAll());
        model.addAttribute("supplier", supplierService.findAll());
        model.addAttribute("product", productsService.findAllWithCategSuppl());
        model.addAttribute("prod", new Products());
        return "product/product";
    }

    @ModelAttribute("product")
    public Products products() {
        return new Products();
    }

    @PostMapping("saveProduct")
    public String saveProduct(@ModelAttribute("product") Products products) {
        productsService.save(products);
        return "redirect:/product";
    }
    @GetMapping("editProduct-{id}")
    public String editProduct( @ModelAttribute("id") int id, Model model){
        Products products = productsService.findByIdWithCategSuppl(id);
        model.addAttribute("categories", categoriesService.findAll());
        model.addAttribute("supplier", supplierService.findAll());
        model.addAttribute("product", products);
        return "product/editProduct";
    }
    @PostMapping("editProduct")
    public String editProduct ( @ModelAttribute("product") Products products){
        productsService.save(products);
        return "redirect:/product";
    }
    @GetMapping("deleteProduct-{delete}")
    public String deleteProduct ( @ModelAttribute("delete") int id, Model model){
        Products products = productsService.findById(id);
        productsService.delete(products);
        return "redirect:/product";
    }

    @InitBinder
    public void binder(WebDataBinder webDataBinder) {
        webDataBinder.registerCustomEditor(Categories.class, categoriesEditor);
        webDataBinder.registerCustomEditor(Supplier.class, supplierEditor);
        webDataBinder.registerCustomEditor(Products.class, productsEditor);

    }

}
