package ResortArenaPalace;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ManReport {

  @FXML
  private TableView<?> tablev_Report;

  @FXML private TableColumn<?, ?> col_Roomnum;

  @FXML private TableColumn<?, ?> col_FirstName;

  @FXML private TableColumn<?, ?> col_LastName;

  @FXML private TableColumn<?, ?> col_NPeople;

  @FXML private TableColumn<?, ?> col_Nrooms;

  @FXML private TableColumn<?, ?> col_CheckIn;

  @FXML private TableColumn<?, ?> col_CheckOut;

  @FXML private TableColumn<?, ?> col_RType;

  @FXML private TableColumn<?, ?> col_Email;

  @FXML
  private Label lbl_TitleReport;

  @FXML
  private Button btn_CancelR;

  @FXML
  private Button btn_SoldOut;

  @FXML
  private Button btn_BackRepToMan;

  @FXML
  private TextField txt_roomNumb;

  @FXML
  private TextField txt_Fname;

  @FXML
  private TextField txt_Lname;

  @FXML
  private TextField txt_Npeople;

  @FXML
  private TextField txt_nRooms;

  @FXML
  private TextField txt_CheckIn;

  @FXML
  private TextField txt_CheckOut;

  @FXML
  private TextField txt_RoomType;

  @FXML
  private TextField txt_Email;

  @FXML
  private Button btn_AddGuest;


  @FXML
  void changeRepToManLog(ActionEvent event) throws IOException {
    Parent manSumParent = FXMLLoader.load(getClass().getResource("LandingPage.fxml"));
    Scene manSumScene = new Scene(manSumParent);

    Stage mSWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
    mSWindow.setScene(manSumScene);
    mSWindow.show();
  }

  //Method to add a new guest to the database
  @FXML
  void addGuest(ActionEvent event) {}

  //Method to cancel a selected reservation from the manager report
  @FXML
  void cancelReservation(ActionEvent event) {

  }

}
