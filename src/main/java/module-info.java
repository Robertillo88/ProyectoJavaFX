module com.example.proyectojavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.datatransfer;



    opens ProyectoJavaFX to javafx.fxml;
    exports ProyectoJavaFX;
    exports ProyectoJavaFX.PaginaPrincipal;
    opens ProyectoJavaFX.PaginaPrincipal to javafx.fxml;
}