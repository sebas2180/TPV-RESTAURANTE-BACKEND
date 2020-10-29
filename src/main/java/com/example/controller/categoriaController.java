package com.example.controller;

import com.example.model.CategoriaModel;
import com.example.service.CategoriaServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class categoriaController {
    

    @Autowired
    CategoriaServiceImpl categoriaServImpl;

    @GetMapping( value = "/categoria/listall")
    public List getAllCategorias(){

        List categorias = categoriaServImpl.getAllArticulos();
        return categorias;
    }
    @PostMapping( value = "/categoria/add")
    public HashMap addCategoria(@ModelAttribute CategoriaModel categoria) {
        try {
            HashMap<String,String> hash = new HashMap<>();
            Long repuesta = categoriaServImpl.save(categoria);
            hash.put("id", String.valueOf(repuesta));
            return hash;
        } catch (Exception e) {
           System.out.println(e);
        }
        return null;

    }
}