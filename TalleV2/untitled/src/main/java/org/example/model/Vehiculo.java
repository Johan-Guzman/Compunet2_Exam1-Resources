package org.example.model;

public class Vehiculo {

    private String id;
    private String placa;
    private String cilindraje;
    private String tipoCombustible;
    private String numeroMotor;
    private String marca;
    private String modelo;
    private String conductorID;


    public Vehiculo(String id, String placa, String cilindraje, String tipoCombustible, String numeroMotor, String marca, String modelo, String conductorID) {
        this.id = id;
        this.placa = placa;
        this.cilindraje = cilindraje;
        this.tipoCombustible = tipoCombustible;
        this.numeroMotor = numeroMotor;
        this.marca = marca;
        this.modelo = modelo;
        this.conductorID = conductorID;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(String numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getConductorID() {
        return conductorID;
    }

    public void setConductorID(String conductorID) {
        this.conductorID = conductorID;
    }
}
