package com.example.controller;

import java.util.HashMap;
import java.util.List;

import com.example.model.SalonModel;
import com.example.service.MesaServiceImpl;
import com.example.service.SalonServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalonController {

    @Autowired
    SalonServiceImpl salonServiceimImpl;

    @GetMapping(value ="/salon/listAll")
    public List findAll(){
        List salones =  salonServiceimImpl.findAll();
        return salones;      
    }

    @PostMapping(value="/salon/add")
    public HashMap addSalon(@ModelAttribute SalonModel salonParameters){
     
        try {
            HashMap<String,String> map = new HashMap<>();
            Long repuesta = salonServiceimImpl.save(salonParameters);
            System.out.println("pruebaaaaaaaaaaa 2222");
            map.put("id_salon", String.valueOf(repuesta));
            return map;
        } catch (Exception e) {
            System.out.println("error");
        }
        return null;
    }
    
    @PostMapping(value="/salon/update")
    public HashMap updateArticulo(@ModelAttribute SalonModel salonParameters){
        HashMap<String,String> map = new HashMap();
        try {
          map.put( "repuesta",salonServiceimImpl.update(salonParameters));
          return map;
        } catch (Exception e) {
            map.put( "repuesta",String.valueOf(e));
        }
        return null;
    }
    
}
