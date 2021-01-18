package com.helloworld.test.config;

import com.helloworld.test.bean.Person;
import com.helloworld.test.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/*
指明当前类是一个配置类，替代之前的spring配置文件
 */
@Configuration
public class MyAppConfig {

    //将方法的返回值添加到容器中；容器中这个组件的默认ID就是此方法名
    @Bean
    public HelloService helloService02(){
        System.out.println("给容器中添加组件了...");
        return new HelloService();
    }
}
