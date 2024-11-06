package org.example.gestionadordecarros.Clases.Controlador.Cliente;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Opciones_Cliente {
    @FXML
    public Button Button_Crear_Cliente;
    @FXML
    public Button Button_Buscar_Cliente;

    public void opciones_Cliente() throws IOException {

    }

    public void pasar_A_Crear_Cliente(ActionEvent actionEvent) throws IOException {
        Stage stagePasarACrearEstudiante = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent paginaOpcionesCliente = fxmlLoader.load(Objects.requireNonNull(getClass().getResource("/org/example/gestionadordecarros/Crear_Cliente.fxml")));
        Scene scene = new Scene(paginaOpcionesCliente, 600, 400);
        stagePasarACrearEstudiante.setScene(scene);
        stagePasarACrearEstudiante.show();
    }

    public void pasar_A_Buscar_Cliente(ActionEvent actionEvent) throws IOException {
        Stage stageEmpleados = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent paginaOpcionesReservas = fxmlLoader.load(Objects.requireNonNull(getClass().getResource("/org/example/gestionadordecarros/Buscar_Cliente.fxml")));
        Scene scene = new Scene(paginaOpcionesReservas, 500, 600);
        stageEmpleados.setScene(scene);
        stageEmpleados.show();
    }
}

