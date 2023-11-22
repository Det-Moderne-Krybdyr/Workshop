package com.example;

import java.util.UUID;

public class Actuator extends Unit{

    double value;

        public Actuator(UUID ID, String name, double value){
        this.ID = ID;
        this.name = name;
        this.value = value;
    }

    public double getValue(){
        return value;
    }

    public void setValue(double value){
        this.value = value;
    }
}
