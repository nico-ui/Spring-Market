package com.platzi.demo.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "productos")//nombre de clase diff a nombre de tabla en DB
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Autoincrementable
    @Getter @Setter @Column(name = "id_producto")//asociar nombre column con var
    private Integer idProducto;

    @Getter @Setter
    private String nombre;

    @Getter @Setter @Column(name = "id_categoria")
    private Integer idCategoria;//Buena practica notación camello

    @Getter @Setter @Column(name = "codigo_barras")
    private String codigoBarras;

    @Getter @Setter @Column(name = "precio_venta")
    private double precioVenta;

    @Getter @Setter @Column(name = "cantidad_stock")
    private Integer cantidadStock;

    @Getter @Setter
    private boolean estado;

    @ManyToOne
    @Getter @Setter @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private Categoria categoria;//recuperar categoria pertenece a un producto

}
