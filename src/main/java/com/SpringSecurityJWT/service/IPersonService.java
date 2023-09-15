package com.SpringSecurityJWT.service;

import com.SpringSecurityJWT.models.PersonEntity;
import com.SpringSecurityJWT.response.PersonResponseRest;
import org.springframework.http.ResponseEntity;

public interface IPersonService {

    public ResponseEntity<PersonResponseRest> search();

    public ResponseEntity<PersonResponseRest> save(PersonEntity person);
}
