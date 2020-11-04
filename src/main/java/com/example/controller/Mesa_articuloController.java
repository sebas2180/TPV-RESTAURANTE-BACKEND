package com.example.controller;

import java.util.HashMap;
import java.util.List;

import com.example.model.mesa_articulosModel;
import com.example.service.Mesa_articuloServiceImpl;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Mesa_articuloController {
    

    @Autowired
    Mesa_articuloServiceImpl mesa_articulosServiceImpl;

   
    @RequestMapping(value = "/item/findBy_nroMesa/{numero}", method = RequestMethod.GET)
    @ResponseBody	
    public List<mesa_articulosModel> findBy_nroMesa(@PathVariable final Long numero){
        return mesa_articulosServiceImpl.findBy_nroMesa(numero);

    }



    @PostMapping( value = "/item/add")
    public HashMap addPedido(@RequestBody mesa_articulosModel mesa_articuloParameters){
        HashMap<String,String> map = new HashMap<>();
        try {
            Long respuesta =mesa_articulosServiceImpl.save(mesa_articuloParameters);
            map.put("status", String.valueOf(200));
            map.put("message", "Guardado exitoso.");
            map.put("id_item", String.valueOf(respuesta));
            return map;
        } catch (Exception e) {
            System.out.println(e);
            map.put("status", String.valueOf(500));
            map.put("message", "Error al guardar el item");
            
        }
        return map;
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
