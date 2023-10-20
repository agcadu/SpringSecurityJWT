package com.SpringSecurityJWT.controller.request;

import com.SpringSecurityJWT.models.RoleEntity;
import com.SpringSecurityJWT.models.UserEntity;
import lombok.Data;

import java.util.Set;

@Data
public class UserResponseDTO {

    private Long id;
    private String email;
    private String username;
    private Set<RoleEntity> roles;


}


