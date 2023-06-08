package com.example.democrud.controller;


import com.example.democrud.service.api.PersonaServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonaController {

    @Autowired
    private PersonaServiceAPI personaServiceAPI;

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("list", personaServiceAPI.getAll());
        return "index";

    }

    @GetMapping("/save/{id}")
    public  String save(@PathVariable("id") Long id, Model model){
        return "save";
    }

}
