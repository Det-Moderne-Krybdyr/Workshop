package com.example;

import java.util.UUID;

public class VentilActuator extends Actuator{
    
    public VentilActuator(UUID ID, String name, double value) {
        super(ID, name, value);
    }

    public void setValue(double value){
        value = this.value;
    }

    @Override
    public String toString(){
        return "Value: " + value;
    }
}
