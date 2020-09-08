/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


 
package com.example.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.*;


import org.springframework.web.bind.annotation.RequestMethod;
import com.example.service.PersonaServiceImpl;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.HashMap;
import java.util.List;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;


 
/**
 *
 * @author Sebas
 */
@RestController   
public class personaController {
    
    @Autowired
    private PersonaServiceImpl IpersonaService;
    
 
    
    @GetMapping(value ="/list")
    public List listPersona(Model model) {
        System.out.println("pruebaaaa" );
        List personas = IpersonaService.findAll();
        System.out.println("pruebaaaa 2");
        model.addAttribute("personas",personas);
        System.out.println("pruebaaaa 3" );
        return  personas;
    } 
    
    @GetMapping(value ="/Optional")
    public String Optional() {
        
        return "okey";
    } 
    
    
    @PostMapping(value ="/add")
    public HashMap addPersona(@ModelAttribute PersonaModel persona  ){
        HashMap<String, String> map = new HashMap<>();
        Long repuesta = IpersonaService.save(persona);
        System.out.println(repuesta);
        System.out.println("com.example.controller.personaController.addPersona()");
        map.put("id_persona", String.valueOf(repuesta));
        return map;
    }
}
