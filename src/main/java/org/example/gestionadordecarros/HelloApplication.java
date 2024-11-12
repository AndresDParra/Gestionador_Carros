package org.example.gestionadordecarros;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.gestionadordecarros.Clases.*;
import org.example.gestionadordecarros.Clases.Controlador.Cliente.Crear_Cliente;
import org.example.gestionadordecarros.Clases.Controlador.Vehiculo.Crear_Motocicleta;
import org.example.gestionadordecarros.Clases.Controlador.Vehiculo.Crear_Vehiculo;

import java.io.IOException;
import java.util.ArrayList;

import static jdk.internal.misc.OSEnvironment.initialize;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        initializeEverything();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/org/example/gestionadordecarros/Pagina_Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Gestionador de Carros UQ!");
        stage.setScene(scene);
        stage.show();

    }
public void initializeEverything() throws IOException {
    GestionadorCarros gestionadorCarros = new GestionadorCarros("Gestionador de Carros UQ!", new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
    GestionadorCarros.getVehiculos().add(Vehiculo.getSampleVehiculo());
    gestionadorCarros.getReservas().add(Reserva.getSampleReserva());
    GestionadorCarros.getClientes().add(Cliente.getSampleCliente());
    GestionadorCarros.getUsuarios().add(Usuario.getSampleUsuario());

    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/example/gestionadordecarros/Crear_Cliente.fxml"));
    fxmlLoader.load();
    Crear_Cliente crearClienteController = fxmlLoader.getController();
    crearClienteController.initialize();

    FXMLLoader fxmlLoaderMoto = new FXMLLoader(getClass().getResource("/org/example/gestionadordecarros/Crear_Motocicleta.fxml"));
    fxmlLoaderMoto.load();
    Crear_Motocicleta crearMotocicletaController = fxmlLoaderMoto.getController();
    crearMotocicletaController.initializeMoto();

    FXMLLoader fxmlLoaderVehiculo = new FXMLLoader(getClass().getResource("/org/example/gestionadordecarros/Crear_Vehiculo.fxml"));
    fxmlLoaderVehiculo.load();
    Crear_Vehiculo crearVehiculoController = fxmlLoaderVehiculo.getController();
    crearVehiculoController.initializeVehiculo();

}

    public static void main(String[] args) {
        launch();
    }
}