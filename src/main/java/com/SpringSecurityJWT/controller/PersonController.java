package com.SpringSecurityJWT.controller;

import com.SpringSecurityJWT.models.PersonEntity;
import com.SpringSecurityJWT.response.PersonResponseRest;
import com.SpringSecurityJWT.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private IPersonService personService;


    @GetMapping("/hello")
    public String hello(){
        return "Bienvenido a mi API REST con Spring Security JWT";
    }

    @GetMapping("/persons")
    public ResponseEntity<PersonResponseRest> search(){

        ResponseEntity<PersonResponseRest> response = personService.search();
        return response;
    }

    @PostMapping("/savePerson")
    public ResponseEntity<PersonResponseRest> save(@RequestBody PersonEntity person){

        ResponseEntity<PersonResponseRest> response = personService.save(person);
        return response;
    }
}
