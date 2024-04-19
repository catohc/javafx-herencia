module com.example.herencia {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.herencia to javafx.fxml;
    exports com.example.herencia;
    opens com.example.herencia.Controllers to javafx.fxml;
    exports com.example.herencia.Controllers;
    opens com.example.herencia.Models to javafx.base;
    exports com.example.herencia.Models;
}