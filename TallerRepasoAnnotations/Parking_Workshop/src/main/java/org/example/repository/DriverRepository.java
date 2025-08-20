package org.example.repository;


import org.example.model.Driver;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class DriverRepository {
    ArrayList<Driver> drivers = new ArrayList<>();

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }
    public ArrayList<Driver> getDrivers() {
        return drivers;
    }



}
