package com.example;

import java.util.UUID;

public class Co2Sensor extends Sensor{

    public Co2Sensor(UUID ID, String name, double value) {
        super(ID, name, value);
    }

    public double getValue(){
        return value;
    }
    
    @Override
    public String toString(){
        return "Value: " + value;
    }
}
