/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Repository;
import com.example.model.articuloModel;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sebastian
 */
@Repository
@Transactional
public interface articuloRepository extends JpaRepository<articuloModel, Long> {


    articuloModel saveAndFlush(articuloModel articuloModel);


    @Query(value="SELECT a.* FROM articulo a WHERE a.id_categoria=?1", nativeQuery = true)
   public  List<articuloModel> findById_categoria(Long id_categori);
    

//    @Query("SELECT * FROM articulo  WHERE id_categoria=id_categori")
    // public Optional<articuloModel> findById_categoria(@Param("id_categoria") Long id_categori);

}
