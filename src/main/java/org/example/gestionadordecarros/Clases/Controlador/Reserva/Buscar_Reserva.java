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

import static org.example.gestionadordecarros.Clases.Controlador.Alert.showAlert;

public class Buscar_Reserva {

    @FXML
    private TextField espacio_Cliente;
    @FXML
    private TextField espacio_Fecha_Reserva;
    @FXML
    private Button button_Buscar;
    @FXML
    private Button button_Limpiar;
    @FXML
    private Button button_Eliminar;
    @FXML
    private ComboBox<String > espacio_Tipo_Vehiculo;
    @FXML
    private TextField espacio_Fecha_Entrega;
    @FXML
    private TableView<Reserva> table_reservas;
    @FXML
    private TableColumn<Reserva, String> column_Cliente;
    @FXML
    private TableColumn<Reserva, String> column_Vehiculo;
    @FXML
    private TableColumn<Reserva, String> column_Fecha_Reserva;
    @FXML
    private TableColumn<Reserva, String > column_Fecha_Entrega;
    @FXML
    private TableColumn<Reserva, String> column_Precio;

    public void initialize() {

        column_Cliente.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCliente().toString()));
        column_Vehiculo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getVehiculo().toString()));
        column_Fecha_Reserva.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getFechaReserva().toString()));
        column_Fecha_Entrega.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getFechaEntrega().toString()));
        column_Precio.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getPrecioTotal())));
        espacio_Tipo_Vehiculo.setItems(FXCollections.observableArrayList(
                String.valueOf(new Vehiculo("123", "Toyota", "2023", LocalDate.now()))
        ));
        ObservableList<Reserva> reservas = FXCollections.observableArrayList(
                new Reserva(new Cliente("123", "Juan", "Perez", "1234", "Calle 24"),
                        new Vehiculo("234", "Toyota", "2023", LocalDate.now()),
                        1000,
                        LocalDate.now(),
                        LocalDate.now()));
        table_reservas.setItems(reservas);
    }

    public void buscar_Reserva(ActionEvent actionEvent) {
        String clienteCedula = espacio_Cliente.getText();
        LocalDate fechaReserva = LocalDate.parse(espacio_Fecha_Reserva.getText());
        LocalDate fechaEntrega = LocalDate.parse(espacio_Fecha_Entrega.getText());
        String vehiculo = espacio_Tipo_Vehiculo.getValue();

        for (Reserva reserva: GestionadorCarros.getReservas()){
            if (reserva.getCliente().getCedula().equals(clienteCedula) && Reserva.getFechaReserva().equals(fechaReserva) && reserva.getFechaEntrega().equals(fechaEntrega) && reserva.getVehiculo().getNumeroMatricula().equals(vehiculo)){
                table_reservas.getItems().add(reserva);
                showAlert(Alert.AlertType.INFORMATION, "La reserva ha sido encontrada", "La reserva ha sido encontrada");
            }else {
                showAlert(Alert.AlertType.ERROR, "La reserva no ha sido encontrada", "La reserva no existe");
            }
        }
    }

    public void limpiar_Reserva(ActionEvent actionEvent) {
        espacio_Cliente.clear();
        espacio_Fecha_Reserva.clear();
        espacio_Fecha_Entrega.clear();

    }

    public void eliminar_Reserva(ActionEvent actionEvent) {
        
    }
}
