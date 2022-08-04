module com.project2.twitter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.project2.twitter to javafx.fxml;
    exports com.project2.twitter;
}