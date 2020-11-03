package com.example.Repository;

import javax.transaction.Transactional;

import com.example.model.MesaModel;
import com.example.model.mesa_articulosModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
@Transactional
public interface MesaRepository  extends JpaRepository<MesaModel,Long>{
    
    @Query(value="SELECT  m.* FROM mesa m WHERE m.numero=?1", nativeQuery = true)
    public  MesaModel findBy_numero(long numero);

    MesaModel saveAndFlush(MesaModel Mesamodel );
}
