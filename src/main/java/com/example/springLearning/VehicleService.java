package com.example.springLearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {
    public baseInterface bI;

    @Autowired
    VehicleService(baseInterface bI){
        this.bI = bI;
    }

    public void printDrive(){
        bI.driveStyle();
        System.out.println("Vehicle is now driving");
    }


}
