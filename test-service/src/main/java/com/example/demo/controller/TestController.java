package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: pk.zhang
 * @Date: 2021/2/4 18:38
 */
@RestController
@RequestMapping(value = "/api/test")
public class TestController {

    @GetMapping
    @RequestMapping(value = "app")
    public String testApp(){
        System.out.println("test success!");
        return "success";
    }
}
