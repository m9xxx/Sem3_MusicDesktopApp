module com.example.sem3_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sem3_project to javafx.fxml;
    exports com.example.sem3_project;
}