package org.example.repository;


import org.example.model.Vehiculo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class VehiculoRepository {
    ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();


    public void addVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public Vehiculo getVehiculoPlaca(String placa){
        for(Vehiculo vehiculo : vehiculos){
            if(vehiculo.getPlaca().equals(placa)){
                return vehiculo;
            }
        }
        return null;
    }

    public ArrayList<Vehiculo> conductorPorId(String conductorId){
        for(Vehiculo vehiculo : vehiculos){
            if(vehiculo.getConductorID()!=null && vehiculo.getConductorID().equals(conductorId)){
                vehiculos.add(vehiculo);
            }
        }
        return vehiculos;
    }

    public boolean addConductor(String placa, String conductorId){
        for(Vehiculo vehiculo : vehiculos){
            if(vehiculo.getPlaca().equals(placa)){
                vehiculo.setConductorID(conductorId);
            }
            return true;
        }
        return false;
    }

    public boolean deleteConductor(String conductorId){
        for(Vehiculo vehiculo : vehiculos){
            if(vehiculo.getConductorID().equals(conductorId)){
                vehiculos.remove(vehiculo);
                return true;
            }
        }
        return false;
    }





}
