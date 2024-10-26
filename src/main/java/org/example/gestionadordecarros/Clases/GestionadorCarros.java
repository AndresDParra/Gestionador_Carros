package org.example.gestionadordecarros.Clases;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;



public class GestionadorCarros {
    private String nombre;
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Cliente> clientes;
    private ArrayList<Reserva> reservas;

    public GestionadorCarros(String nombre) {
        this.nombre = nombre;
        this.vehiculos = new ArrayList<Vehiculo>();
        this.clientes = new ArrayList<Cliente>();
        this.reservas = new ArrayList<Reserva>();
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    public void crearCliente(String nombre, String apellido, String cedula, String telefono, String direccion){
        Cliente cliente = new Cliente(nombre, apellido, cedula, telefono, direccion);
        clientes.add(cliente);
    }
    public void crearVehiculo(String numeroMatricula, String marca, String modelo, LocalDate fechaFabricacion){
        Vehiculo vehiculo = new Vehiculo(numeroMatricula, marca, modelo, fechaFabricacion);
        vehiculos.add(vehiculo);
    }
    public void crearReserva(Cliente cliente, Vehiculo vehiculo, LocalDate fechaReserva, LocalDate fechaEntrega){
        Reserva reserva = new Reserva(cliente, vehiculo, 0, fechaReserva, fechaEntrega);
        reservas.add(reserva);
    }
    public float calcularTarifaReserva(LocalDate fechaReserva, LocalDate fechaEntrega, Vehiculo vehiculo){
        long dias = ChronoUnit.DAYS.between(fechaReserva, fechaEntrega);
        float precioTotal=0;
        switch (vehiculo) {
            case Carro c -> precioTotal = 100 * dias;
            case Motocicleta m -> {
                if (m.getTipoMotocicleta()== TIPO_MOTOCICLETA.AUTOMATICO) {
                    precioTotal = 70 * dias;
                } else {
                    precioTotal = 50 * dias;
                }
            }
            case Camioneta camioneta -> precioTotal = 150 * dias;
            default -> throw new IllegalStateException("Unexpected value: " + vehiculo);

        }
        return precioTotal;
    }


}