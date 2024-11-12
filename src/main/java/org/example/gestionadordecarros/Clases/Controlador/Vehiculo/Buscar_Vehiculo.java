package org.example.gestionadordecarros.Clases.Controlador.Vehiculo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.example.gestionadordecarros.Clases.Cliente;
import org.example.gestionadordecarros.Clases.GestionadorCarros;
import org.example.gestionadordecarros.Clases.Vehiculo;

import java.time.LocalDate;

import static org.example.gestionadordecarros.Clases.Controlador.Alert.showAlert;

public class Buscar_Vehiculo {

    @FXML
    public TextField espacio_Matricula;
    @FXML
    public TextField espacio_Marca;
    @FXML
    public TextField espacio_Fecha_Publicacion;
    @FXML
    public Button button_Buscar;
    @FXML
    public Button button_Limpiar;
    @FXML
    public Button button_Eliminar;
    @FXML
    public TableView<Vehiculo> table_Vehiculos;
    public TableColumn<Vehiculo, String> column_Matricula;
    public TableColumn<Vehiculo, String> column_Marca;
    public TableColumn<Vehiculo, String> column_Fecha_Publicacion;
    public TableColumn<Vehiculo, String> column_Modelo;
    public TableColumn<Vehiculo, String> column_Tipo;

    public Buscar_Vehiculo(TextField espacio_Matricula, TextField espacio_Marca, TextField espacio_Fecha_Publicacion, Button button_Buscar, Button button_Limpiar, Button button_Eliminar) {
        this.espacio_Matricula = espacio_Matricula;
        this.espacio_Marca = espacio_Marca;
        this.espacio_Fecha_Publicacion = espacio_Fecha_Publicacion;
        this.button_Buscar = button_Buscar;
        this.button_Limpiar = button_Limpiar;
        this.button_Eliminar = button_Eliminar;
    }

    public Buscar_Vehiculo() {
    }

    public TextField getEspacio_Matricula() {
        return espacio_Matricula;
    }

    public void setEspacio_Matricula(TextField espacio_Matricula) {
        this.espacio_Matricula = espacio_Matricula;
    }

    public TextField getEspacio_Marca() {
        return espacio_Marca;
    }

    public void setEspacio_Marca(TextField espacio_Marca) {
        this.espacio_Marca = espacio_Marca;
    }

    public TextField getEspacio_Fecha_Publicacion() {
        return espacio_Fecha_Publicacion;
    }

    public void setEspacio_Fecha_Publicacion(TextField espacio_Fecha_Publicacion) {
        this.espacio_Fecha_Publicacion = espacio_Fecha_Publicacion;
    }

    public Button getButton_Buscar() {
        return button_Buscar;
    }

    public void setButton_Buscar(Button button_Buscar) {
        this.button_Buscar = button_Buscar;
    }

    public Button getButton_Limpiar() {
        return button_Limpiar;
    }

    public void setButton_Limpiar(Button button_Limpiar) {
        this.button_Limpiar = button_Limpiar;
    }

    public Button getButton_Eliminar() {
        return button_Eliminar;
    }

    public void setButton_Eliminar(Button button_Eliminar) {
        this.button_Eliminar = button_Eliminar;
    }

    public void buscar_Vehiculo() {
        String matricula = espacio_Matricula.getText();
        String marca = espacio_Marca.getText();
        LocalDate fecha = LocalDate.parse(espacio_Fecha_Publicacion.getText());

        if (matricula == null || marca == null || fecha == null || matricula.isEmpty() || marca.isEmpty() || fecha.toString().isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Error", "Matricula, Marca and Fecha must not be empty");
            return;
        } else {
            for (Vehiculo vehiculo : GestionadorCarros.getVehiculos()) {
                if (vehiculo.getNumeroMatricula().equals(matricula) && vehiculo.getMarca().equals(marca) && vehiculo.getFechaFabricacion().equals(fecha)) {
                    if (table_Vehiculos != null) {
                        table_Vehiculos.getItems().add(vehiculo);
                    }
                    showAlert(Alert.AlertType.INFORMATION, "Success", "Vehiculo encontrado");
                }
            }
        }

    }

    public void limpiar_Vehiculo(ActionEvent actionEvent) {
        espacio_Matricula.clear();
        espacio_Marca.clear();
        espacio_Fecha_Publicacion.clear();
        table_Vehiculos.getItems().clear();

    }

    public void eliminar_Vehiculo(ActionEvent actionEvent) {
        String matricula = espacio_Matricula.getText();
        String marca = espacio_Marca.getText();
        LocalDate fecha = LocalDate.parse(espacio_Fecha_Publicacion.getText());

        try {
            for (Vehiculo vehiculo : GestionadorCarros.getVehiculos()) {
                if (vehiculo.getNumeroMatricula().equals(matricula) && vehiculo.getMarca().equals(marca) && vehiculo.getFechaFabricacion().equals(fecha)) {
                    GestionadorCarros.getVehiculos().remove(vehiculo);
                    showAlert(Alert.AlertType.INFORMATION, "Success", "Vehiculo eliminado");
                }
            }
        } catch (NullPointerException e) {
            showAlert(Alert.AlertType.ERROR, "Error", "el vehiculo no existe");
        }


    }
}