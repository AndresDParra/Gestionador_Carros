package org.example.gestionadordecarros.Clases;

import java.time.LocalDate;

public class Reserva {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private float precioTotal;
    private LocalDate fechaReserva;
    private LocalDate fechaEntrega;

    public Reserva(Cliente cliente, Vehiculo vehiculo, float precioTotal, LocalDate fechaReserva, LocalDate fechaEntrega) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.precioTotal = precioTotal;
        this.fechaReserva = fechaReserva;
        this.fechaEntrega = fechaEntrega;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }
    public static Reserva getSampleReserva() {
        return new Reserva(Cliente.getSampleCliente(), Vehiculo.getSampleVehiculo(), 100000, LocalDate.now(), LocalDate.now().plusDays(2));
    }
}
