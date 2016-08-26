package com.realdolmen.spring.service;


import com.realdolmen.spring.domain.Animal;
import com.realdolmen.spring.domain.Food;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan //(package = "com.realdolmen")
public interface FoodRepository {
   void addFoodForAnimalType(Class<? extends Animal> c, Food food);
   Food findFoodForAnimalType(Class<? extends Animal> c);

}
