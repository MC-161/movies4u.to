module com.example.movies4u_to.gui {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires javafx.graphics;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.movies4u_to to javafx.fxml;
    exports com.example.movies4u_to;
    exports com.example.movies4u_to.controllers;
    opens com.example.movies4u_to.controllers to javafx.fxml;
}