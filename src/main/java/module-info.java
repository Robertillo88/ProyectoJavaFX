module com.example.proyectojavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.datatransfer;



    opens com.example.proyectojavafx to javafx.fxml;
    exports com.example.proyectojavafx;
}