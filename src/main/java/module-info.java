module org.devopstest.devopstest {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.devopstest.devopstest to javafx.fxml;
    exports org.devopstest.devopstest;
}