package com.platzi.demo.persistence.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id_categoria")
    private Integer idCategoria;

    @Getter @Setter
    private String descripcion;

    @Getter @Setter
    private boolean estado;

    @Getter @Setter @OneToMany(mappedBy = "categoria")//Relacion que respalda
    private List<Producto> productos;
}
