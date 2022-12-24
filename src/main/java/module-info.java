module com.example.sem3_project {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires javafx.web;


    opens com.example.sem3_project to javafx.fxml;
    exports com.example.sem3_project;
}