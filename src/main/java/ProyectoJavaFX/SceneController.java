package ProyectoJavaFX;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {
    String datosFile = "C:\\Users\\super\\IdeaProjects\\ProyectoJavaFX\\src\\main\\java\\ProyectoJavaFX\\Datos.txt";

    public void switchFxml(String fxml, Button button) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxml));
        Stage stage = (Stage) button.getScene().getWindow();
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        scene.getStylesheets().add(getClass().getResource("/ProyectoJavaFX/CSS/Style.css").toExternalForm());
    }
}
