package com.example.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="mesa_articulo")
public class mesa_articulosModel {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    private Long id;

    @Column(name = "cantidad")
    private Long cantidad;

    @ManyToOne
    @JoinColumn(name="id_mesa")
    private MesaModel mesa;

    @ManyToOne
    @JoinColumn(name="id_articulo")
    private articuloModel articulo;


    
        // GETTS AND SETTERS


    public mesa_articulosModel() {
    }
    

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return MesaModel return the mesa
     */
    public MesaModel getMesa() {
        return mesa;
    }

    /**
     * @param mesa the mesa to set
     */
    public void setMesa(MesaModel mesa) {
        this.mesa = mesa;
    }

    /**
     * @return articuloModel return the articulo
     */
    public articuloModel getArticulo() {
        return articulo;
    }

    /**
     * @param articulo the articulo to set
     */
    public void setArticulo(articuloModel articulo) {
        this.articulo = articulo;
    }

    /**
     * @return Long return the cantidad
     */
    public Long getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

}
