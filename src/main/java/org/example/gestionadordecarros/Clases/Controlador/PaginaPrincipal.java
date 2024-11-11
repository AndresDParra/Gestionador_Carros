package org.example.gestionadordecarros.Clases.Controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class PaginaPrincipal {

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
        Parent paginaOpcionesCliente = fxmlLoader.load(Objects.requireNonNull(getClass().getResource("/org/example/gestionadordecarros/Pagina_Gestion_Cliente.fxml")));
        Scene scene = new Scene(paginaOpcionesCliente, 600, 400);
        stagePasarACrearEstudiante.setScene(scene);
        stagePasarACrearEstudiante.show();
    }


    public void opciones_Vehiculo(ActionEvent actionEvent) throws IOException {
        Stage stageVehiculos = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent paginaOpcionesVehiculo = fxmlLoader.load(Objects.requireNonNull(getClass().getResource("/org/example/gestionadordecarros/Pagina_Gestion_Vehiculo.fxml")));
        Scene scene = new Scene(paginaOpcionesVehiculo, 600, 400);
        stageVehiculos.setScene(scene);
        stageVehiculos.show();
    }

    public void opciones_Reservas(ActionEvent actionEvent) throws IOException {
        Stage stageReservas = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent paginaOpcionesReservas = fxmlLoader.load(Objects.requireNonNull(getClass().getResource("/org/example/gestionadordecarros/Pagina_Gestion_Reserva.fxml")));
        Scene scene = new Scene(paginaOpcionesReservas, 600, 400);
        stageReservas.setScene(scene);
        stageReservas.show();
    }

    public void opciones_Empleados(ActionEvent actionEvent) throws IOException {
        Stage stageEmpleados = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent paginaOpcionesReservas = fxmlLoader.load(Objects.requireNonNull(getClass().getResource("/org/example/gestionadordecarros/Pagina_Gestion_Empleados.fxml")));
        Scene scene = new Scene(paginaOpcionesReservas, 600, 400);
        stageEmpleados.setScene(scene);
        stageEmpleados.show();
    }
}
