package com.severinu.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginWindowController {

    @FXML
    private Button btnLogin;

    @FXML
    private TextField txtEmailAddress;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private Label lblError;

    @FXML
    void loginButtonAction() {
        System.out.println("login button was clicked as mad !");
    }

}