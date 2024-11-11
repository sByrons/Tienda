
package com.Tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Entity
@Data
@Table(name= "producto")
public class Producto implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_producto")
    private Long idProducto;
    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;
    private String rutaImagen;
    private boolean activo;
    
    @ManyToOne
    @JoinColumn(name="id_categoria")
    private Categoria categoria;

    public Producto() {
    }

    public Producto(String descripcion, String detalle, double precio, int existencias, String rutaImagen, boolean activo, Categoria categoria) {
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.existencias = existencias;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
        this.categoria = categoria;
    }

    
    
    
    
}
