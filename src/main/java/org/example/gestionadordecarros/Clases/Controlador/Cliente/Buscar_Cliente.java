package org.example.gestionadordecarros.Clases.Controlador.Cliente;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.example.gestionadordecarros.Clases.Cliente;
import org.example.gestionadordecarros.Clases.GestionadorCarros;

import static org.example.gestionadordecarros.Clases.Controlador.Alert.showAlert;

public class Buscar_Cliente {
    @FXML
    public TextField espacio_Nombre_Cliente;
    @FXML
    public TextField espacio_Cedula_Cliente;
    @FXML
    public Button button_Buscar_Cliente;
    @FXML
    public Button button_Limpiar_Cliente;
    @FXML
    public TableView<Cliente> table_Cliente;
    @FXML
    public TableColumn<Cliente, String> columna_Nombre_Cliente;
    @FXML
    public TableColumn<Cliente, String> columna_Cedula_Cliente;

    public Buscar_Cliente(TextField espacio_Nombre_Cliente, TextField espacio_Cedula_Cliente, Button button_Buscar_Cliente, Button button_Limpiar_Cliente, TableView<Cliente> table_Cliente, TableColumn<Cliente, String> columna_Nombre_Cliente, TableColumn<Cliente, String> columna_Cedula_Cliente) {
        this.espacio_Nombre_Cliente = espacio_Nombre_Cliente;
        this.espacio_Cedula_Cliente = espacio_Cedula_Cliente;
        this.button_Buscar_Cliente = button_Buscar_Cliente;
        this.button_Limpiar_Cliente = button_Limpiar_Cliente;
        this.table_Cliente = table_Cliente;
        this.columna_Nombre_Cliente = columna_Nombre_Cliente;
        this.columna_Cedula_Cliente = columna_Cedula_Cliente;
    }

    public Buscar_Cliente() {
    }

    public void buscar_Cliente(ActionEvent actionEvent) {
        String nombre = espacio_Nombre_Cliente.getText();
        String cedula = espacio_Cedula_Cliente.getText();

        if (nombre == null || cedula == null || nombre.isEmpty() || cedula.isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Error", "Codigo and Titulo must not be empty");
            return;
        } else {
            for (Cliente cliente : GestionadorCarros.getClientes()) {
                if (cliente.getNombre().equals(nombre) && cliente.getCedula().equals(cedula)) {
                    if (table_Cliente != null) {
                        table_Cliente.getItems().add(cliente);
                    }
                    showAlert(Alert.AlertType.INFORMATION, "Success", "Cliente encontrado");
                }
            }
        }
    }

        public void limpiar_Cliente (ActionEvent actionEvent){
            espacio_Nombre_Cliente.clear();
            espacio_Cedula_Cliente.clear();
            table_Cliente.getItems().clear();
        }


    }

