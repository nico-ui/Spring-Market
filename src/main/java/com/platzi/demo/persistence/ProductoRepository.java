package com.platzi.demo.persistence;

import com.platzi.demo.persistence.crud.ProductoCrudRepository;
import com.platzi.demo.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository {
    //Clase encargada de interactuar con la DB,
    //@Repository es un estereotipo de spring framework
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){//Recuperar todos los productos de la DB
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public List<Producto> getByCategoria(int idCategoria){
        return productoCrudRepository.findByIdCategoriaOrderByNameASC(idCategoria);
    }

    public Optional<List<Producto>> getEscasos(int cantidad){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad, true);
    }

    //consultar pr id
    public Optional<Producto> getProducto(int idProducto){
        return productoCrudRepository.findById(idProducto);
    }

    //save
    public Producto save(Producto producto){
        return productoCrudRepository.save(producto);
    }

    //borrar por id
    public void delete(int idProducto){
        productoCrudRepository.deleteById(idProducto);
    }

}
