package com.platzi.demo.persistence;

import com.platzi.demo.persistence.crud.ProductoCrudRepository;
import com.platzi.demo.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){//Recuperar todos los productos de la DB
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public List<Producto> getByCategoria(int idCategoria){
        return productoCrudRepository.findByIdCategoriaOrderByNameASC(idCategoria);
    }

    public Optional<List<Producto>> getEscasos(int cantidad){
        return productoCrudRepository.findByIdCantidadStockLessThanAndEstado(cantidad, true);
    }
}
