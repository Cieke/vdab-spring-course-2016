package com.realdolmen.spring_course.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan (basePackages = "com.realdolmen")
public class MyConfiguration {
    @Bean
    public Quest blaQuest(){
       // return new RescueDamselQuest();
        return new SlayDragonQuest();
    }

    @Bean
    public Knight fooKnight(){
        return new BraveKnight(blaQuest());
    }
}
