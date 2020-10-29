package com.example.service;

import com.example.Repository.articuloRepository;
import com.example.interfa.IArticuloService;
import com.example.model.articuloModel;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sebastian
 */

@Service
public class articuloServiceImp implements IArticuloService{
    
    @Autowired
    private articuloRepository articuloRepository;
    

    @Override
    public Optional<articuloModel> getFile(Long id) {
        Optional<articuloModel> art =  articuloRepository.findById(id);
        System.out.println(art);
        return art;
    }
    @Override
    public Long save(articuloModel articuloModel) {
        try {
            articuloModel articuloReturn =   articuloRepository.saveAndFlush(articuloModel);
            return articuloReturn.getId();
        } catch (Exception e) {
            
            System.out.println(e);
        }
        return null;
    }

    @Override
    public List<articuloModel> getAllArticulos() {
        return   articuloRepository.findAll() ;
    }

    @Override
    public HashMap delete(Long id) {
          HashMap<String,String> map = new HashMap<>();
        if (articuloRepository.findById(id).isPresent()) {				
                    articuloRepository.deleteById(id);	
                     map.put("status", "200");
                     map.put("Mensaje", "Articulo eliminado correctamente.");
                    return map;			
                }
        map.put("status", "201");
        map.put("Mensaje", "Error! El Articulo no existe");
                return map;
    }
		
    
}