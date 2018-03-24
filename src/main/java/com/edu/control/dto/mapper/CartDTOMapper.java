package com.edu.control.dto.mapper;

import com.edu.control.dto.CartDTO;
import com.edu.entity.Cart;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CartDTOMapper {

    CartDTOMapper INSTANCE = Mappers.getMapper(CartDTOMapper.class);

    CartDTO mapToDto(Cart cart);

    Cart mapToEntity(CartDTO cartDTO);

}
