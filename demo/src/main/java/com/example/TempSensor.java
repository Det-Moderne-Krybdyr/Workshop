package com.example;

public class TempSensor extends Sensor{
    
    public double getValue(){
        return value;
    }

    @Override
    public String toString(){
        return "Value: " + value;
    }
}
