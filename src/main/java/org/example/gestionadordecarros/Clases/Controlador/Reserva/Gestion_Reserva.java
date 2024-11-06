package org.example.gestionadordecarros.Clases.Controlador.Reserva;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import org.example.gestionadordecarros.Clases.Cliente;
import org.example.gestionadordecarros.Clases.Vehiculo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.example.gestionadordecarros.Clases.Controlador.Alert.showAlert;
import static org.example.gestionadordecarros.Clases.GestionadorCarros.*;

public class Gestion_Reserva {

    @FXML
    private TextField Espacio_Cliente;
    @FXML
    private ComboBox<String> opciones_Vehiculo;
    @FXML
    private TextField espacio_Fecha_Inicio;
    @FXML
    private TextField espacio_Fecha_FInal;
    @FXML
    private Button Button_Reservar;

    public Gestion_Reserva(TextField espacio_Cliente, ComboBox<String> opciones_Vehiculo, TextField espacio_Fecha_Inicio, TextField espacio_Fecha_FInal, Button button_Reservar) {
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

    public ComboBox getOpciones_Vehiculo() {
        return opciones_Vehiculo;
    }

    public void setOpciones_Vehiculo(ComboBox<String> opciones_Vehiculo) {
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

    public void Inicialize(ActionEvent actionEvent) {
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("Carro", "Motocicleta", "Camioneta");
    }

    public void guardar_Reserva(ActionEvent actionEvent) {
        try {
            String cliente = Espacio_Cliente.getText();
            String vehiculo = opciones_Vehiculo.getValue();
            String fecha_inicio = espacio_Fecha_Inicio.getText();
            String fecha_entrega = espacio_Fecha_FInal.getText();



            if (cliente == null || vehiculo == null || fecha_inicio == null || fecha_entrega == null || cliente.isEmpty() || vehiculo.isEmpty() || fecha_inicio.isEmpty() || fecha_entrega.isEmpty()) {
                showAlert(javafx.scene.control.Alert.AlertType.ERROR, "Error", "Cliente, Vehiculo, Fecha de Inicio y Fecha de Entrega no pueden estar vacios");
                return;


            }
            Cliente clienteObj = buscarCliente(cliente);
            Vehiculo vehiculoObj = buscarVehiculo(vehiculo);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate fechaInicio = LocalDate.parse(fecha_inicio, formatter);
            LocalDate fechaEntrega = LocalDate.parse(fecha_entrega, formatter);

            crearReserva(clienteObj, vehiculoObj, fechaInicio, fechaEntrega);
            showAlert(javafx.scene.control.Alert.AlertType.INFORMATION, "Exito", "Reserva creada exitosamente");
        } catch (NullPointerException e) {
            showAlert(javafx.scene.control.Alert.AlertType.ERROR, "Error", "Error: " + e.getMessage());
        }
    }
}