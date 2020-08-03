module JavaFXEmailClient {
    requires javafx.web;
    requires javafx.graphics;
    requires javafx.fxml;
    requires java.base;
    requires javafx.controls;

    requires activation;
    requires java.mail;

    opens com.severinu;
    opens com.severinu.view;
    opens com.severinu.controller;
}