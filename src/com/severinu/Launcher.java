package com.severinu;
// --module-path C:\javafx-sdk\lib --add-modules javafx.controls,javafx.fxml,javafx.graphics,javafx.web
import com.severinu.view.ViewFactory;
import javafx.application.Application;
import javafx.stage.Stage;

public class Launcher extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        ViewFactory viewFactory = new ViewFactory(new EmailManager());
        viewFactory.showLoginWindow();
    }
}
