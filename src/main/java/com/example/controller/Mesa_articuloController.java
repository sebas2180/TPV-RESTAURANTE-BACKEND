package com.example.controller;

import java.util.HashMap;

import com.example.model.mesa_articulosModel;
import com.example.service.Mesa_articuloServiceImpl;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Mesa_articuloController {
    

    @Autowired
    Mesa_articuloServiceImpl mesa_articulosServiceImpl;

    @PostMapping( value = "/item/add")
    public HashMap addPedido(@ModelAttribute mesa_articulosModel mesa_articuloParameters){
        System.out.println("PRUEBAAAAAA");
        try {
            HashMap<String,String> map = new HashMap<>();
            System.out.println(mesa_articuloParameters.getArticulo().getId());
            Long respuesta =mesa_articulosServiceImpl.save(mesa_articuloParameters);
            System.out.println(respuesta);
            map.put("id_item", String.valueOf(respuesta)) ;
            return map;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    } 
    @PostMapping(value="/item/update")
    public HashMap updateArticulo(@ModelAttribute mesa_articulosModel mesa_articulosParameters){
        HashMap<String,String> map = new HashMap();
        try {
          map.put( "repuesta",mesa_articulosServiceImpl.update(mesa_articulosParameters));
          return map;
        } catch (Exception e) {
            map.put( "repuesta",String.valueOf(e));
        }
        return null;
    }
    @RequestMapping(value = "/item/delete/**", method = RequestMethod.GET, produces = "application/json")	
    public HashMap delete(Long id) {
             return mesa_articulosServiceImpl.delete((id));
     }
}
