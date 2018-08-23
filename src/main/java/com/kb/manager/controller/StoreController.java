package com.kb.manager.controller;


import com.kb.manager.entity.Store;
import com.kb.manager.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
public class StoreController {
    @Autowired
    private StoreService storeService;



    public void setStoresService(StoreService storesService) {
        this.storeService = storeService;
    }

    @GetMapping("store")
    public String store(Model model) {
        model.addAttribute("store", storeService.findAll());
        return "store/store";
    }


    @ModelAttribute("store")
    public Store store() {
        return new Store();
    }




    @PostMapping("saveStore")
    public String saveStore(@ModelAttribute("store") Store store) {
        storeService.save(store);
        return "redirect:/store";
    }

    @GetMapping("editStore-{id}")
    public String editStore(@ModelAttribute("id") int id, Model model) {
        Store store = storeService.findById(id);
        model.addAttribute("sto", store);
        return "store/editStore";
    }

    @PostMapping("editStore")
    public String editStore(@ModelAttribute("store") Store store) {
        storeService.save(store);
        return "redirect:/store";
    }

    @GetMapping("deleteStore-{delete}")
    public String deleteStore(@ModelAttribute("delete") int id, Model model) {
        Store store = storeService.findById(id);
        storeService.delete(store);
        return "redirect:/store";
    }




}

