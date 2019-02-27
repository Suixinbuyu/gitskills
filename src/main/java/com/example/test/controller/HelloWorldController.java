package com.example.test.controller;

import com.example.test.entity.mapper.userMapper;
import com.example.test.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloWorldController {
    @Resource
    private userMapper mapper;
    @GetMapping("/index")
    public int helloworld() {
        user user = mapper.selectByPrimaryKey(1);
        return (1/0);
    }
}
