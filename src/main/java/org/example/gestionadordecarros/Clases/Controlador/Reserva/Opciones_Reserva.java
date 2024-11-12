package org.example.gestionadordecarros.Clases.Controlador.Reserva;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;



public class Opciones_Reserva {

    @FXML
    private Button Button_Crear_reserva;
    @FXML
    private Button Button_Buscar_Reserva;

    public Button getButton_Crear_reserva() {
        return Button_Crear_reserva;
    }

    public void setButton_Crear_reserva(Button button_Crear_reserva) {
        Button_Crear_reserva = button_Crear_reserva;
    }

    public Button getButton_Buscar_Reserva() {
        return Button_Buscar_Reserva;
    }

    public void setButton_Buscar_Reserva(Button button_Buscar_Reserva) {
        Button_Buscar_Reserva = button_Buscar_Reserva;
    }

    public Opciones_Reserva() {
    }

    @FXML
    public void pasar_A_Crear_Reserva(ActionEvent actionEvent) throws IOException {

        Stage stageReserva = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent paginaCrearReserva = fxmlLoader.load(Objects.requireNonNull(getClass().getResource("/org/example/gestionadordecarros/Crear_Reserva.fxml")));
        Scene scene = new Scene(paginaCrearReserva, 600, 400);
        stageReserva.setScene(scene);
        stageReserva.show();

    }

    @FXML
    public void pasar_A_Buscar_Reserva(ActionEvent actionEvent) throws IOException {
        Stage stageReserva = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent paginaBuscarReserva = fxmlLoader.load(Objects.requireNonNull(getClass().getResource("/org/example/gestionadordecarros/Buscar_Reserva.fxml")));
        Scene scene = new Scene(paginaBuscarReserva, 600, 400);
        stageReserva.setScene(scene);
        stageReserva.show();
    }
    }

