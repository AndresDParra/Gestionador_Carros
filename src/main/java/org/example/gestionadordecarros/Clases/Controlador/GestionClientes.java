package org.example.gestionadordecarros.Clases.Controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class GestionClientes {

    @FXML
    public Button Button_Clientes;
    @FXML
    public Button Button_Vehiculos;
    @FXML
    public Button Button_Reservas;
    @FXML
    public Button Button_Empleados;


    public void opciones_Cliente(ActionEvent actionEvent) throws IOException {
        Stage stagePasarACrearEstudiante = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent paginaOpcionesCliente = fxmlLoader.load(getClass().getResource("/com/uq/sample/thefxapp/view/FrontEnd/Pagina_Crear_Estudiante.fxml"));
        Scene scene = new Scene(paginaOpcionesCliente, 500, 500);
        stagePasarACrearEstudiante.setScene(scene);
        stagePasarACrearEstudiante.show();
    }


    public void opciones_Vehiculo(ActionEvent actionEvent) throws IOException {
        Stage stagePasarACrearEstudiante = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent paginaOpcionesVehiculo = fxmlLoader.load(getClass().getResource("/com/uq/sample/thefxapp/view/FrontEnd/Pagina_Borrar_Estudiante.fxml"));
        Scene scene = new Scene(paginaOpcionesVehiculo, 500, 500);
        stagePasarACrearEstudiante.setScene(scene);
        stagePasarACrearEstudiante.show();
    }

    public void opciones_Reservas(ActionEvent actionEvent) throws IOException {
        Stage stageReservas = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent paginaOpcionesReservas = fxmlLoader.load(getClass().getResource("/com/uq/sample/thefxapp/view/FrontEnd/Pagina_Borrar_Estudiante.fxml"));
        Scene scene = new Scene(paginaOpcionesReservas, 500, 500);
        stageReservas.setScene(scene);
        stageReservas.show();
    }
}
