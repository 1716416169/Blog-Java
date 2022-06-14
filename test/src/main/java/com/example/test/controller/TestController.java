package com.example.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("test")
public class TestController {
    @Autowired
    public RestTemplate restTemplate;

    @GetMapping
    public void test(){
        System.out.println("test");
        restTemplate.getForObject("http://175.178.217.129:8080/test",Object.class);
    }

}
