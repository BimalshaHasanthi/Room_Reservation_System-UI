package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import jdk.nashorn.internal.objects.annotations.Property;
import model.Guest;
import view.tm.GuestTM;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;


public class AddNewGuestController {
    public JFXTextField txtFName;
    public JFXTextField txtLName;
    public JFXTextField txtNIC;
    public JFXTextField txtAddress;
    public JFXTextField txtGender;
    public JFXTextField txtMail;
    public JFXTextField txtNum;
    public TextField txtCheckIn;
    public TextField txtCheckOut;
    public TextField txtNoOfAdults;
    public TextField txtNoOfChild;
    public JFXTextField txtCountry;
    public TextField txtRoomNo;
    public TextField txtBed;
    public TextField txtMeal;



    public TableView tblGuestDetails;
    public TableColumn colFName;
    public TableColumn colLName;
    public TableColumn colNIC;
    public TableColumn colAddress;
    public TableColumn colCountry;
    public TableColumn colGender;
    public TableColumn colTP;
    public TableColumn colMail;
    public TableColumn colCheckIn;
    public TableColumn colCheckOut;
    public TableColumn colAdult;
    public TableColumn colBed;
    public TableColumn colChild;
    public TableColumn colMeal;
    public TableColumn colRoom;
    public TableColumn colEdit;


    static ArrayList<Guest> guestList = new ArrayList<Guest>();

    public void initialize(){
        colFName.setCellValueFactory(new PropertyValueFactory<>("fName"));
        colLName.setCellValueFactory(new PropertyValueFactory<>("lName"));
        colNIC.setCellValueFactory(new PropertyValueFactory<>("nic"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colCountry.setCellValueFactory(new PropertyValueFactory<>("country"));
        colGender.setCellValueFactory(new PropertyValueFactory<>("gender"));
        colMail.setCellValueFactory(new PropertyValueFactory<>("mail"));
        colTP.setCellValueFactory(new PropertyValueFactory<>("tp"));
        colCheckIn.setCellValueFactory(new PropertyValueFactory<>("checkIn"));
        colCheckOut.setCellValueFactory(new PropertyValueFactory<>("checkOut"));
        colAdult.setCellValueFactory(new PropertyValueFactory<>("adults"));
        colChild.setCellValueFactory(new PropertyValueFactory<>("child"));
        colRoom.setCellValueFactory(new PropertyValueFactory<>("room"));
        colBed.setCellValueFactory(new PropertyValueFactory<>("bed"));
        colMeal.setCellValueFactory(new PropertyValueFactory<>("meal"));
        colEdit.setCellValueFactory(new PropertyValueFactory<>("btn"));


    }


    public void saveOnAction(ActionEvent actionEvent) {
        Guest guest = new Guest(txtFName.getText(),txtLName.getText(),txtNIC.getText(),txtAddress.getText(),txtCountry.getText(),txtGender.getText(),txtNum.getText(),txtMail.getText(),txtCheckIn.getText(),txtCheckOut.getText(),txtNoOfAdults.getText(),txtNoOfChild.getText(),txtRoomNo.getText(),txtBed.getText(),txtMeal.getText());
        if(guestList.add(guest)){
            loadAllGuests();
            new Alert(Alert.AlertType.CONFIRMATION,"Saved...", ButtonType.CLOSE).show();

        }else{
            new Alert(Alert.AlertType.WARNING,"Try Again...", ButtonType.CLOSE).show();


        }




    }

    private void loadAllGuests(){
        ObservableList<GuestTM> tmObservableList = FXCollections.observableArrayList();
        for (Guest tempGuest:guestList
             ) {
            Button btn= new Button("Delete");
            tmObservableList.add(
                    new GuestTM(tempGuest.getFName(),tempGuest.getlName(),tempGuest.getNic(),tempGuest.getAddress(),tempGuest.getCountry(),tempGuest.getGender(),tempGuest.getTp(),tempGuest.getMail(),tempGuest.getCheckIn(),tempGuest.getCheckOut(),tempGuest.getAdults(),tempGuest.getChild(),tempGuest.getRoom(),tempGuest.getBed(),tempGuest.getMeal(),btn)

            );

            btn.setOnAction((e) -> {
                guestList.remove(tempGuest);
                loadAllGuests();

            });
        }

        tblGuestDetails.setItems(tmObservableList);
    }

   /*public void viewOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddNewGuest.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage)context.getScene().getWindow();
        window.setScene(new Scene(load));

    }*/
}
