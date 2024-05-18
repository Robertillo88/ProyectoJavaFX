package com.example.proyectojavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class PaginaPrincipalController extends SceneController{
    @FXML
    Button bGeneral;
    @FXML
    Button bTarjeta;
    @FXML
    Button bTienda;
    @FXML
    Button bHistorial;
    @FXML
    Pane pPaginaPrincipal;

    public void switchGeneral(ActionEvent e) throws IOException {
        pPaginaPrincipal.getChildren().clear();
        Pane pane = FXMLLoader.load(getClass().getResource("General.fxml"));
        pPaginaPrincipal.getChildren().add(pane);
    }

    public void switchTienda(ActionEvent e) throws IOException {
        pPaginaPrincipal.getChildren().clear();
        Pane pane = FXMLLoader.load(getClass().getResource("Tienda.fxml"));
        pPaginaPrincipal.getChildren().add(pane);
    }
}
