package com.example;

public class Co2Sensor extends Sensor{

    public double getValue(){
        return value;
    }
    
    @Override
    public String toString(){
        return "Value: " + value;
    }
}
