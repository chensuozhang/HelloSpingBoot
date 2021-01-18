package com.helloworld.test.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

//@PropertySource(value = {"classpath:person.properties"}) //从指定的配置文件读取数据
@Component
@ConfigurationProperties(prefix = "person")   //将本类中的所有属性和配置文件中的属性进行绑定
//@Validated
public class Person {

    //@Value("${person.name}")
    private String Name;

    //@Value("${person.age}")
    private Integer age;

    private List<Object> list;

    private Cat cat;

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                ", list=" + list +
                ", cat=" + cat +
                '}';
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

}
