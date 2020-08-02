package com.severinu.controller;

import com.severinu.EmailManager;
import com.severinu.view.ViewFactory;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeView;
import javafx.scene.web.WebView;

public class MainWindowController extends BaseController {

    @FXML
    private MenuItem menuItemOptions;

    @FXML
    private TreeView<?> treeViewEmails;

    @FXML
    private TableView<?> tblViewEmailsView;

    @FXML
    private WebView webViewEmail;

    public MainWindowController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        super(emailManager, viewFactory, fxmlName);
    }

    @FXML
    void optionsAction() {

    }

}
