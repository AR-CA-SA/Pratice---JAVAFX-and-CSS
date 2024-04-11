module com.example.guicoffeshop {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.guicoffeshop to javafx.fxml;
    exports com.example.guicoffeshop;


}