package com.example;

import java.util.UUID;

public class Unit {

    private String name;
    private UUID ID;

    public UUID getID(){
        return ID;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Nanv: " + name + " " + "ID: " + ID;
    }
    
}
