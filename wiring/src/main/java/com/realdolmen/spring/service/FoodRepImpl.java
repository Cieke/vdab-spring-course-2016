package com.realdolmen.spring.service;

import com.realdolmen.spring.domain.Animal;
import com.realdolmen.spring.domain.Food;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;


public class FoodRepImpl implements FoodRepository {


    private Map<String, Food> map = new HashMap<>();
    @Override
    public void addFoodForAnimalType(Class<? extends Animal> c, Food food) {
        map.put(c.getName(),food);
    }

    @Override
    public Food findFoodForAnimalType(Class<? extends Animal> c) {
       return map.get(c.getName());
    }
}
