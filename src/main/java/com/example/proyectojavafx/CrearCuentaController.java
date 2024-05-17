package com.example.proyectojavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CrearCuentaController extends SceneController implements Initializable {
    @FXML
    TextField tUsuario;
    @FXML
    TextField tContraseña;
    @FXML
    TextField tDNI;
    @FXML
    TextField tCorreo;
    @FXML
    DatePicker tFechaNacimiento;
    @FXML
    TextField tNombre;
    @FXML
    TextField tApellido;
    @FXML
    ChoiceBox<String>cbSexo;


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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cbSexo.getItems().addAll("Hombre", "Mujer", "Otro");

    }
}
