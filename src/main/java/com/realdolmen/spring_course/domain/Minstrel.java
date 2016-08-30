package com.realdolmen.spring_course.domain;

import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by tywinlannister on 30/08/16.
 */
@Aspect
@Component
public class Minstrel {
    @Before("execution(* *.embarkOnQuest())")  //return type en type.methode
    public void interceptEmbarkOnQuest(){
        System.out.println("Tee hee hee, the knight is going to aid the village");
    }

   // @Before("bla()") // bla is de pointcut



    @AfterReturning(value = "execution(* *.embark(java.lang.String)) && args(who)", returning = "spoils")
    public void interceptQuest(String spoils, String who){
        System.out.println("Hee hee hee. The knight brings the dragon's head on a pike!");
        System.out.println("Minstrel says return of quest is " + spoils);
        System.out.println("Minstrel says who is " + who);
        }

    @AfterThrowing(value = "execution(* *.embark(java.lang.String))", throwing = "error")
    public void interceptFailQuest(RuntimeException error){
        System.out.println("Boo hoo hoo, the knight is dragon food because" + error.getMessage());
    }
}


