package com.edu.control.dto.mapper;


import com.edu.control.dto.ProductDTO;
import com.edu.entity.Product;
import com.edu.entity.ProductSpec;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductDTOMapper {

    ProductDTOMapper INSTANCE = Mappers.getMapper(ProductDTOMapper.class);

    @Mapping(target = "productSpec")
    ProductDTO mapToDto(Product product);

    Product mapToEntity(ProductDTO productDTO);

}
