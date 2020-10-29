/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author sebastian
 */
@Entity
@Table(name="articulo")
public class articuloModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "native")
    @GenericGenerator(name="native",strategy = "native")
    private Long id;


    @Column(name = "description")
    private String description;
    
    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private CategoriaModel Categoria;
    
    @Column(name = "price_neto")
    private double price_neto;

    @Column(name="importe_iva")
    private double importe_iva;
    
    @Column(name = "title")
    private String title;

    @Column(name = "created_at")        
    private Calendar created_at;
    
    @Column(name = "status")
    private String status;


  


        // GETTS AND SETTERS


    public articuloModel() {
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
     * @return String return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return CategoriaModel return the Categoria
     */
    public CategoriaModel getCategoria() {
        return Categoria;
    }

    /**
     * @param Categoria the Categoria to set
     */
    public void setCategoria(CategoriaModel Categoria) {
        this.Categoria = Categoria;
    }

    /**
     * @return double return the price_neto
     */
    public double getPrice_neto() {
        return price_neto;
    }

    /**
     * @param price_neto the price_neto to set
     */
    public void setPrice_neto(double price_neto) {
        this.price_neto = price_neto;
    }

    /**
     * @return double return the importe_iva
     */
    public double getImporte_iva() {
        return importe_iva;
    }

    /**
     * @param importe_iva the importe_iva to set
     */
    public void setImporte_iva(double importe_iva) {
        this.importe_iva = importe_iva;
    }

    /**
     * @return String return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return Calendar return the created_at
     */
    public Calendar getCreated_at() {
        return created_at;
    }

    /**
     * @param created_at the created_at to set
     */
    public void setCreated_at(Calendar created_at) {
        this.created_at = created_at;
    }

    /**
     * @return String return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

}
