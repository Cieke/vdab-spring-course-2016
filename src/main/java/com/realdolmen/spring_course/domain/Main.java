package com.realdolmen.spring_course.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
//@EnableAspectJAutoProxy
public class Main {
    public static void main(String[] args) {


       ApplicationContext ac = SpringApplication.run(Main.class);

        Knight k = ac.getBean(Knight.class);
        //System.out.println(k);
        k.embarkOnQuest();

    }
}
