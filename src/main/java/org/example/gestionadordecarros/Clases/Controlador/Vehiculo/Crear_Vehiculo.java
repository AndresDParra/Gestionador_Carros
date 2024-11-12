package org.example.gestionadordecarros.Clases.Controlador.Vehiculo;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.example.gestionadordecarros.Clases.GestionadorCarros;
import org.example.gestionadordecarros.Clases.Vehiculo;

import java.time.LocalDate;

import static org.example.gestionadordecarros.Clases.Controlador.Alert.showAlert;

public class Crear_Vehiculo {

    @FXML
    public TextField espacio_Numero_Matricula;
    @FXML
    public TextField espacio_Marca_Vehiculo;
    @FXML
    public TextField espacio_Fecha_Publicacion;
    @FXML
    public TextField espacio_Modelo_Vehiculo;
    @FXML
    public TextField espacio_Tipo_Vehiculo;
    @FXML
    public Button Button_Crear_Vehiculo;
    @FXML
    public Button Button_Limpiar_Espacio;
    @FXML
    public TableView<Vehiculo> table_Informacion_Vehiculo;
    @FXML
    public TableColumn<Vehiculo, String> column_Matricula;
    @FXML
    public TableColumn<Vehiculo, String> column_Marca;
    @FXML
    public TableColumn<Vehiculo, LocalDate> column_Fecha;
    @FXML
    public TableColumn<Vehiculo, String> column_Modelo;
    @FXML
    public TableColumn<Vehiculo, String> column_Tipo;

    public Crear_Vehiculo(TextField espacio_Numero_Matricula, TextField espacio_Marca_Vehiculo, TextField espacio_Fecha_Publicacion, TextField espacio_Modelo_Vehiculo, TextField espacio_Tipo_Vehiculo, Button button_Crear_Vehiculo, Button button_Limpiar_Espacio, TableView<Vehiculo> table_Informacion_Vehiculo, TableColumn<Vehiculo, String> column_Matricula, TableColumn<Vehiculo, String> column_Marca, TableColumn<Vehiculo, LocalDate> column_Fecha, TableColumn<Vehiculo, String> column_Modelo, TableColumn<Vehiculo, String> column_Tipo) {
        this.espacio_Numero_Matricula = espacio_Numero_Matricula;
        this.espacio_Marca_Vehiculo = espacio_Marca_Vehiculo;
        this.espacio_Fecha_Publicacion = espacio_Fecha_Publicacion;
        this.espacio_Modelo_Vehiculo = espacio_Modelo_Vehiculo;
        this.espacio_Tipo_Vehiculo = espacio_Tipo_Vehiculo;
        Button_Crear_Vehiculo = button_Crear_Vehiculo;
        Button_Limpiar_Espacio = button_Limpiar_Espacio;
        this.table_Informacion_Vehiculo = table_Informacion_Vehiculo;
        this.column_Matricula = column_Matricula;
        this.column_Marca = column_Marca;
        this.column_Fecha = column_Fecha;
        this.column_Modelo = column_Modelo;
        this.column_Tipo = column_Tipo;
    }

    public Crear_Vehiculo() {
    }

    public TextField getEspacio_Numero_Matricula() {
        return espacio_Numero_Matricula;
    }

    public void setEspacio_Numero_Matricula(TextField espacio_Numero_Matricula) {
        this.espacio_Numero_Matricula = espacio_Numero_Matricula;
    }

    public TextField getEspacio_Marca_Vehiculo() {
        return espacio_Marca_Vehiculo;
    }

    public void setEspacio_Marca_Vehiculo(TextField espacio_Marca_Vehiculo) {
        this.espacio_Marca_Vehiculo = espacio_Marca_Vehiculo;
    }

    public TextField getEspacio_Fecha_Publicacion() {
        return espacio_Fecha_Publicacion;
    }

    public void setEspacio_Fecha_Publicacion(TextField espacio_Fecha_Publicacion) {
        this.espacio_Fecha_Publicacion = espacio_Fecha_Publicacion;
    }

    public TextField getEspacio_Modelo_Vehiculo() {
        return espacio_Modelo_Vehiculo;
    }

    public void setEspacio_Modelo_Vehiculo(TextField espacio_Modelo_Vehiculo) {
        this.espacio_Modelo_Vehiculo = espacio_Modelo_Vehiculo;
    }

    public TextField getEspacio_Tipo_Vehiculo() {
        return espacio_Tipo_Vehiculo;
    }

    public void setEspacio_Tipo_Vehiculo(TextField espacio_Tipo_Vehiculo) {
        this.espacio_Tipo_Vehiculo = espacio_Tipo_Vehiculo;
    }

    public Button getButton_Crear_Vehiculo() {
        return Button_Crear_Vehiculo;
    }

    public void setButton_Crear_Vehiculo(Button button_Crear_Vehiculo) {
        Button_Crear_Vehiculo = button_Crear_Vehiculo;
    }

    public Button getButton_Limpiar_Espacio() {
        return Button_Limpiar_Espacio;
    }

    public void setButton_Limpiar_Espacio(Button button_Limpiar_Espacio) {
        Button_Limpiar_Espacio = button_Limpiar_Espacio;
    }

    public TableView<Vehiculo> getTable_Informacion_Vehiculo() {
        return table_Informacion_Vehiculo;
    }

    public void setTable_Informacion_Vehiculo(TableView<Vehiculo> table_Informacion_Vehiculo) {
        this.table_Informacion_Vehiculo = table_Informacion_Vehiculo;
    }

    public TableColumn<Vehiculo, String> getColumn_Matricula() {
        return column_Matricula;
    }

    public void setColumn_Matricula(TableColumn<Vehiculo, String> column_Matricula) {
        this.column_Matricula = column_Matricula;
    }

    public TableColumn<Vehiculo, String> getColumn_Marca() {
        return column_Marca;
    }

    public void setColumn_Marca(TableColumn<Vehiculo, String> column_Marca) {
        this.column_Marca = column_Marca;
    }

    public TableColumn<Vehiculo, LocalDate> getColumn_Fecha() {
        return column_Fecha;
    }

    public void setColumn_Fecha(TableColumn<Vehiculo, LocalDate> column_Fecha) {
        this.column_Fecha = column_Fecha;
    }

    public TableColumn<Vehiculo, String> getColumn_Modelo() {
        return column_Modelo;
    }

    public void setColumn_Modelo(TableColumn<Vehiculo, String> column_Modelo) {
        this.column_Modelo = column_Modelo;
    }

    public TableColumn<Vehiculo, String> getColumn_Tipo() {
        return column_Tipo;
    }

    public void setColumn_Tipo(TableColumn<Vehiculo, String> column_Tipo) {
        this.column_Tipo = column_Tipo;
    }
    @FXML
    public void initialize() {
        initializeVehiculo();
    }

    public void initializeVehiculo() {
        column_Matricula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNumeroMatricula()));
        column_Marca.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMarca()));
        column_Fecha.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getFechaFabricacion()));
        column_Modelo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getModelo()));
        ObservableList<Vehiculo> vehiculos = FXCollections.observableArrayList(
                new Vehiculo("1234", "Toyota", "Corolla", LocalDate.now()),
                new Vehiculo("5678", "Nissan", "Sentra", LocalDate.now())
        );
        table_Informacion_Vehiculo.setItems(vehiculos);
    }

    public void crear_Vehiculo() {
        try {
            String numero_Matricula = espacio_Numero_Matricula.getText();
            String marca_Vehiculo = espacio_Marca_Vehiculo.getText();
            LocalDate fecha_Publicacion = LocalDate.parse(espacio_Fecha_Publicacion.getText());
            String modelo_Vehiculo = espacio_Modelo_Vehiculo.getText();

            Vehiculo vehiculo = new Vehiculo(numero_Matricula, marca_Vehiculo, modelo_Vehiculo, fecha_Publicacion);
            GestionadorCarros.getVehiculos().add(vehiculo);
            table_Informacion_Vehiculo.getItems().add(vehiculo);
        } catch (Exception e) {
            showAlert(Alert.AlertType.ERROR, "Error", "Error al crear el vehiculo");
        }
    }

    public void limpiar_Informacion_Vehiculo() {
        espacio_Numero_Matricula.clear();
        espacio_Marca_Vehiculo.clear();
        espacio_Fecha_Publicacion.clear();
        espacio_Modelo_Vehiculo.clear();
        espacio_Tipo_Vehiculo.clear();
    }




}

