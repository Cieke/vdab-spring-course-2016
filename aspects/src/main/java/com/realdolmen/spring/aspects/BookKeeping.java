package com.realdolmen.spring.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

// TODO: Turn this class into a Spring Bean and an Aspect

@Aspect
@Component

public class BookKeeping {
    // TODO: Add an advice that advises the Zoo.accept(Visitor) method
    // TODO: Make sure the advice uses the return value of the the adviced method to keep track of happy and unhappy visitors

    @AfterReturning(value = "execution(boolean com.realdolmen.spring.domain.Zoo.accept(com.realdolmen.spring.domain.Visitor))", returning = "happy")
    public void getHappyCount(boolean happy) {
        System.out.println("one more happy customer");
        if (happy){
            happyCount++;
        }
        else{
            unhappyCount++;
        }
    }

    private int happyCount = 0;



    private int unhappyCount;


    public int getHappyVisitorCount() {
        return happyCount;
    }

    public int getUnhappyVisitorCount() {
        return unhappyCount;
    }
}
