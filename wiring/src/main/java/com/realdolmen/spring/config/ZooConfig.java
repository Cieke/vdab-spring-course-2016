package com.realdolmen.spring.config;

import com.realdolmen.spring.domain.*;
import com.realdolmen.spring.service.FoodRepImpl;
import com.realdolmen.spring.service.FoodRepository;
import com.realdolmen.spring.service.PairiDaiza;
import com.realdolmen.spring.service.Zoo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by cda5732 on 25/03/2015.
 */
@Configuration
public class ZooConfig {
    @Bean
    public Zoo zoo() {
        Zoo zoo = new PairiDaiza("Pairi Daiza");
        zoo.addAnimal(new Tiger("Bengal Tiger"));
        zoo.addAnimal(new Elephant("Indian Elephant"));
        zoo.addAnimal(new Bear("Brown Bear"));
        return zoo;
    }
    // TODO Configure the FoodRepository

    @Bean
    public FoodRepository foodRepository(){

        FoodRepository fr = new FoodRepImpl();
        fr.addFoodForAnimalType(Tiger.class, new MeatyFood("aap"));
        fr.addFoodForAnimalType(Bear.class, new MeatyFood("vis"));
        fr.addFoodForAnimalType(Elephant.class, new VegiFood("cola"));

     return fr;
    }
}
