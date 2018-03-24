package com.edu.control.service;

import com.edu.control.dao.RoleDAO;
import com.edu.control.dto.RoleDTO;
import com.edu.control.dto.mapper.RoleDTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class RoleService {

    @Autowired
    private RoleDAO roleDAO;

    private RoleDTOMapper mapper = RoleDTOMapper.INSTANCE;

    public RoleDTO getRoleByUsername(String username) {
        return mapper.mapToDTO(roleDAO.getRoleByUsername(username));
    }

}
