package com.platzi.demo.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
//buena practica no usar *

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @Getter @Setter
    private String id;

    @Getter @Setter
    private String nombre;

    @Getter @Setter
    private String apellidos;

    @Getter @Setter
    private Integer celular;

    @Getter @Setter
    private String direccion;

    @Getter @Setter @Column(name = "correo_electronico")
    private String correoElectronico;

    @Getter @Setter @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;

}
