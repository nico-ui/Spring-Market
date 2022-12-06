package com.platzi.demo.persistence.mapper;

import com.platzi.demo.domain.Product;
import com.platzi.demo.persistence.entity.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper {

    @Mappings({
            @Mapping(source = "idProducto", target = "productId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "idCategoria", target = "CategoryId"),
            @Mapping(source = "precioVenta", target = "price"),
            @Mapping(source = "CantidadStock", target = "stock"),
            @Mapping(source = "idProducto", target = "ProductId"),
            @Mapping(source = "estado", target = "active"),
            @Mapping(source = "categoria", target = "category"),
    })
    Product toProduct(Producto producto);
    List<Product> toProducts(List<Producto> products);

    @InheritInverseConfiguration
    @Mapping(target = "codigoBarras", ignore = true)
    Producto toProducto(Product product);
}
