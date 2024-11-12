package org.example.gestionadordecarros.Clases;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private static float precioTotal;
    private static LocalDate fechaReserva;
    private static LocalDate fechaEntrega;

    public Reserva(Cliente cliente, Vehiculo vehiculo, float precioTotal, LocalDate fechaReserva, LocalDate fechaEntrega) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        Reserva.precioTotal = precioTotal;
        Reserva.fechaReserva = fechaReserva;
        Reserva.fechaEntrega = fechaEntrega;
    }

    public static LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public static void setFechaReserva(LocalDate fechaReserva) {
        Reserva.fechaReserva = fechaReserva;
    }

    public static LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public static void setFechaEntrega(LocalDate fechaEntrega) {
        Reserva.fechaEntrega = fechaEntrega;
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

    public static float calcularPrecioTotal(Vehiculo vehiculo, LocalDate fechaReserva, LocalDate fechaEntrega) {
        if (((Motocicleta) vehiculo).getTipoMotocicleta() == TIPO_MOTOCICLETA.AUTOMATICO) {
            precioTotal = ChronoUnit.DAYS.between(fechaReserva, fechaEntrega) * 50000 + 5000;
        } else {
            precioTotal = ChronoUnit.DAYS.between(fechaReserva, fechaEntrega) * 50000;
        }
        return precioTotal;
    }
}
