module com.example.filadeespera {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.filadeespera to javafx.fxml;
    exports com.example.filadeespera;
}