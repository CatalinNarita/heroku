package com.edu.boundary;


import com.edu.control.dto.RoleDTO;
import com.edu.control.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
@CrossOrigin
public class RoleResource {

    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public RoleDTO getRoleByUsername(@PathVariable("username") String username) {
        return roleService.getRoleByUsername(username);
    }

}
