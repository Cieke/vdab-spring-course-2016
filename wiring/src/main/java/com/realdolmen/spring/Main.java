package com.realdolmen.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Main.class); //zichtzelf meegegeven als parameter

              PersonService ps = context.getBean(PersonService.class);
        ps.registerPerson(new Person());
    }

    @Bean
    public PersonService myPersonService(){
                PersonService ps = new PersonService();
                return ps;
    }
}
