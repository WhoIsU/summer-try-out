package com.example.demo.controller;

import com.example.demo.entity.UserInfo;
import com.example.demo.service.UserInfoServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserInfoController {

    @Autowired
    private UserInfoServiceIMPL userInfoServiceIMPL;


    @PostMapping("/deleteUserInfoByID/{id}") //checked
    public boolean deleteUserInfoByID(@PathVariable("id") int id){return userInfoServiceIMPL.deleteUserInfoByID(id);}

    @PostMapping("/updateUserInfo")  //checked
    public UserInfo updateUserInfo(UserInfo userInfo){return userInfoServiceIMPL.updateUserInfo(userInfo);}

    @GetMapping("/selectUserInfo/{id}")  //checked
    public UserInfo selectUserInfo(@PathVariable("id") Integer id){return userInfoServiceIMPL.selectUserInfo(id);}

    @GetMapping("/findAllUserInfo")  //checked
    public List<UserInfo> findAllUserInfo(){return userInfoServiceIMPL.findAllUserInfo();}

    @PostMapping("/addUserInfo") //checked
    public boolean addUserInfo(UserInfo userInfo){return userInfoServiceIMPL.addUserInfo(userInfo);}
}
