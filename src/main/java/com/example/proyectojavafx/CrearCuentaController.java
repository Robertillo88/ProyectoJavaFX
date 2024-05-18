package com.example.proyectojavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;


import java.io.*;
import java.net.URL;
import java.security.Principal;
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
    @FXML
    Label lDinero;
    @FXML
    Slider sDinero;

    @FXML
    Label eUsuario;
    @FXML
    Label eContraseña;
    @FXML
    Label eDNI;
    @FXML
    Label eNombre;
    @FXML
    Label eApellido;
    @FXML
    Label eFechaNacimiento;
    @FXML
    Label eSexo;
    @FXML
    Label eCorreo;

    @FXML
    Button bCrear;


    String error = "**Debes completar este campo**";


    public void crearCuenta(ActionEvent e) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;

        String datos = "";
        String linea ="";
        String lineas[];
        boolean Error = false;

        eUsuario.setText("");
        eContraseña.setText("");
        eNombre.setText("");
        eApellido.setText("");
        eDNI.setText("");
        eFechaNacimiento.setText("");
        eSexo.setText("");
        eCorreo.setText(" ");

        try {
            fileReader = new FileReader(datosFile);
            bufferedReader = new BufferedReader(fileReader);

            do {
                linea = bufferedReader.readLine();
                if (linea != null) {
                    lineas = linea.split("--");
                    if (lineas[0].equals(tUsuario.getText())) {
                        eUsuario.setText("Este usuario ya existe");
                        Error = true;
                    }
                }
            }
            while (linea != null);
            bufferedReader.close();


            if (tUsuario.getText().length() < 2) {
                eUsuario.setText(error);
                Error = true;
            }
            if (tContraseña.getText().length() < 8) {
                eContraseña.setText("Contraseña debe tener al menos 8 caracteres");
                Error = true;
            }
            if (tNombre.getText().length() < 2) {
                eNombre.setText(error);
                Error = true;
            }
            if (tApellido.getText().length() < 2) {
                eApellido.setText(error);
                Error = true;
            }
            if (tDNI.getText().length() < 2) {
                eDNI.setText(error);
                Error = true;
            }
            if (tFechaNacimiento.getValue() == null) {
                eFechaNacimiento.setText(error);
                Error = true;
            }
            if (cbSexo.getValue() == null) {
                eSexo.setText(error);
                Error = true;
            }
            if (tCorreo.getText().length() < 2) {
                eCorreo.setText(error);
                Error = true;
            }
            if (!Error){
                fileWriter = new FileWriter(datosFile, true);
                bufferedWriter = new BufferedWriter(fileWriter);
                datos += tUsuario.getText() + "--" + tContraseña.getText() + "--" + tDNI.getText() + "--" + tNombre.getText() + "--" + tApellido.getText() + "--" + tFechaNacimiento.getValue().toString() + "--" + cbSexo.getValue() + "--" + tCorreo.getText() + "--" + sDinero.getValue();
                bufferedWriter.write(datos);
                bufferedWriter.newLine();
                bufferedWriter.close();
                switchFxml("PaginaPrincipal.fxml", bCrear);
            }

        } catch (IOException f) {
            System.out.println("Error al escribir en el archivo: " + f.getMessage());
        }
    }

    public void enseñarDinero( ) {
        int n = (int) sDinero.getValue();
        String dinero = Integer.toString(n);
        String palabra = "" + dinero.charAt(0) + dinero.charAt(1) + "," + dinero.charAt(2) + dinero.charAt(3) + dinero.charAt(4);
        lDinero.setText(palabra);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cbSexo.getItems().addAll("Hombre", "Mujer", "Otro");

    }
}
