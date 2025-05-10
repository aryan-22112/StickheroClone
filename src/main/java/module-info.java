module com.example.demo2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.testng;
    requires org.junit.jupiter.api;
    requires javafx.media;


    opens com.example.demo2 to javafx.fxml;
    exports com.example.demo2;
}