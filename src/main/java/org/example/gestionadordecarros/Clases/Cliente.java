package org.example.gestionadordecarros.Clases;

public class Cliente extends Persona{
    private String cedula;
    private String telefono;
    private String direccion;

    public Cliente(String nombre, String apellido, String cedula, String telefono, String direccion) {
        super(nombre, apellido);
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public static Cliente getSampleCliente() {
        return new Cliente("Juan", "Perez", "1234", "12345678", "Calle 123");
    }

    public String getCedula() {
        return cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cedula='" + cedula + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
