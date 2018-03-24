package com.edu.control.dto.mapper;

import com.edu.control.dto.UserDTO;
import com.edu.entity.Cart;
import com.edu.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserDTOMapper {

    UserDTOMapper INSTANCE = Mappers.getMapper(UserDTOMapper.class);

    @Mapping(target = "cart")
    UserDTO mapToDTO(User user);

    User mapToEntity(UserDTO userDTO);

}
