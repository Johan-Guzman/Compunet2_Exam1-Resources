package org.example.service;


import org.example.repository.ConductorRepository;
import org.example.repository.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.model.Vehiculo;

import java.util.ArrayList;

@Service
public class VehiculoService {
    @Autowired
    private ConductorRepository conductorRepository;

    @Autowired
    private VehiculoRepository vehiculoRepository;


    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculoRepository.addVehiculo(vehiculo);
    }

    public ArrayList<Vehiculo> getVehiculos() {
       return vehiculoRepository.getVehiculos();
    }

    public Vehiculo getVehiculo(String placa) {
        return vehiculoRepository.getVehiculoPlaca(placa);
    }

    public ArrayList<Vehiculo> conductorPorId(String conductorId) {
    return vehiculoRepository.conductorPorId(conductorId);
    }

    public boolean addConductor(String placa, String conductorId){
        return vehiculoRepository.addConductor(placa, conductorId);
    }

    public boolean deleteConductor(String conductorId){
        return vehiculoRepository.deleteConductor(conductorId);
    }

}
