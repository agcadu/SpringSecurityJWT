package com.SpringSecurityJWT.repositories;

import com.SpringSecurityJWT.models.RoleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository extends CrudRepository<RoleEntity, Long> {
}
