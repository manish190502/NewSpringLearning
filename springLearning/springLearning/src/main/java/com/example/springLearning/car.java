package com.example.springLearning;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("car")
@Component
public class car implements baseInterface{
    @Override
    public void driveStyle(){
        System.out.println("this is car it drifts");
    }
    
}
