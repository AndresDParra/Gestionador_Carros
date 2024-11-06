package org.example.gestionadordecarros.Clases.Controlador;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.example.gestionadordecarros.Clases.GestionadorCarros;
import org.example.gestionadordecarros.Clases.Usuario;

import java.io.IOException;
import java.util.Objects;

import static org.example.gestionadordecarros.Clases.Controlador.Alert.showAlert;

public class Login {
    @FXML
    public Button Button_Sign_in;
    @FXML
    private TextField espacio_Usuario;
    @FXML
    private TextField espacio_Contrasena;

    // Public no-argument constructor
    public Login() {
    }

    public Login(TextField espacio_Usuario, TextField espacio_Contrasena) {
        this.espacio_Usuario = espacio_Usuario;
        this.espacio_Contrasena = espacio_Contrasena;
    }

    public TextField getEspacio_Usuario() {
        return espacio_Usuario;
    }

    public void setEspacio_Usuario(TextField espacio_Usuario) {
        this.espacio_Usuario = espacio_Usuario;
    }

    public TextField getEspacio_Contrasena() {
        return espacio_Contrasena;
    }

    public void setEspacio_Contraseña(TextField espacio_Contrasena) {
        this.espacio_Contrasena = espacio_Contrasena;
    }

    public void iniciarSesion() throws IOException {
        String usuario = espacio_Usuario.getText();
        String contrasena = espacio_Contrasena.getText();

        if (usuario.equals(Usuario.getSampleUsuario().getNombreUsuario()) && contrasena.equals(Usuario.getSampleUsuario().getContrasena())) {
            showAlert(javafx.scene.control.Alert.AlertType.INFORMATION, "Inicio de sesión", "Inicio de sesión exitoso");
            Stage stageLogin = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader();
            Parent paginaOpcionesVehiculo = fxmlLoader.load(Objects.requireNonNull(getClass().getResource("/org/example/gestionadordecarros/Pagina_Principal.fxml")));
            Scene scene = new Scene(paginaOpcionesVehiculo, 600, 400);
            stageLogin.setScene(scene);
            stageLogin.show();
        } else {
            showAlert(javafx.scene.control.Alert.AlertType.ERROR, "Inicio de sesión", "Usuario o contraseña incorrectos");
        }
    }
}