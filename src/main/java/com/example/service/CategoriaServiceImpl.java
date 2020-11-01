/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.service;

import java.util.List;

import com.example.Repository.CategoriaRepository;
import com.example.interfa.ICategoriaService;
import com.example.model.CategoriaModel;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sebas
 */

 @Service
public class CategoriaServiceImpl implements ICategoriaService {

    @Autowired
    private CategoriaRepository CategoriaRepository;
    @Override
    public List<CategoriaModel> getAllArticulos() {
        
        return CategoriaRepository.findAll();
    }

    @Override
    public Long save(CategoriaModel categoriaModel) {
        try {
            CategoriaModel categoriaReturn = CategoriaRepository.saveAndFlush(categoriaModel);
            return categoriaReturn.getId();
        } catch (Exception e) {
           System.out.println(e);
        }
        return null;
    }

    @Override
    public String update(CategoriaModel categoriaParameters) {
        Optional<CategoriaModel> categoriaOptional = CategoriaRepository.findById(categoriaParameters.getId());
        if (!categoriaOptional.isPresent()){
            String repuesta =  "item no encontrado.";
            return repuesta;
        }
        CategoriaRepository.save(categoriaParameters);
        
        String repuesta =  "Actualización exitosa.";
        return repuesta;
  
    }
    
}
