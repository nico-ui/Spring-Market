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
import java.time.LocalDateTime;

@Entity
@Table(name = "compras")
public class Compra {
    //Buena practica nombrar clases en singular y comenzando con mayuscula

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id_compra")
    private Integer idCompra;

    @Getter @Setter @Column(name = "id_cliente")
    private String idCliente;

    @Getter @Setter
    private LocalDateTime fecha;

    @Getter @Setter @Column(name = "medio_pago")
    private String medioPago;

    @Getter @Setter
    private String comentario;

    @Getter @Setter
    private String estado;

    @ManyToOne
    @Getter @Setter @JoinColumn(name = "id_cliente", insertable = false, updatable = false)
    private Cliente cliente;

}
