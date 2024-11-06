package org.example.gestionadordecarros;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.gestionadordecarros.Clases.*;

import java.io.IOException;
import java.util.ArrayList;

import static jdk.internal.misc.OSEnvironment.initialize;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        GestionadorCarros gestionadorCarros = new GestionadorCarros("Gestionador de Carros UQ!", new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        gestionadorCarros.getVehiculos().add(Vehiculo.getSampleVehiculo());
        gestionadorCarros.getReservas().add(Reserva.getSampleReserva());
        GestionadorCarros.getClientes().add(Cliente.getSampleCliente());
        GestionadorCarros.getUsuarios().add(Usuario.getSampleUsuario());
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/org/example/gestionadordecarros/Pagina_Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Gestionador de Carros UQ!");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}