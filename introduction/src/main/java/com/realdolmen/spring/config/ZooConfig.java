package com.realdolmen.spring.config;


import com.realdolmen.spring.domain.Animal;
import com.realdolmen.spring.domain.Bear;
import com.realdolmen.spring.domain.Elephant;
import com.realdolmen.spring.domain.Tiger;
import com.realdolmen.spring.service.PairiDaiza;
import com.realdolmen.spring.service.Zoo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan (basePackages = "com.realdolmen")
public class ZooConfig {
@Bean
    public Zoo zoo(){
     Zoo z = new PairiDaiza("PairiDaiza");
    Animal t = new Tiger("Tigress");
    z.addAnimal(t);

    Animal b = new Bear("Baloo");
    z.addAnimal(b);

    Animal e = new Elephant("Slurf");
    z.addAnimal(e);

    z.releaseAnimal(e);
    return z;


        }



}
