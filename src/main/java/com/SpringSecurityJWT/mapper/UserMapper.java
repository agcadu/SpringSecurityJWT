package com.SpringSecurityJWT.mapper;

import com.SpringSecurityJWT.controller.request.UserResponseDTO;
import com.SpringSecurityJWT.models.UserEntity;

public class UserMapper {

    public UserResponseDTO toDTO(UserEntity userEntity) {
        UserResponseDTO dto = new UserResponseDTO();
        dto.setId(userEntity.getId());
        dto.setEmail(userEntity.getEmail());
        dto.setUsername(userEntity.getUsername());
        dto.setRoles(userEntity.getRoles());
        return dto;
    }
}
