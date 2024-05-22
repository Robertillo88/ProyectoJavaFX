package ProyectoJavaFX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/ProyectoJavaFX/PaginaInicial.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        scene.getStylesheets().add(getClass().getResource("/ProyectoJavaFX/CSS/Style.css").toExternalForm());
    }

    public static void main(String[] args) {
        launch();
    }
}