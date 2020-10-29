/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Repository;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;
import com.example.model.CategoriaModel;
 

/**
 *
 * @author Sebas
 */

@Repository
@Transactional
public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long>{


    CategoriaModel saveAndFlush(CategoriaModel categorialModel );
    
}
