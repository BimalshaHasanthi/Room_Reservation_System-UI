package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ConfermationController {
    public AnchorPane confermContext;

    public void openLogin(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/LoginForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage)confermContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void cancelOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminViewForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage)confermContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
