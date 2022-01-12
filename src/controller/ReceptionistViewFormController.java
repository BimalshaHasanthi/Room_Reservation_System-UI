package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ReceptionistViewFormController {
    public AnchorPane receptionContext;
    public AnchorPane context;

   public void openLogin(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ConfermationForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage)receptionContext.getScene().getWindow();
        window.setScene(new Scene(load));

    }

    public void openAddNewGuest(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddNewGuest.fxml");
        Parent load = FXMLLoader.load(resource);
        context.getChildren().clear();
        context.getChildren().add(load);

    }


    public void openPackage(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/HotelPackage.fxml");
        Parent load = FXMLLoader.load(resource);
        context.getChildren().clear();
        context.getChildren().add(load);
    }


    public void openRoom(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/RoomDetail.fxml");
        Parent load = FXMLLoader.load(resource);
        context.getChildren().clear();
        context.getChildren().add(load);


    }

    public void openMealOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/MealForm.fxml");
        Parent load = FXMLLoader.load(resource);
        context.getChildren().clear();
        context.getChildren().add(load);
    }

    public void openGuestDetails(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/GuestDetail.fxml");
        Parent load = FXMLLoader.load(resource);
        context.getChildren().clear();
        context.getChildren().add(load);

    }
}
