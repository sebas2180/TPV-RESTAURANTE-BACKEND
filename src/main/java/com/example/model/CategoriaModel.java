
package com.example.model;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.boot.autoconfigure.domain.EntityScan;
/**
 *
 * @author Sebas
 */

@Entity
@Table(name="categoria")
public class CategoriaModel {
    

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    private Long id;
    
    @Column(name = "nombre")
    private String categoria;
    
     @Column(name = "image")
    private String image;

    @Column(name = "descripcion")
    private String descripcion;


    @ManyToOne
    @JoinColumn(name = "id_iva")
    private IvaModel ivaModel;


    // GETTS AND SETTERS

    public CategoriaModel() {
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
     * @return String return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return String return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return String return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return IvaModel return the ivaModel
     */
    public IvaModel getIvaModel() {
        return ivaModel;
    }

    /**
     * @param ivaModel the ivaModel to set
     */
    public void setIvaModel(IvaModel ivaModel) {
        this.ivaModel = ivaModel;
    }

}
