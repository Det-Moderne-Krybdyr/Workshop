package com.example;

import java.util.List;
import java.util.UUID;

public class Building {

    private List<Sensor> sensors;
    private List<Actuator> actuators;

    public List<Sensor> getSensors() {
        return sensors;
    }

    public List<Actuator> geActuators() {
        return actuators;
    }

    public UUID addTempSensor(String name) {
        return null;
    }

    public UUID addCo2Sensor(String name) {
        return null;
    }

    public void removeSensor(UUID ID) {

    }

    public UUID addVentActuator(String name) {
        return null;
    }

    public void removeActuator(UUID ID) {

    }
}
