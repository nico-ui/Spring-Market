package com.platzi.demo.persistence.crud;

import com.platzi.demo.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    //Tabla y tipo de llave primaria
}
