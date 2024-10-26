package org.example.gestionadordecarros.Clases;

import java.time.LocalDate;

public class Camioneta extends Vehiculo{
    public Camioneta(String numeroMatricula, String marca, String modelo, LocalDate fechaFabricacion) {
        super(numeroMatricula, marca, modelo, fechaFabricacion);
    }

    @Override
    public String toString() {
        return "Camioneta{}"+ "Numero de Matricula: "+getNumeroMatricula()+" Marca: "+getMarca()+" Modelo: "+getModelo()+" Fecha de Fabricacion: "+getFechaFabricacion();
    }
}
