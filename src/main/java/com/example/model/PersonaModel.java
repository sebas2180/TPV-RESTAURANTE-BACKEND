/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model;

import java.util.Date;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author Sebas
 */

@Entity
@Table(name = "Persona")
public class PersonaModel {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
@GenericGenerator(name = "native",strategy = "native")
    private Long id;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "genero")
    private String genero;
    
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    @Column(name = "nacimiento")
    private Date nacimiento;
    
    public PersonaModel(){
        
    }
    public PersonaModel(Long id, String nombre, Date nacimiento,String genero){
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.nacimiento = nacimiento;
        
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    
    
    
}
