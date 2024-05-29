module com.example.compartirinformacionventanas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.compartirinformacionventanas to javafx.fxml;
    exports com.example.compartirinformacionventanas;
}