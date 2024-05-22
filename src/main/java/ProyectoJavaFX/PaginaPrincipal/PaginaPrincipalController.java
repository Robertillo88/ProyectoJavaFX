package ProyectoJavaFX.PaginaPrincipal;

import ProyectoJavaFX.SceneController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class PaginaPrincipalController extends SceneController {
    @FXML
    Button bGeneral;
    @FXML
    Button bTarjeta;
    @FXML
    Button bTienda;
    @FXML
    Button bPropiedades;
    @FXML
    Button bHistorial;
    @FXML
    Button bCuenta;

    @FXML
    Pane pPaginaPrincipal;

    public void switchGeneral(ActionEvent e) throws IOException {
        pPaginaPrincipal.getChildren().clear();
        Pane pane = FXMLLoader.load(getClass().getResource("/ProyectoJavaFX/PaginaPrincipal/General.fxml"));
        pPaginaPrincipal.getChildren().add(pane);
    }

    public void switchTienda(ActionEvent e) throws IOException {
        pPaginaPrincipal.getChildren().clear();
        Pane pane = FXMLLoader.load(getClass().getResource("/ProyectoJavaFX/PaginaPrincipal/Tienda.fxml"));
        pPaginaPrincipal.getChildren().add(pane);
    }

    public void switchHistorial(ActionEvent e) throws IOException {
        pPaginaPrincipal.getChildren().clear();
        Pane pane = FXMLLoader.load(getClass().getResource("/ProyectoJavaFX/PaginaPrincipal/Historial.fxml"));
        pPaginaPrincipal.getChildren().add(pane);
    }

    public void switchTarjetas(ActionEvent e ) throws IOException {
        pPaginaPrincipal.getChildren().clear();
        Pane pane = FXMLLoader.load(getClass().getResource("/ProyectoJavaFX/PaginaPrincipal/TarjetasCredito.fxml"));
        pPaginaPrincipal.getChildren().add(pane);
    }

    public void switchPropiedades(ActionEvent e) throws IOException {
        pPaginaPrincipal.getChildren().clear();
        Pane pane = FXMLLoader.load(getClass().getResource("/ProyectoJavaFX/PaginaPrincipal/Propiedades.fxml"));
        pPaginaPrincipal.getChildren().add(pane);
    }
    public void switchCuenta(ActionEvent e) throws IOException {
        pPaginaPrincipal.getChildren().clear();
        Pane pane = FXMLLoader.load(getClass().getResource("/ProyectoJavaFX/PaginaPrincipal/Cuenta.fxml"));
        pPaginaPrincipal.getChildren().add(pane);
    }
}
