package com.realdolmen.spring.service;

import com.realdolmen.spring.domain.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FoodDistributionImpl implements FoodDistributionService {
    @Autowired
    private FoodRepository fr;
    @Override

    public void feedAnimalsByType(List<Animal> animals) {
        for (Animal a: animals)
             {
            a.feed(fr.findFoodForAnimalType(a.getClass()));
        }
    }
}
