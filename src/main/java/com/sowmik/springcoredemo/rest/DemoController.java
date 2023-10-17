package com.sowmik.springcoredemo.rest;

import com.sowmik.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // define a private field for the dependency
    private Coach myCoach;
    //private Coach anotherCoach;

    //define a constructor for dependency injection
    @Autowired
    public DemoController(@Qualifier("aquatic") Coach theCoach) {
        System.out.println("In constructor: "+getClass().getSimpleName());
        myCoach = theCoach;
    }
//    @Autowired
//    public void setCoach(Coach theCoach) { // method name can be anything
//        myCoach = theCoach;
//    }

//    @GetMapping("/check")
//    public String check() {
//        return "Comparing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
//    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
