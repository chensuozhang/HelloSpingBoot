package com.helloworld.test.config;

import com.helloworld.test.bean.Person;
import com.helloworld.test.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/*
1.指明当前类是一个配置类，替代之前的spring配置文件， 配置类本身也是一个组件
2.使用@bean注解在类上，给容器中注册组件，且组件是单实例，无论获取多少次，获取的都是同一个组件（默认单实例）
3.proxyBeanMethods代理bean的方法：
full：proxyBeanMethods = true  每次启动都要检查是否唯一存在
lite：proxyBeanMethods = false 每次启动无需进行检查
4.@Import({})
5.@Condtional({})
 */
@Configuration(proxyBeanMethods = false)
public class MyAppConfig {

    //将方法的返回值添加到容器中；容器中这个组件的默认ID就是此方法名；返回类型即为组件类型，返回的值即为组件在容器中保存的对象
//    @Bean("自定义的名字")
    @Bean
    public HelloService helloService02() {
        System.out.println("给容器中添加组件了");
        return new HelloService();
    }
}
