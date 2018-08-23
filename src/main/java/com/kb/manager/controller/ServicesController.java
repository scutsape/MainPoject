package com.kb.manager.controller;


import com.kb.manager.entity.Services;
import com.kb.manager.service.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ServicesController {
    @Autowired
    private ServicesService servicesService;

    public void setServicesService(ServicesService servicesService) {
        this.servicesService = servicesService;
    }

    @GetMapping("service")
    public String service(Model model) {
        model.addAttribute("service", servicesService.findAll());
        return "service/service";
    }

    @ModelAttribute("service")
    public Services services() {
        return new Services();
    }

    @PostMapping("saveService")
    public String saveService(@ModelAttribute("service") Services services) {
        servicesService.save(services);
        return "redirect:/service";
    }
    @GetMapping("editService-{id}")
    public String editService( @ModelAttribute("id") int id, Model model){
        Services services = servicesService.findById(id);
        model.addAttribute("service", services);
        return "service/editService";
    }
    @PostMapping("editService")
    public String editService ( @ModelAttribute("service") Services services){
        servicesService.save(services);
        return "redirect:/service";
}
    @GetMapping("deleteService-{delete}")
    public String deleteService ( @ModelAttribute("delete") int id, Model model){
        Services services = servicesService.findById(id);
        servicesService.delete(services);
        return "redirect:/service";
    }
}
