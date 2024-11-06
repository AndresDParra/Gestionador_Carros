package org.example.gestionadordecarros.Clases.Controlador.Empleado;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Buscar_Empleado {
    @FXML
    public TextField espacio_Nombre_Empleado;
    @FXML
    public TextField espacio_Cedula_Empleado;
    @FXML
    public Button Button_Para_Buscar_Empleado;
    @FXML
    public TextArea espacio_Informacion_Empleado;

    public Buscar_Empleado(TextField espacio_Nombre_Empleado, TextField espacio_Cedula_Empleado, Button button_Para_Buscar_Empleado, TextArea espacio_Informacion_Empleado) {
        this.espacio_Nombre_Empleado = espacio_Nombre_Empleado;
        this.espacio_Cedula_Empleado = espacio_Cedula_Empleado;
        Button_Para_Buscar_Empleado = button_Para_Buscar_Empleado;
        this.espacio_Informacion_Empleado = espacio_Informacion_Empleado;
    }

    public TextField getEspacio_Nombre_Empleado() {
        return espacio_Nombre_Empleado;
    }

    public void setEspacio_Nombre_Empleado(TextField espacio_Nombre_Empleado) {
        this.espacio_Nombre_Empleado = espacio_Nombre_Empleado;
    }

    public TextField getEspacio_Cedula_Empleado() {
        return espacio_Cedula_Empleado;
    }

    public void setEspacio_Cedula_Empleado(TextField espacio_Cedula_Empleado) {
        this.espacio_Cedula_Empleado = espacio_Cedula_Empleado;
    }

    public Button getButton_Para_Buscar_Empleado() {
        return Button_Para_Buscar_Empleado;
    }

    public void setButton_Para_Buscar_Empleado(Button button_Para_Buscar_Empleado) {
        Button_Para_Buscar_Empleado = button_Para_Buscar_Empleado;
    }

    public TextArea getEspacio_Informacion_Empleado() {
        return espacio_Informacion_Empleado;
    }

    public void setEspacio_Informacion_Empleado(TextArea espacio_Informacion_Empleado) {
        this.espacio_Informacion_Empleado = espacio_Informacion_Empleado;
    }

    public void buscar_Empleado(ActionEvent actionEvent) {

    }
}
