package com.example.springLearning;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("truck")
@Component
public class truck implements baseInterface {
    @Override
    public void driveStyle(){
        System.out.println("This is a truck this drifts");
    } 
    
}
