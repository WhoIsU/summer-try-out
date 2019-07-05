package com.example.demo.controller;

import com.example.demo.entity.UserCollectionKey;
import com.example.demo.service.UserCollectionServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserCollectionController {

    @Autowired
    private UserCollectionServiceIMPL userCollectionServiceIMPL;

    @PostMapping("/addCollection")  //checked
    public void addCollection(UserCollectionKey userCollectionKey){userCollectionServiceIMPL.addCollection(userCollectionKey);}

    @PostMapping("/deleteCollect") //checked
    public void deleteCollect(UserCollectionKey userCollectionKey){userCollectionServiceIMPL.deleteCollect(userCollectionKey);}

    @GetMapping("/findCollectionByUserId/{id}")  //checked
    public List<UserCollectionKey> findCollectionByUserId( @PathVariable("id") Integer id){return userCollectionServiceIMPL.findCollectionByUserId(id);}
}
