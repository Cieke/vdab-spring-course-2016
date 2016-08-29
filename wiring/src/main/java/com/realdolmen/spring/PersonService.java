package com.realdolmen.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("MyService") //default naam: class met kleine letter
public class PersonService {
    @Autowired
    private PersonRepository pr;
    public void registerPerson(Person p){

        Person person = pr.readById(p.getId());
        if (person !=null){
            person.setFirstName("John");
            pr.update(person);
        }
        else {
            pr.create(person);
        }


    }
}
