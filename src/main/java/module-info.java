module com.example.rotationseksempel {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rotationseksempel to javafx.fxml;
    exports com.example.rotationseksempel;
}