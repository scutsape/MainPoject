package com.kb.manager.controller;

import com.kb.manager.entity.Categories;
import com.kb.manager.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CategoriesController {
    @Autowired
    private CategoriesService categoriesService;

    public void setCategoriesService(CategoriesService categoriesService) {
        this.categoriesService = categoriesService;
    }

    @GetMapping("categorie")
    public String categorie(Model model) {
        model.addAttribute("categorie", categoriesService.findAll());
        return "categorie/categorie";
    }

//    @GetMapping("categories")
//    public String categories(Model model) {
//        model.addAttribute("categorie", categoriesService.findAll());
//        return "categorie/categories";
//    }

    @ModelAttribute("categorie")
    public Categories categories() {
        return new Categories();
    }


    @PostMapping("saveCategorie")
    public String saveCategorie(@ModelAttribute("categorie") Categories categories) {
        categoriesService.save(categories);
        return "redirect:/categorie";
    }

    @GetMapping("editCategorie-{id}")
    public String editCategorie(@ModelAttribute("id") int id, Model model) {
        Categories categories = categoriesService.findById(id);
           model.addAttribute("categorie", categories);

        return "categorie/editCategorie";
    }

    @PostMapping("editCategorie")
    public String editCategorie(@ModelAttribute("categorie") Categories categories) {
        categoriesService.save(categories);
        return "redirect:/categorie";
    }

    @GetMapping("deleteCategorie-{delete}")
    public String deleteCategorie(@ModelAttribute("delete") int id, Model model) {
        Categories categories = categoriesService.findById(id);
        model.addAttribute("categorie", categories);
        categoriesService.delete(categories);
        return "redirect:/categorie";
    }

}
