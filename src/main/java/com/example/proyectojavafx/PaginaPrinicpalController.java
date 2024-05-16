package com.example.proyectojavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class PaginaPrinicpalController extends SceneController{

    @FXML
    private Button bIniciarSesion;
    @FXML
    private Button bCrearCuenta;

    public void switchIniciarSesion(ActionEvent e) throws IOException {
        switchFxml("IniciarSesion.fxml", bIniciarSesion);
    }
    public void switchCrearCuenta(ActionEvent e) throws IOException {
        switchFxml("CrearCuenta.fxml" , bCrearCuenta);
    }


}
