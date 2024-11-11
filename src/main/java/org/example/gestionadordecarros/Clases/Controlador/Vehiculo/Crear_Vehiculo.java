package org.example.gestionadordecarros.Clases.Controlador.Vehiculo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import org.example.gestionadordecarros.Clases.Cliente;

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
    public TableView<Cliente> table_Informacion_Vehiculo;
    @FXML
    public TableColumn<Cliente, String> column_Matricula;
    @FXML
    public TableColumn<Cliente, String> column_Marca;
    @FXML
    public TableColumn<Cliente, String> column_Fecha;
    @FXML
    public TableColumn<Cliente, String> column_Modelo;
    @FXML
    public TableColumn<Cliente, String> column_Tipo;

    public Crear_Vehiculo() {
    }

    public void crear_Vehiculo() {
    }

    public void limpiar_Informacion_Vehiculo() {
        espacio_Numero_Matricula.clear();
        espacio_Marca_Vehiculo.clear();
        espacio_Fecha_Publicacion.clear();
        espacio_Modelo_Vehiculo.clear();
        espacio_Tipo_Vehiculo.clear();
    }




}

