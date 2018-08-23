package com.kb.manager.controller;



import com.kb.manager.entity.Dependent;
import com.kb.manager.service.DependentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DependentController {
    @Autowired
    private DependentService dependentService;


    public void setDependentService(DependentService dependentService) {
        this.dependentService = dependentService;
    }

    @GetMapping("dependent")
    public String dependent(Model model) {
        model.addAttribute("dependent", dependentService.findAll());
        return "dependent/dependent";
    }

    @ModelAttribute("dependent")
    public Dependent dependent() {
        return new Dependent();
    }

    @PostMapping("saveDependent")
    public String saveDependent(@ModelAttribute("dependent") Dependent dependent) {
        dependentService.save(dependent);
        return "redirect:/dependent";
    }
    @GetMapping("editDependent-{id}")
    public String editDependent( @ModelAttribute("id") int id, Model model){
       Dependent dependent = dependentService.findById(id);
        model.addAttribute("dependent", dependent);
        return "dependent/editDependent";
    }
    @PostMapping("editDependent")
    public String editDependent ( @ModelAttribute("dependent") Dependent dependent){
        dependentService.save(dependent);
        return "redirect:/dependent";
    }
    @GetMapping("deleteDependent-{delete}")
        public String deleteDependent ( @ModelAttribute("delete") int id, Model model){
           Dependent dependent = dependentService.findById(id);
           dependentService.delete(dependent);
            return "redirect:/dependent";
        }


}
