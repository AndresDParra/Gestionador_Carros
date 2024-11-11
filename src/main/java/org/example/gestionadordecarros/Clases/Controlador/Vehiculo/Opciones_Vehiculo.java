package org.example.gestionadordecarros.Clases.Controlador.Vehiculo;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Opciones_Vehiculo {

    public void pasar_A_Crear_Vehiculo(ActionEvent actionEvent) throws IOException {
        Stage stageEmpleados = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent paginaCrearEmpleados = fxmlLoader.load(Objects.requireNonNull(getClass().getResource("/org/example/gestionadordecarros/Buscar_Vehiculo.fxml")));
        Scene scene = new Scene(paginaCrearEmpleados, 600, 400);
        stageEmpleados.setScene(scene);
        stageEmpleados.show();
    }

    public void pasar_A_Buscar_Vehiculo(ActionEvent actionEvent) throws IOException {
        Stage stageEmpleados = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent paginaBuscarEmpleado = fxmlLoader.load(Objects.requireNonNull(getClass().getResource("/org/example/gestionadordecarros/Crear_Vehiculo.fxml")));
        Scene scene = new Scene(paginaBuscarEmpleado, 600, 400);
        stageEmpleados.setScene(scene);
        stageEmpleados.show();
    }
}
