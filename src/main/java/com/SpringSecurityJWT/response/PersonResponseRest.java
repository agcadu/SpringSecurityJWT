package com.SpringSecurityJWT.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonResponseRest extends ResponseRest{

    private PersonResponse personResponse = new PersonResponse();
}
