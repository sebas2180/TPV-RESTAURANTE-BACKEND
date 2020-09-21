/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.interfa;
import java.util.List;
import com.example.model.PersonaModel;
import java.util.Optional;

/**
 *
 * @author Sebas
 */

public interface IPersonaService {
    
    public List<PersonaModel>findAll();
    
    
    public Long save(PersonaModel persona);

    public void delete(int id);
    
    public Optional<PersonaModel>ListId(int id);
 
}