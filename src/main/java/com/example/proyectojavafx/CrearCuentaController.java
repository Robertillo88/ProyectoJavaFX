package com.example.proyectojavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CrearCuentaController extends SceneController{
    @FXML
    TextField tUsuario;
    @FXML
    TextField tContraseña;
    @FXML
    TextField tDNI;
    @FXML
    TextField tCorreo;
    @FXML
    TextField tFechaNacimiento;
    @FXML
    TextField tNombre;
    @FXML
    TextField tApellido;

    public void crearCuenta(ActionEvent e) {
        try {
            FileWriter fileWriter = new FileWriter(datosFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String datos = "";
            Label tccNombreUsuario;
            datos += tUsuario.getText() + "-" + tContraseña.getText() + "-" + tDNI.getText() + "-" + tCorreo.getText();
            bufferedWriter.write(datos);
            bufferedWriter.newLine();


            bufferedWriter.close();

        } catch (IOException f) {
            System.out.println("Error al escribir en el archivo: " + f.getMessage());
        }
    }
}
