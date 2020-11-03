package com.example.Repository;

import java.util.List;

import javax.transaction.Transactional;

import com.example.model.mesa_articulosModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
@Transactional
public interface mesa_articulosRepository extends JpaRepository<mesa_articulosModel,Long> {


    mesa_articulosModel saveAndFlush(mesa_articulosModel mesa_articulosModel );

    @Query(value="SELECT  a.id FROM mesa_articulo a WHERE a.id_mesa=?1 AND a.id_articulo=?2", nativeQuery = true)
    public  String exist_item(long id_categoria, long id_articulo);

    @Query(value="SELECT  i.* FROM mesa_articulo i INNER JOIN mesa m  ON i.id_mesa=m.id WHERE m.numero=?1 ", nativeQuery = true)
    public  List<mesa_articulosModel> findBy_nroMesa(long numero);
    
    
}
