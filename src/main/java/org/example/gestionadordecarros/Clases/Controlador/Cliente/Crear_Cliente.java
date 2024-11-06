package org.example.gestionadordecarros.Clases.Controlador.Cliente;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import org.example.gestionadordecarros.Clases.Cliente;
import org.example.gestionadordecarros.Clases.GestionadorCarros;

import static org.example.gestionadordecarros.Clases.Controlador.Alert.showAlert;

public class Crear_Cliente {

    @FXML
    public Button Button_Guardar_Cliente;
    @FXML
    public TextField espacio_Direccion_Cliente;
    @FXML
    public TextField espacio_Telefono_Cliente;
    @FXML
    public TextField espacio_Cedula_Cliente;
    @FXML
    public TextField espacio_Apellido;
    @FXML
    public TextField espacio_Nombre_Cliente;
    @FXML
    public TableColumn<Cliente, String> column_Nombre;
    @FXML
    public TableColumn<Cliente, String> column_Cedula;
    @FXML
    public Button Button_Limpiar_Cliente_Creado;
    @FXML
    public TableView<Cliente> Table_Cliente;

    public Button getButton_Guardar_Cliente() {
        return Button_Guardar_Cliente;
    }

    public void setButton_Guardar_Cliente(Button button_Guardar_Cliente) {
        Button_Guardar_Cliente = button_Guardar_Cliente;
    }

    public TextField getEspacio_Direccion_Cliente() {
        return espacio_Direccion_Cliente;
    }

    public void setEspacio_Direccion_Cliente(TextField espacio_Direccion_Cliente) {
        this.espacio_Direccion_Cliente = espacio_Direccion_Cliente;
    }

    public TextField getEspacio_Telefono_Cliente() {
        return espacio_Telefono_Cliente;
    }

    public void setEspacio_Telefono_Cliente(TextField espacio_Telefono_Cliente) {
        this.espacio_Telefono_Cliente = espacio_Telefono_Cliente;
    }

    public TextField getEspacio_Cedula_Cliente() {
        return espacio_Cedula_Cliente;
    }

    public void setEspacio_Cedula_Cliente(TextField espacio_Cedula_Cliente) {
        this.espacio_Cedula_Cliente = espacio_Cedula_Cliente;
    }

    public TextField getEspacio_Apellido() {
        return espacio_Apellido;
    }

    public void setEspacio_Apellido(TextField espacio_Apellido) {
        this.espacio_Apellido = espacio_Apellido;
    }

    public TextField getEspacio_Nombre_Cliente() {
        return espacio_Nombre_Cliente;
    }

    public void setEspacio_Nombre_Cliente(TextField espacio_Nombre_Cliente) {
        this.espacio_Nombre_Cliente = espacio_Nombre_Cliente;
    }

    public TableColumn<Cliente, String> getColumn_Nombre() {
        return column_Nombre;
    }

    public void setColumn_Nombre(TableColumn<Cliente, String> column_Nombre) {
        this.column_Nombre = column_Nombre;
    }

    public TableColumn<Cliente, String> getColumn_Cedula() {
        return column_Cedula;
    }

    public void setColumn_Cedula(TableColumn<Cliente, String> column_Cedula) {
        this.column_Cedula = column_Cedula;
    }

    public Button getButton_Limpiar_Cliente_Creado() {
        return Button_Limpiar_Cliente_Creado;
    }

    public void setButton_Limpiar_Cliente_Creado(Button button_Limpiar_Cliente_Creado) {
        Button_Limpiar_Cliente_Creado = button_Limpiar_Cliente_Creado;
    }

    public TableView<Cliente> getTable_Cliente() {
        return Table_Cliente;
    }

    public void setTable_Cliente(TableView<Cliente> table_Cliente) {
        Table_Cliente = table_Cliente;
    }

    public Crear_Cliente(Button button_Guardar_Cliente, TextField espacio_Direccion_Cliente, TextField espacio_Telefono_Cliente, TextField espacio_Cedula_Cliente, TextField espacio_Apellido, TextField espacio_Nombre_Cliente, Button button_Limpiar_Cliente_Creado) {
        Button_Guardar_Cliente = button_Guardar_Cliente;
        this.espacio_Direccion_Cliente = espacio_Direccion_Cliente;
        this.espacio_Telefono_Cliente = espacio_Telefono_Cliente;
        this.espacio_Cedula_Cliente = espacio_Cedula_Cliente;
        this.espacio_Apellido = espacio_Apellido;
        this.espacio_Nombre_Cliente = espacio_Nombre_Cliente;
        Button_Limpiar_Cliente_Creado = button_Limpiar_Cliente_Creado;
    }

    public Crear_Cliente() {
    }
    public void initialize() {
        column_Nombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        column_Cedula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCedula()));
        ObservableList<Cliente> clientes = FXCollections.observableArrayList(
                new Cliente("Juan", "Parra", "1234567890", "54321", "Calle 20"),
                new Cliente("Maria", "Luisa", "0987654321", "32444", "Calle 30"));
        Table_Cliente.setItems(clientes);
    }

    @FXML
    public void guardar_Cliente(ActionEvent actionEvent) {
        initialize();
        String nombre = espacio_Nombre_Cliente.getText();
        String apellido = espacio_Apellido.getText();
        String cedula = espacio_Cedula_Cliente.getText();
        String telefono = espacio_Telefono_Cliente.getText();
        String direccion = espacio_Direccion_Cliente.getText();

        if (nombre == null || apellido == null || cedula == null || telefono == null || direccion == null || nombre.isEmpty() || apellido.isEmpty() || cedula.isEmpty() || telefono.isEmpty() || direccion.isEmpty()) {
            showAlert(javafx.scene.control.Alert.AlertType.ERROR, "Error", "All fields must not be empty");
        } else {
            Cliente cliente = new Cliente(nombre, apellido, cedula, telefono, direccion);
            GestionadorCarros.getClientes().add(cliente);
            showAlert(javafx.scene.control.Alert.AlertType.INFORMATION, "Success", "Cliente guardado");
            Table_Cliente.setItems(FXCollections.observableArrayList(GestionadorCarros.getClientes()));

        }
    }




    public void limpiar_Cliente(ActionEvent actionEvent) {
        espacio_Nombre_Cliente.clear();
        espacio_Apellido.clear();
        espacio_Cedula_Cliente.clear();
        espacio_Telefono_Cliente.clear();
        espacio_Direccion_Cliente.clear();

    }
}
