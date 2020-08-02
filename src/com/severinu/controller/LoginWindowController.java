package com.severinu.controller;

import com.severinu.EmailManager;
import com.severinu.view.ViewFactory;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginWindowController extends BaseController {

    @FXML
    private Button btnLogin;

    @FXML
    private TextField txtEmailAddress;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private Label lblError;

    public LoginWindowController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        super(emailManager, viewFactory, fxmlName);
    }

    @FXML
    void loginButtonAction() {
        System.out.println("login button was clicked as mad !");
    }

}