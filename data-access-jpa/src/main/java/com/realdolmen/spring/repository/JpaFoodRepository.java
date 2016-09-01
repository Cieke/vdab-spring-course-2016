package com.realdolmen.spring.repository;

import com.realdolmen.spring.domain.Animal;
import com.realdolmen.spring.domain.Food;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JpaFoodRepository implements FoodRepository {
    @Override
    public Food findFoodById(int id) {
        return null;
    }

    @Override
    public List<Food> findAllFood() {
        return null;
    }

    @Override
    public List<Food> findFoodForAnimalType(Animal.Type type) {
        return null;
    }

    @Override
    public void removeFood(Food food) {

    }
    // TODO: Create a transactional repository bean implementing FoodRepository

    // TODO: implement findFoodById()

    // TODO: implement findAllFood()

    // TODO: implement findFoodForAnimalType()

    // TODO: implement removeFood()
}
