/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.service;

import com.example.Repository.personaRepository;
import com.example.model.PersonaModel;
import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import com.example.interfa.IPersonaService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;


/**
 *
 * @author Sebas
 */

@Service
public class PersonaServiceImpl implements IPersonaService{

//
    @Autowired
    personaRepository personaRepository;
    
    
    @Override
    public List<PersonaModel> findAll() {
      try{
          System.out.println("pruebaaaa 4" );
        return  personaRepository.findAll();
      }catch(Exception e) {
          System.out.println(e);
          return null;
      }
    }

    /**
     *
     * @param persona
     * @return
     */
    @Override
    public Long save(PersonaModel persona) {
        
              try{
        PersonaModel personaReturn =  personaRepository.saveAndFlush(persona);
         return personaReturn.getId();
       }catch(Exception e) {
                  System.out.println(e);
           return null;
       }
 
  
    }

    @Override
    public Optional<PersonaModel> ListId(int id) {
        return null;
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     
}
