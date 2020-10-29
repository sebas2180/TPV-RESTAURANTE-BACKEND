package com.example.Repository;

import javax.transaction.Transactional;

import com.example.model.MesaModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
@Transactional
public interface MesaRepository  extends JpaRepository<MesaModel,Long>{
    

    
    MesaModel saveAndFlush(MesaModel Mesamodel );
}
