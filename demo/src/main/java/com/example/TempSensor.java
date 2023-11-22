package com.example;

import java.util.UUID;

public class TempSensor extends Sensor{
    
    public TempSensor(UUID ID, String name, double value) {
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
