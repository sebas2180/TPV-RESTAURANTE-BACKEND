package com.example.Repository;

import javax.transaction.Transactional;

import com.example.model.MesaModel;
import com.example.model.detalle_facturaModel;
import com.example.model.mesa_articulosModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
@Transactional
public interface MesaRepository  extends JpaRepository<MesaModel,Long>{
    
    @Query(value="SELECT  m.* FROM mesa m WHERE m.numero=?1", nativeQuery = true)
    public  MesaModel findBy_numero(long numero);

        @Query(value="select   (i.porcentaje/100) AS porcentaje_iva,   SUM(((ma.cantidad * a.price_neto)/100)*i.porcentaje) as cuota,"+
                        "SUM( ma.cantidad * a.price_neto ) as total_mesa from mesa_articulo ma "+
                        "INNER JOIN mesa m ON ma.id_mesa= m.id "+
                        "INNER JOIN articulo a ON ma.id_articulo = a.id "+
                        "INNER JOIN categoria c ON a.id_categoria = c.id "+
                        "INNER JOIN iva i ON c.id_iva = i.id_iva "+
                        "WHERE m.numero=?1", nativeQuery = true)
        public  detalle_facturaModel findTotalBy_numero(long numero);


    MesaModel saveAndFlush(MesaModel Mesamodel );


}
