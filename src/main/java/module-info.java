module com.example.poligame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.poligame to javafx.fxml;
    exports com.example.poligame;
}