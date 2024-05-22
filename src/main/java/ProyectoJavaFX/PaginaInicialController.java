package ProyectoJavaFX;

import ProyectoJavaFX.SceneController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class PaginaInicialController extends SceneController {

    @FXML
    private Button bIniciarSesion;
    @FXML
    private Button bCrearCuenta;
    @FXML
    private Button bSkip;



    public void switchIniciarSesion(ActionEvent e) throws IOException {
        switchFxml("/ProyectoJavaFX/IniciarSesion/IniciarSesion.fxml", bIniciarSesion);
    }
    public void switchCrearCuenta(ActionEvent e) throws IOException {
        switchFxml("/ProyectoJavaFX/CrearCuenta.fxml" , bCrearCuenta);
    }
    public void skip(ActionEvent e) throws IOException {
        switchFxml("/ProyectoJavaFX/PaginaPrincipal/PaginaPrincipal.fxml", bSkip);
    }

}
