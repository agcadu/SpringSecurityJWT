package com.SpringSecurityJWT.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRolesController {


    @GetMapping("/accesAdmin")
    public String accesAdmin(){
        return "Hello Admin";
    }

    @GetMapping("/accesUser")
    public String accesUser(){
        return "Hello User";
    }

    @GetMapping("/accesInvited")
    public String accesInvited(){
        return "Hello Invited";
    }
}
