package org.example.gestionadordecarros.Clases;

public class Usuario extends Persona {
    private String nombreUsuario;
    private String contrasena;

    public Usuario(String nombreUsuario, String contrasena, String nombre, String cedula) {
        super(nombre, cedula);
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", contrasena='" + contrasena + '\'' +
                '}';
    }
    public static Usuario getSampleUsuario() {
        return new Usuario("JuanP", "123456", "Juan", "1234567890");
                
    }
}
