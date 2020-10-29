package com.example.model;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
 

@Entity
@Table(name="mesa")
public class MesaModel {
    
    @javax.persistence.Id
    @GeneratedValue(strategy= GenerationType.IDENTITY,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    private Long id;



   
    @ManyToOne 
    @JoinColumn(name = "id_salon")
    private SalonModel salon;

    
    @Column(name = "fecha", nullable = false)
    private Calendar fecha;


    @Column(name = "comensales")
    private Integer comensales;






    public MesaModel() {
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
     * @return SalonModel return the salon
     */
    public SalonModel getSalon() {
        return salon;
    }

    /**
     * @param salon the salon to set
     */
    public void setSalon(SalonModel salon) {
        this.salon = salon;
    }

    /**
     * @return Calendar return the fecha
     */
    public Calendar getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    /**
     * @return Integer return the comensales
     */
    public Integer getComensales() {
        return comensales;
    }

    /**
     * @param comensales the comensales to set
     */
    public void setComensales(Integer comensales) {
        this.comensales = comensales;
    }

}
