package com.SpringSecurityJWT.response;

import com.SpringSecurityJWT.models.PersonEntity;
import lombok.Data;

import java.util.List;

@Data
public class PersonResponse {

    private List<PersonEntity> person;
}
