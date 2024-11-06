package org.example.gestionadordecarros.Clases;

import java.time.LocalDate;
import java.util.Locale;

public class  Vehiculo  {
    private String numeroMatricula;
    private String marca;
    private String modelo;
    private LocalDate fechaFabricacion;

    public Vehiculo(String numeroMatricula, String marca, String modelo, LocalDate fechaFabricacion) {
        this.numeroMatricula = numeroMatricula;
        this.marca = marca;
        this.modelo = modelo;
        this.fechaFabricacion = fechaFabricacion;
    }

    public static Vehiculo getSampleVehiculo() {
        return new Vehiculo("1234", "Toyota", "Corolla", LocalDate.now());
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
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

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }
}
