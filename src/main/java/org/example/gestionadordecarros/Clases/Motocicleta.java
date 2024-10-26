package org.example.gestionadordecarros.Clases;

import java.time.LocalDate;

public class Motocicleta extends Vehiculo{
    private TIPO_MOTOCICLETA tipoMotocicleta;
    public Motocicleta(String numeroMatricula, String marca, String modelo  , LocalDate fechaFabricacion, TIPO_MOTOCICLETA tipoMotocicleta) {
        super(numeroMatricula, marca, modelo, fechaFabricacion);
        this.tipoMotocicleta = tipoMotocicleta;

    }

    public TIPO_MOTOCICLETA getTipoMotocicleta() {
        return tipoMotocicleta;
    }

    public void setTipoMotocicleta(TIPO_MOTOCICLETA tipoMotocicleta) {
        this.tipoMotocicleta = tipoMotocicleta;
    }

    @Override
    public String toString() {
        return "Motocicleta{}"+ "Numero de Matricula: "+getNumeroMatricula()+" Marca: "+getMarca()+" Modelo: "+getModelo()+" Fecha de Fabricacion: "+getFechaFabricacion()+" Tipo de Motocicleta: "+tipoMotocicleta;
    }
}
