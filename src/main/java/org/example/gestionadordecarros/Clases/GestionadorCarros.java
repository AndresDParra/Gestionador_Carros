package org.example.gestionadordecarros.Clases;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;



public class GestionadorCarros {
    private String nombre;
    private static ArrayList<Vehiculo> vehiculos;
    private static ArrayList<Cliente> clientes;
    private static ArrayList<Reserva> reservas;
    private static ArrayList<Usuario> usuarios;

    public GestionadorCarros(String nombre, ArrayList<Vehiculo> vehiculos, ArrayList<Cliente> clientes, ArrayList<Reserva> reservas, ArrayList<Usuario> usuarios) {
        this.nombre = nombre;
        this.vehiculos = vehiculos;
        this.clientes = clientes;
        this.reservas = reservas;
        this.usuarios = usuarios;
    }

    public static ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public static void setUsuarios(ArrayList<Usuario> usuarios) {
        GestionadorCarros.usuarios = usuarios;
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

    public static ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    public void crearCliente(String nombre, String apellido, String cedula, String telefono, String direccion){
        Cliente cliente = new Cliente(nombre, apellido, cedula, telefono, direccion);
        clientes.add(cliente);
    }
    public void crearVehiculo(String numeroMatricula, String marca, String modelo, LocalDate fechaFabricacion, String tipoVehiculo){
        Vehiculo vehiculo = new Vehiculo(numeroMatricula, marca, modelo, fechaFabricacion);
        vehiculos.add(vehiculo);
    }
    public static void crearReserva(Cliente cliente, Vehiculo vehiculo, LocalDate fechaReserva, LocalDate fechaEntrega){
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

    public static Cliente buscarCliente(String nombre){
        for (Cliente cliente: clientes){
            if (cliente.getNombre().equals(nombre)){
                return cliente;
            }
        }
        return null;
    }
    public static Vehiculo buscarVehiculo(String numeroMatricula){
        for (Vehiculo vehiculo: vehiculos){
            if (vehiculo.getNumeroMatricula().equals(numeroMatricula)){
                return vehiculo;
            }
        }
        return null;
    }
    public static Reserva buscarReserva(Cliente cliente){
        for (Reserva reserva: reservas){
            if (reserva.getCliente().equals(cliente)){
                return reserva;
            }
        }
        return null;
    }


}
