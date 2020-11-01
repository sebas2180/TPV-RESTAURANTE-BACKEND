 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.controller;

import com.example.model.articuloModel;
import com.example.service.articuloServiceImp;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sebastian
 */

@RestController
public class articuloController {
    
    
    @Autowired
    articuloServiceImp articulosImp;
    
    
    @GetMapping(value ="/articulo/listAll")
    public List findAll(){
        List personas =  articulosImp.getAllArticulos();
        return personas;      
    }

    @RequestMapping(value = "/articulo/categoria/{id_categoria}", method = RequestMethod.GET)
    @ResponseBody	
    public List<articuloModel> findToCategoria(@PathVariable final String id_categoria) {
        List articulos =  articulosImp.getArticuloToCategoria(Long.parseLong(id_categoria));
        return articulos;     
       // return new ResponseEntity<>(articulosImp.getArticuloToCategoria(id_categoria),HttpStatus.OK); 
    }


    @PostMapping(value="/articulo/add")
    public HashMap addArticulo(@ModelAttribute articuloModel articulo){
        try {
             HashMap<String,String> map = new HashMap<>();
        Long repuesta = articulosImp.save(articulo);
        map.put("id_articulo",String.valueOf(repuesta));
        return map;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
        
    }
    @PostMapping(value="/articulo/update")
    public HashMap updateArticulo(@ModelAttribute articuloModel articuloParameters){
        HashMap<String,String> map = new HashMap();
        try {
          map.put( "repuesta",articulosImp.update(articuloParameters));
          return map;
        } catch (Exception e) {
            map.put( "repuesta",String.valueOf(e));
        }
        return null;
    }


   @RequestMapping(value = "/articulo/delete/**", method = RequestMethod.GET, produces = "application/json")	
   public HashMap delete(Long id) {
            return articulosImp.delete((id));
    }
   @RequestMapping(value = "/articulo/get/**", method = RequestMethod.GET, produces = "application/json")	
   public Optional<articuloModel> getArticulo(Long id ){
       return articulosImp.getFile(id);

       
   }
            
}
 