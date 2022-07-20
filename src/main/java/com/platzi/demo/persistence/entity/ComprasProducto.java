package com.platzi.demo.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "compras_productos")
public class ComprasProducto {

    @Getter @Setter @EmbeddedId
    private ComprasProductoPK id;

    @Getter @Setter
    private Integer cantidad;

    @Getter @Setter
    private Double total;

    @Getter @Setter
    private boolean estado;

    @ManyToOne
    @Getter @Setter @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    private Compra compra;

    @ManyToOne
    @Getter @Setter @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Producto producto;

}
