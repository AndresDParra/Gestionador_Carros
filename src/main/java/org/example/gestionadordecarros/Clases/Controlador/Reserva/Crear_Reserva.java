package org.example.gestionadordecarros.Clases.Controlador.Reserva;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.example.gestionadordecarros.Clases.Cliente;
import org.example.gestionadordecarros.Clases.GestionadorCarros;
import org.example.gestionadordecarros.Clases.Reserva;
import org.example.gestionadordecarros.Clases.Vehiculo;

import java.time.LocalDate;
import java.util.Vector;

import static org.example.gestionadordecarros.Clases.Controlador.Alert.showAlert;

public class Crear_Reserva {

    @FXML
    public TextField espacio_cliente;
    @FXML
    public TextField espacio_Fecha_reserva;
    @FXML
    public TextField espacio_fecha_entrega;
    @FXML
    public Button Button_Crear_Reserva;
    @FXML
    public Button Button_Limpiar_Espacio;
    @FXML
    public ComboBox<String> espacio_tipo_vehiculo;
    @FXML
    public TableView<Reserva> table_Informacion_Reserva;
    @FXML
    public TableColumn<Reserva, String> column_Cliente;
    @FXML
    public TableColumn<Reserva, String> column_Vehiculo;
    @FXML
    public TableColumn<Reserva, String > column_Fecha_Reserva;
    @FXML
    public TableColumn<Reserva, String> column_Fecha_Entrega;
    @FXML
    public TableColumn<Reserva, String> column_Precio;


    public Crear_Reserva() {
    }

    public void initialize() {

        column_Cliente.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCliente().toString()));
        column_Vehiculo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getVehiculo().toString()));
        column_Fecha_Reserva.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getFechaReserva().toString()));
        column_Fecha_Entrega.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getFechaEntrega().toString()));
        column_Precio.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getPrecioTotal())));
        espacio_tipo_vehiculo.setItems(FXCollections.observableArrayList(
                String.valueOf(new Vehiculo("123", "Toyota", "2023", LocalDate.now()))
        ));
        ObservableList<Reserva> reservas = FXCollections.observableArrayList(
                new Reserva(new Cliente("123", "Juan", "Perez", "1234", "Calle 24"),
                        new Vehiculo("234", "Toyota", "2023", LocalDate.now()),
                        1000,
                        LocalDate.now(),
                        LocalDate.now()));
        table_Informacion_Reserva.setItems(reservas);
        }



    public void crear_Reserva(ActionEvent actionEvent) {
         Cliente clienteAux = new Cliente("123", "Juan", "Perez", "1234", "Calle 24");
        Vehiculo vehiculoAux = new Vehiculo("234", "Toyota", "2023", LocalDate.now());
        String CedulaCliente = espacio_cliente.getText();
        String vehiculoPlaca = espacio_tipo_vehiculo.getValue();
        LocalDate FechaReserva = LocalDate.parse(espacio_Fecha_reserva.getText());
        LocalDate FechaEntrega = LocalDate.parse(espacio_fecha_entrega.getText());

        for (Cliente cliente : GestionadorCarros.getClientes()) {
            if (cliente.getCedula().equals(CedulaCliente)) {
                clienteAux = cliente;
            }
        }

        for (Vehiculo vehiculo : GestionadorCarros.getVehiculos()) {
            if (vehiculo.getNumeroMatricula().equals(vehiculoPlaca)) {
                vehiculoAux = vehiculo;
            }
        }
        Vehiculo finalVehiculoAux = vehiculoAux;
        float precioTotal =  Reserva.calcularPrecioTotal(finalVehiculoAux, FechaReserva, FechaEntrega);

        Reserva reserva = new Reserva(clienteAux, finalVehiculoAux,precioTotal, FechaReserva, FechaEntrega);
        GestionadorCarros.getReservas().add(reserva);
        table_Informacion_Reserva.getItems().add(reserva);
        showAlert(Alert.AlertType.INFORMATION, "Success", "Reserva creada");
        

    }

    public void limpiar_Informacion_Reserva(ActionEvent actionEvent) {
        espacio_cliente.clear();
        espacio_Fecha_reserva.clear();
        espacio_fecha_entrega.clear();

    }
}
