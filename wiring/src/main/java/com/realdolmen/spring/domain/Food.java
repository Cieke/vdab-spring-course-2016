package com.realdolmen.spring.domain;

/**
 * Created by tywinlannister on 26/08/16.
 */
public class Food {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Food(String name) {
        this.name = name;
    }
}
