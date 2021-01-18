package com.helloworld.test;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 主程序类
 *
 * @SpringBootApplication：这是一个SpringBoot应用，标注springBoot的主配置类
 */
@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        //springboot应用的启动
        SpringApplication.run(MainApplication.class, args);
    }
}