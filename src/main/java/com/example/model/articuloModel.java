/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model;

import java.util.Calendar;
import java.util.logging.Logger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
    @GenericGenerator(name="native",strategy = "native")
    private Long id;

    @Column(name = "id_usuario")
    private Integer id_usuario;
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "Category")
    private String Category;
    
    @Column(name = "price")
    private double price;
    
    @Column(name = "title")
    private String title;

    @Column(name = "created_at")        
    private Calendar created_at;
    
    @Column(name = "status")
    private String status;
  

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    
    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return Category;
    }

    
    public double getPrice() {
        return price;
    }

    public Calendar getCreated_at() {
        return created_at;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCreated_at(Calendar created_at) {
        this.created_at = created_at;
    }

    public articuloModel() {
    }



    public String getStatus() {
        return status;
    }

  

    public void setStatus(String status) {
        this.status = status;
    }

    
    public articuloModel(Integer id_usuario, String Category,String title, double price,String status) {
      
        this.id_usuario = id_usuario;
        this.Category = Category;
        this.price = price;
        this.status = status;
        this.title = title;

    }
    
    
    
}
