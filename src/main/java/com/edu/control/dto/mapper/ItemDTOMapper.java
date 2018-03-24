package com.edu.control.dto.mapper;

import com.edu.control.dto.CartDTO;
import com.edu.control.dto.ItemDTO;
import com.edu.entity.Cart;
import com.edu.entity.Item;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ItemDTOMapper {

    ItemDTOMapper INSTANCE = Mappers.getMapper(ItemDTOMapper.class);

    ItemDTO mapToDto(Item item);

    Item mapToEntity(ItemDTO itemDTO);

}
