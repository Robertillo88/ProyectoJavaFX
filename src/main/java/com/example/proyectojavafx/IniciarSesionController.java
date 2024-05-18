package com.example.proyectojavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class IniciarSesionController extends SceneController{
    @FXML
    private Button bIniciar;
    @FXML
    private Button bAtras;
    @FXML
    private Button bTerminos;
    @FXML
    private Button bCerrar;

    @FXML
    private TextField tUsuario;
    @FXML
    private TextField tContraseña;

    @FXML
    private Label lMessage;
    @FXML
    private RadioButton rAcepto;

    @FXML
    private RadioButton rNoAcepto;
    @FXML
    private Pane pThirdPane;



    public void Terminos(ActionEvent e) throws IOException {
        switchFxml("Terminos.fxml", bTerminos);
    }
    public void cerrar(ActionEvent e) throws IOException {
        switchFxml("IniciarSesion.fxml", bCerrar);
    }
    public void atras(ActionEvent e) throws IOException {

    }
    public void iniciarSesion(ActionEvent e) {
        FileReader fileReader;
        BufferedReader bufferedReader;

        try {

            fileReader = new FileReader(datosFile);
            bufferedReader = new BufferedReader(fileReader);

            boolean existeUsuario;
            boolean contraseñaCorrecta;

            String linea;
            String datos[];
            String usuario;
            String contraseña;
            do {
                contraseñaCorrecta = false;
                existeUsuario = false;
                linea = bufferedReader.readLine();
                if (linea != null) {
                    System.out.println(linea);
                    datos = linea.split("--");
                    usuario = tUsuario.getText();
                    contraseña = tContraseña.getText();
                    if (usuario.equals(datos[0]) ) {
                        existeUsuario = true;
                        if (contraseña.equals(datos[1]) ) {
                            contraseñaCorrecta = true;
                        }
                        break;
                    }

                } else {
                    System.out.println("Archivo vacio");;
                }

            }
            while (linea != null);

            if (!existeUsuario) {
                lMessage.setText("Usuario no existe");
            } else if (!contraseñaCorrecta)  {
                lMessage.setText("Contraseña o Usuario incorrecto");
            } else if (rNoAcepto.isSelected()) {
                lMessage.setText("Debes aceptar los terminos y condiciones");
            } else if (!rAcepto.isSelected()) {
                lMessage.setText("Debes aceptar los terminos y condiciones");
            } else {
                switchFxml("PaginaPrincipal.fxml", bIniciar);
            }
            bufferedReader.close();
        } catch (IOException f) {
            System.out.println("Error al leer el archivo: " + f.getMessage());
        }
    }
}
