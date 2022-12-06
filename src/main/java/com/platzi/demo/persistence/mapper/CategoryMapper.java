package com.platzi.demo.persistence.mapper;

import com.platzi.demo.domain.Category;
import com.platzi.demo.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/*Indicar que es un mapeador*/
@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source= "idCategoria", target = "categoryId"),
            @Mapping(source= "description", target = "category"),
            @Mapping(source= "estado", target = "active")
    })
    Category toCategory(Categoria categoria);

    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    Categoria toCategoria(Category category);
}
