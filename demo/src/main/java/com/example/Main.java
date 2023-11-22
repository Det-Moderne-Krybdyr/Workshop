package com.example;

import java.util.List;
import java.util.UUID;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {        
        Buildingadmin buildingadmin = new Buildingadmin();

        // Create empty lists for sensors and actuators
        List<Sensor> sensors = new ArrayList<>();
        List<Actuator> actuators = new ArrayList<>();

        // Create a new Building instance with the lists
        Building building = new Building("benja", sensors, actuators);

        buildingadmin.addBuilding(building);

        Co2Sensor co2Sensor = new Co2Sensor(null, "Benjamin", 0);

        building.addCo2Sensor(co2Sensor);
    }
}
