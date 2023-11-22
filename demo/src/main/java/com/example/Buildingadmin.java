package com.example;

import java.util.List;
import java.util.UUID;

public class Buildingadmin {

    private List<Building> buildings;

    public List<Building> getBuildings() {
        return buildings;
    }

    public UUID addBuilding(Building building) {
        buildings.add(building);
        return null;
    }

    public void removeBuilding(UUID ID) {
        buildings.removeIf(building -> building.getID().equals(ID));
    }
}
