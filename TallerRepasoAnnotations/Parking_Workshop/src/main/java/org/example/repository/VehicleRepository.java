package org.example.repository;


import org.example.model.Vehicle;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class VehicleRepository {

    ArrayList<Vehicle> vehicles = new ArrayList<>();


    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }
    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }



}
