package com.helloworld.test.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//这个类的所有方法直接返回给浏览器（如果是对象转为json）
@RestController
public class HelloController {

    @Value("${person.name}")
    private String name;

    @RequestMapping("/hello")
    public String handle01() {
        return "Hello, Spring Boot 2!" + " welcome " + name;
    }
}
