package org.example.gestionadordecarros.Clases;

import java.time.LocalDate;

public class Carro extends Vehiculo{
    public Carro(String numeroMatricula, String marca, String modelo, LocalDate fechaFabricacion) {
        super(numeroMatricula, marca, modelo, fechaFabricacion);
    }

    @Override
    public String toString() {
        return "Carro{}"+ "Numero de Matricula: "+getNumeroMatricula()+" Marca: "+getMarca()+" Modelo: "+getModelo()+" Fecha de Fabricacion: "+getFechaFabricacion();
    }
}
