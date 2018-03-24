package com.edu.control.dto.mapper;

import com.edu.control.dto.OrderDTO;
import com.edu.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderDTOMapper {

    OrderDTOMapper INSTANCE = Mappers.getMapper(OrderDTOMapper.class);

    OrderDTO mapToDto(Order order);

    Order mapToEntity(OrderDTO orderDTO);

}
