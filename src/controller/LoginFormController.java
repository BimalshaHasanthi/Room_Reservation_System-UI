package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class LoginFormController {
    public JFXPasswordField password;
    public AnchorPane loginContext;
    public JFXTextField txtUserName;
    public JFXButton loginButton;

    public void openView(ActionEvent actionEvent) throws IOException {
        if (txtUserName.getText().toString().equals("admin") || password.getText().toString().equals("admin")){
            URL resource = getClass().getResource("../view/AdminViewForm.fxml");
            Parent load = FXMLLoader.load(resource);
            Stage window = (Stage) loginContext.getScene().getWindow();
            window.setScene(new Scene(load));

        }else if (txtUserName.getText().toString().equals("recep") || password.getText().toString().equals("recep")){
            URL resource = getClass().getResource("../view/ReceptionistViewForm.fxml");
            Parent load = FXMLLoader.load(resource);
            Stage window = (Stage) loginContext.getScene().getWindow();
            window.setScene(new Scene(load));

        }else {
            URL resource = getClass().getResource("../view/LoginForm.fxml");
            Parent load = FXMLLoader.load(resource);
            Stage window = (Stage) loginContext.getScene().getWindow();
            window.setScene(new Scene(load));

        }

    }

    public void nextOnAction(ActionEvent actionEvent) {
        password.requestFocus();
    }

    public void loginOnAction(ActionEvent actionEvent) {
        loginButton.requestFocus();
    }
}

