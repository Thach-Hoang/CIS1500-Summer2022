module com.example.fakefinalproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fakefinalproject to javafx.fxml;
    exports com.example.fakefinalproject;
}