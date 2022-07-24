package com.platzi.demo.persistence.crud;

import com.platzi.demo.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    //Tabla y tipo de llave primaria

    //QueryMethods:
    List<Producto> findByIdCategoriaOrderByNameASC(int idCategoria);

    Optional<List<Producto>> findByIdCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
