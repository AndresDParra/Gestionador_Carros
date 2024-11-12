package org.example.gestionadordecarros.Clases.Controlador.Vehiculo;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.example.gestionadordecarros.Clases.GestionadorCarros;
import org.example.gestionadordecarros.Clases.Motocicleta;
import org.example.gestionadordecarros.Clases.TIPO_MOTOCICLETA;


import java.time.LocalDate;
import java.util.Arrays;

import static org.example.gestionadordecarros.Clases.Controlador.Alert.showAlert;

public class Crear_Motocicleta {

        @FXML
        private TextField espacio_Numero_Matricula;
        @FXML
        private TextField espacio_Marca_Vehiculo;
        @FXML
        private TextField espacio_Fecha_Publicacion;
        @FXML
        private Button Button_Crear_Motocicleta;
        @FXML
        private Button Button_Limpiar_Espacio;
        @FXML
        private TableView<Motocicleta> table_Informacion_Motocicleta;
        @FXML
        private TableColumn<Motocicleta, String> column_Matricula;
        @FXML
        private TableColumn<Motocicleta, String> column_Marca;
        @FXML
        private TableColumn<Motocicleta, LocalDate> column_Fecha;
        @FXML
        private TableColumn<Motocicleta, String> column_Modelo;
        @FXML
        private TableColumn<Motocicleta, String> column_Tipo;
        @FXML
        private TextField espacio_Modelo_Motocicleta;
        @FXML
        private ComboBox<String> box_Tipo_Motocicleta;


    public Crear_Motocicleta() {

        }

    public Button getButton_Crear_Motocicleta() {
        return Button_Crear_Motocicleta;
    }

    public void setButton_Crear_Motocicleta(Button button_Crear_Motocicleta) {
        Button_Crear_Motocicleta = button_Crear_Motocicleta;
    }

    public TextField getEspacio_Modelo_Motocicleta() {
        return espacio_Modelo_Motocicleta;
    }

    public void setEspacio_Modelo_Motocicleta(TextField espacio_Modelo_Motocicleta) {
        this.espacio_Modelo_Motocicleta = espacio_Modelo_Motocicleta;
    }

    public ComboBox<String> getBox_Tipo_Motocicleta() {
        return box_Tipo_Motocicleta;
    }

    public void setBox_Tipo_Motocicleta(ComboBox<String> box_Tipo_Motocicleta) {
        this.box_Tipo_Motocicleta = box_Tipo_Motocicleta;
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


        public Button getButton_Limpiar_Espacio() {
            return Button_Limpiar_Espacio;
        }

        public void setButton_Limpiar_Espacio(Button button_Limpiar_Espacio) {
            Button_Limpiar_Espacio = button_Limpiar_Espacio;
        }

    public TableView<Motocicleta> getTable_Informacion_Motocicleta() {
        return table_Informacion_Motocicleta;
    }

    public void setTable_Informacion_Motocicleta(TableView<Motocicleta> table_Informacion_Motocicleta) {
        this.table_Informacion_Motocicleta = table_Informacion_Motocicleta;
    }

    public TableColumn<Motocicleta, String> getColumn_Matricula() {
            return column_Matricula;
        }

        public void setColumn_Matricula(TableColumn<Motocicleta, String> column_Matricula) {
            this.column_Matricula = column_Matricula;
        }

        public TableColumn<Motocicleta, String> getColumn_Marca() {
            return column_Marca;
        }

        public void setColumn_Marca(TableColumn<Motocicleta, String> column_Marca) {
            this.column_Marca = column_Marca;
        }

        public TableColumn<Motocicleta, LocalDate> getColumn_Fecha() {
            return column_Fecha;
        }

        public void setColumn_Fecha(TableColumn<Motocicleta, LocalDate> column_Fecha) {
            this.column_Fecha = column_Fecha;
        }

        public TableColumn<Motocicleta, String> getColumn_Modelo() {
            return column_Modelo;
        }

        public void setColumn_Modelo(TableColumn<Motocicleta, String> column_Modelo) {
            this.column_Modelo = column_Modelo;
        }

        public TableColumn<Motocicleta, String> getColumn_Tipo() {
            return column_Tipo;
        }

        public void setColumn_Tipo(TableColumn<Motocicleta, String> column_Tipo) {
            this.column_Tipo = column_Tipo;
        }

        @FXML
        public void initialize() {
            initializeMoto();
        }

        @FXML
        public void initializeMoto(){
            column_Matricula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNumeroMatricula()));
            column_Marca.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMarca()));
            column_Fecha.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getFechaFabricacion()));
            column_Modelo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getModelo()));
            column_Tipo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTipoMotocicleta().toString()));

            ObservableList<Motocicleta> motocicleta = FXCollections.observableArrayList(
                    new Motocicleta("1234", "Toyota", "Corolla", LocalDate.now(), TIPO_MOTOCICLETA.AUTOMATICO),
                    new Motocicleta("5678", "Nissan", "Sentra", LocalDate.now(), TIPO_MOTOCICLETA.MANUAL)
            );
            table_Informacion_Motocicleta.setItems(motocicleta);

            box_Tipo_Motocicleta.setItems(FXCollections.observableArrayList(
                    TIPO_MOTOCICLETA.AUTOMATICO.toString(),
                    TIPO_MOTOCICLETA.MANUAL.toString()));

        }

    @FXML
    public void crear_Motocicleta(ActionEvent actionEvent) {
        try {
            String numero_Matricula = espacio_Numero_Matricula.getText();
            String marca_Vehiculo = espacio_Marca_Vehiculo.getText();
            LocalDate fecha_Publicacion = LocalDate.parse(espacio_Fecha_Publicacion.getText());
            String modelo_Vehiculo = espacio_Modelo_Motocicleta.getText();
            TIPO_MOTOCICLETA tipo_Motocicleta = TIPO_MOTOCICLETA.valueOf(box_Tipo_Motocicleta.getValue());

            Motocicleta motocicleta = new Motocicleta(numero_Matricula, marca_Vehiculo, modelo_Vehiculo, fecha_Publicacion, tipo_Motocicleta);
            GestionadorCarros.getVehiculos().add(motocicleta);
            table_Informacion_Motocicleta.getItems().add(motocicleta);
        } catch (Exception e) {
            showAlert(Alert.AlertType.ERROR, "Error", "Error al crear el vehiculo");
        }
    }
    @FXML
    public void limpiar_Informacion_Motocicleta(ActionEvent actionEvent) {
        espacio_Numero_Matricula.clear();
        espacio_Marca_Vehiculo.clear();
        espacio_Fecha_Publicacion.clear();
        espacio_Modelo_Motocicleta.clear();

    }
}
