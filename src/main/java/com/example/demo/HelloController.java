package com.example.demo;

import com.example.demo.mapper.UserLoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;

@RestController
@EnableAutoConfiguration
public class HelloController {
    @Autowired
    private UserLoginMapper userLoginMapper;
    @RequestMapping("/hello")
    public Date[] hello(){
        Calendar now=Calendar.getInstance();
        Calendar t=Calendar.getInstance();
        t.add(Calendar.DATE,-1);

        Date nowd=now.getTime();
        Date td=t.getTime();

        Date d[]={nowd,td};

        return d;
    }


}
