package com.it2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${name}")
    private String name;

    @Autowired
    ConfigurableApplicationContext applicationContext;

    @GetMapping("/hello")
    public String hello(){
        //读取配置信息
        return name+"--------"+applicationContext.getEnvironment().getProperty("name");
    }


}
