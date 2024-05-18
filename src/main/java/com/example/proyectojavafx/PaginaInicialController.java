package com.example.proyectojavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class PaginaInicialController extends SceneController{

    @FXML
    private Button bIniciarSesion;
    @FXML
    private Button bCrearCuenta;
    @FXML
    private Button bSkip;



    public void switchIniciarSesion(ActionEvent e) throws IOException {
        switchFxml("IniciarSesion.fxml", bIniciarSesion);
    }
    public void switchCrearCuenta(ActionEvent e) throws IOException {
        switchFxml("CrearCuenta.fxml" , bCrearCuenta);
    }
    public void skip(ActionEvent e) throws IOException {
        switchFxml("PaginaPrincipal.fxml", bSkip);
    }

}
