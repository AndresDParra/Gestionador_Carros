package org.example.gestionadordecarros.Clases.Controlador.Vehiculo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Motocicleta_O_Carro {

    @FXML
    public Button Button_Pasar_Crear_Motocicleta;
    @FXML
    public Button Button_Pasar_Crear_Vehiculo;

    public void pasar_Crear_Motocicleta(ActionEvent actionEvent) throws IOException {
        Stage stageEmpleados = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent paginaCrearEmpleados = fxmlLoader.load(Objects.requireNonNull(getClass().getResource("/org/example/gestionadordecarros/Crear_Motocicleta.fxml")));
        Scene scene = new Scene(paginaCrearEmpleados, 600, 400);
        stageEmpleados.setScene(scene);
        stageEmpleados.show();
    }

    public void pasar_Crear_Vehiculo(ActionEvent actionEvent) throws IOException {
        Stage stageEmpleados = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent paginaCrearEmpleados = fxmlLoader.load(Objects.requireNonNull(getClass().getResource("/org/example/gestionadordecarros/Crear_Vehiculo.fxml")));
        Scene scene = new Scene(paginaCrearEmpleados, 600, 400);
        stageEmpleados.setScene(scene);
        stageEmpleados.show();
    }
}