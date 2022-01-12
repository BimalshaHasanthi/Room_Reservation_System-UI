package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AdminViewFormController {
    public AnchorPane adminContext;
    public AnchorPane context;
    public AnchorPane loadContext;

    public void openLogin(ActionEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/Confermation.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage)adminContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void roomEditOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/EditRoom.fxml");
        Parent load = FXMLLoader.load(resource);
        context.getChildren().clear();
        context.getChildren().add(load);

    }

    public void mealEditOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/MealEditForm.fxml");
        Parent load = FXMLLoader.load(resource);
        context.getChildren().clear();
        context.getChildren().add(load);
    }

    public void packageEditOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/PackageEdit.fxml");
        Parent load = FXMLLoader.load(resource);
        context.getChildren().clear();
        context.getChildren().add(load);
    }

    public void reportOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/IncomeReport.fxml");
        Parent load = FXMLLoader.load(resource);
        context.getChildren().clear();
        context.getChildren().add(load);
    }
}
