package com.example.Repository;

import javax.transaction.Transactional;

import com.example.model.mesa_articulosModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
@Transactional
public interface mesa_articulosRepository extends JpaRepository<mesa_articulosModel,Long> {


    mesa_articulosModel saveAndFlush(mesa_articulosModel mesa_articulosModel );
    
}
