package com.example.proyectojavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.*;

public class LogicController {
    @FXML
    private Label bancoMadrid;

    @FXML
    private Button bCrear;

    @FXML
    private TextField tccNombreUsuario;
    @FXML
    private TextField tccContraseña;
    @FXML
    private TextField tDNI;
    @FXML
    private TextField tCorreo;



    private Stage stage;
    private Scene scene;
    private FXMLLoader fxmlLoader;
    String datosFile = "C:\\Users\\super\\IdeaProjects\\ProyectoJavaFX\\src\\main\\java\\com\\example\\proyectojavafx\\Datos.txt";




    public void crearCuenta(ActionEvent e) {
        try {
            FileWriter fileWriter = new FileWriter(datosFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String datos = "";
            datos += tccNombreUsuario.getText() + "-" + tccContraseña.getText() + "-" + tDNI.getText() + "-" + tCorreo.getText();
            bufferedWriter.write(datos);
            bufferedWriter.newLine();


            bufferedWriter.close();

        } catch (IOException f) {
            System.out.println("Error al escribir en el archivo: " + f.getMessage());
        }
    }


}