package com.realdolmen.spring.service;

import com.realdolmen.spring.domain.Animal;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface FoodDistributionService {
   void feedAnimalsByType(List<Animal> animals);
}
