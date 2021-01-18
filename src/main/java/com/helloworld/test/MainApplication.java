package com.helloworld.test;


import com.helloworld.test.service.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

/**
 * 主程序类
 * @SpringBootApplication：这是一个SpringBoot应用，标注springBoot的主配置类
 */
@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        //springboot应用的启动
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(MainApplication.class, args);

        /*查看容器中的组件
        springboot会自动配置好开发常用的场景
        */
        String[] names = configurableApplicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
//         从容器中获取组件
//        HelloService h1 = configurableApplicationContext.getBean("HelloService");
//        HelloService h2 = configurableApplicationContext.getBean("HelloService");

    }
}