package com.edu.control.dto.mapper;

import com.edu.control.dto.RoleDTO;
import com.edu.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RoleDTOMapper {

    RoleDTOMapper INSTANCE = Mappers.getMapper(RoleDTOMapper.class);

    RoleDTO mapToDTO(Role role);

}
