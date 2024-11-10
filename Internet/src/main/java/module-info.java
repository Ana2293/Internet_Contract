module com.example.internet {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.example.internet to javafx.fxml;
    exports com.example.internet;
}