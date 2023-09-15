package com.SpringSecurityJWT.repositories;

import com.SpringSecurityJWT.models.PersonEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonRepository extends CrudRepository<PersonEntity, Long> {
}
