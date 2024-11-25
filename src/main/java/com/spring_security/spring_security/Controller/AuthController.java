package com.spring_security.spring_security.Controller;

import java.security.PublicKey;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/spring_security/v1/")
public class AuthController {




    @GetMapping("/home")
    public void Welcomepage(){

    System.out.println("hello you are at the home page");

    }

    @PostMapping("/register")
    public  void userRegisterController(){
        System.out.println("you are about  to register");
    }

    @PostMapping("/login")
    public  void userLoginController(){
        System.out.println("you are about  to login");
    }

    @PostMapping("/logout")
    public  void userLogoutController(){
        System.out.println("you are about  to logout");
    }



}
