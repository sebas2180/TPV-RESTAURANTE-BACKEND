/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Repository;
import com.example.model.articuloModel;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sebastian
 */
@Repository
@Transactional
public interface articuloRepository extends JpaRepository<articuloModel, Long> {


    articuloModel saveAndFlush(articuloModel articuloModel);


    
}
