package org.example.repository;


import org.example.model.Conductor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

//En el repositorio instancio la lista donde voy a guardar cada colección de objetos y pongo
// los metodos asi sin más, las reglas van en el service.
@Repository
public class ConductorRepository {
    ArrayList<Conductor> conductores = new ArrayList<Conductor>();

    public void addConductor(Conductor conductor){
        conductores.add(conductor);
    }

    public ArrayList<Conductor> getConductores(){
        return conductores;
    }

    public Conductor getConductor(String  numeroIdentificacion){
        for(Conductor conductor : conductores){
            if(conductor.getNumeroIdentificacion().equals(numeroIdentificacion)){
                return conductor;
            }
        }
        return null;

    }





}
