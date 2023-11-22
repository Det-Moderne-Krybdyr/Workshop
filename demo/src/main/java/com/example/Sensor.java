package com.example;

import java.util.UUID;

public class Sensor extends Unit{

    double value;

    public Sensor(UUID ID, String name, double value){
        this.ID = ID;
        this.name = name;
        this.value = value;
    }

    public double getValue(){
        return value;
    }
    
}
