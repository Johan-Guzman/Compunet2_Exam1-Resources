package org.example.service;


import org.example.model.Conductor;
import org.example.model.Vehiculo;
import org.example.repository.ConductorRepository;
import org.example.repository.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


//Aqui van los @Autowired, enlazados a los repositorios.
@Service
public class ConductorService {
    @Autowired
    private ConductorRepository conductorRepository;

    @Autowired
    private VehiculoRepository vehiculoRepository;


    public void agregarConductor(Conductor conductor) {
        if(conductorRepository.getConductores().contains(conductor)) { //Es esa regla de no duplicados
            System.out.println("El conductor ya existe");
        }else{
            conductorRepository.addConductor(conductor);
        }
    }

    public ArrayList<Conductor> getConductores(){
        return conductorRepository.getConductores();
    }

    public Conductor getConductor(String numeroIdentificacion) {
        return conductorRepository.getConductor(numeroIdentificacion);
    }

}
