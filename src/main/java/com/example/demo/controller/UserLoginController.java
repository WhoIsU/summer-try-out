package com.example.demo.controller;

import com.example.demo.entity.UserLogin;
import com.example.demo.service.UserLoginServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserLoginController {
    @Autowired
    private UserLoginServiceIMPL userLoginServiceIMPL;

    @PostMapping("/login")  //checked
    public Boolean login(UserLogin user){return userLoginServiceIMPL.login(user);}

    @PostMapping("/regis") //checked
    public Boolean regis(UserLogin user){return userLoginServiceIMPL.regis(user);}

    @PostMapping("/reset_password") //uncomplete
    public Boolean reset_password(String password){return userLoginServiceIMPL.reset_password(password);}

    @GetMapping("/findAllUserLogin") //checked
    public List<UserLogin> findAllUserLogin(){return userLoginServiceIMPL.findAllUserLogin();}
}
