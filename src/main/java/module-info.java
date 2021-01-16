module edu.espol.proyecto2parcial {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens edu.espol.proyecto2parcial to javafx.fxml;
    exports edu.espol.proyecto2parcial;
}