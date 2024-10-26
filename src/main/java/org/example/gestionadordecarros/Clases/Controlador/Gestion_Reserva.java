package org.example.gestionadordecarros.Clases.Controlador;

import java.awt.*;

public class Gestion_Reserva {

    private TextField Espacio_Cliente;
    private TextField opciones_Vehiculo;
    private TextField espacio_Fecha_Inicio;
    private TextField espacio_Fecha_FInal;
    private Button Button_Reservar;

    public Gestion_Reserva(TextField espacio_Cliente, TextField opciones_Vehiculo, TextField espacio_Fecha_Inicio, TextField espacio_Fecha_FInal, Button button_Reservar) {
        Espacio_Cliente = espacio_Cliente;
        this.opciones_Vehiculo = opciones_Vehiculo;
        this.espacio_Fecha_Inicio = espacio_Fecha_Inicio;
        this.espacio_Fecha_FInal = espacio_Fecha_FInal;
        Button_Reservar = button_Reservar;
    }

    public TextField getEspacio_Cliente() {
        return Espacio_Cliente;
    }

    public void setEspacio_Cliente(TextField espacio_Cliente) {
        Espacio_Cliente = espacio_Cliente;
    }

    public TextField getOpciones_Vehiculo() {
        return opciones_Vehiculo;
    }

    public void setOpciones_Vehiculo(TextField opciones_Vehiculo) {
        this.opciones_Vehiculo = opciones_Vehiculo;
    }

    public TextField getEspacio_Fecha_Inicio() {
        return espacio_Fecha_Inicio;
    }

    public void setEspacio_Fecha_Inicio(TextField espacio_Fecha_Inicio) {
        this.espacio_Fecha_Inicio = espacio_Fecha_Inicio;
    }

    public TextField getEspacio_Fecha_FInal() {
        return espacio_Fecha_FInal;
    }

    public void setEspacio_Fecha_FInal(TextField espacio_Fecha_FInal) {
        this.espacio_Fecha_FInal = espacio_Fecha_FInal;
    }

    public Button getButton_Reservar() {
        return Button_Reservar;
    }

    public void setButton_Reservar(Button button_Reservar) {
        Button_Reservar = button_Reservar;
    }

    public void almacenar_Cliente(){

    }
}
