package com.example;

import java.util.List;
import java.util.UUID;

public class Building extends Unit {

    private List<Sensor> sensors;
    private List<Actuator> actuators;

    public Building(String name, List<Sensor> sensors, List<Actuator> actuators){
        this.name = name;
        this.sensors = sensors;
        this.actuators = actuators;
    }
    public List<Sensor> getSensors() {
        return sensors;
    }

    public List<Actuator> getActuators() {
        return actuators;
    }

    public UUID addTempSensor(TempSensor sensor) {
        sensors.add(sensor);
        return ID;
    }

    public UUID addCo2Sensor(Co2Sensor sensor) {
        sensors.add(sensor);
        return ID;
    }

    public void removeSensor(UUID ID) {
        sensors.removeIf(sensor -> sensor.getID().equals(ID));
    }

    public UUID addVentilActuator(Actuator actuator) {
        actuators.add(actuator);
        return ID;
    }

    public void removeActuator(UUID ID) {
        actuators.removeIf(actuator -> actuator.getID().equals(ID));
    }
}
