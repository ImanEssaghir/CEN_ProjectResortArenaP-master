package ResortArenaPalace;

    import java.io.IOException;
    import javafx.collections.FXCollections;
    import javafx.collections.ObservableList;
    import javafx.event.ActionEvent;
    import javafx.fxml.FXML;
    import javafx.fxml.FXMLLoader;
    import javafx.scene.Node;
    import javafx.scene.Parent;
    import javafx.scene.Scene;
    import javafx.scene.control.Button;
    import javafx.scene.control.Label;
    import javafx.scene.control.Tab;
    import javafx.stage.Stage;
    import javafx.scene.control.ComboBox;
    import javafx.scene.control.DatePicker;
    import javafx.scene.image.ImageView;
    import javafx.scene.layout.AnchorPane;


public class Controller {

  @FXML
  private Label lbl_TitleHome;

  @FXML
  private Tab tab_home;

  @FXML
  private Button btn_ckAv;

  @FXML
  private Tab tab_wellness;

  @FXML
  private Label wellLabel;

  @FXML
  private Label gymLable;

  @FXML
  private Label yogaLabel;

  @FXML
  private Label spaLabel;

  @FXML
  private Tab tab_events;


  @FXML
  private Label eventLabel;

  @FXML
  private Label confrenceLable;

  @FXML
  private Label celebrationLabel;

  @FXML
  private Tab tab_restaurant;

  @FXML
  private Label resnameLable;

  @FXML
  private DatePicker checkin_pick;

  @FXML
  private DatePicker checkout_pick;

  @FXML
  private Button btnSignin;

  @FXML
  private Button btn_ManagerHome;

  @FXML
  private ComboBox<String> noguests_pick;

  @FXML
  private ComboBox<String> room_pick;

  @FXML
  private ImageView resortPic;

  @FXML
  private AnchorPane wellnessLabel;

  @FXML
  private Button ygaBtn;

  @FXML
  private Button gymBtn;

  @FXML
  private Button spaBtn;

  @FXML
  private ImageView yogaPic;

  @FXML
  private ImageView gymPic;

  @FXML
  private Button weddingBtn;

  @FXML
  private Button celebrationBtn;

  @FXML
  private ImageView weddPic;

  @FXML
  private ImageView celbPic;

  @FXML
  private ImageView conferencePic;

  @FXML
  private AnchorPane dessertBtn;

  @FXML
  private ImageView beveragePic;

  @FXML
  private ImageView foodPic;

  @FXML
  private ImageView dessertPic;

  @FXML
  private Button foodBtn;


  //HOMEPAGE====================================================================================
  //Arraylist for the comboBox to pick the number of rooms
  private ObservableList<String> norooms = FXCollections.observableArrayList("1 room", "2 rooms",
      "3 rooms", "4 rooms", "5 rooms", "6 rooms", "7 rooms", "8 rooms", "9 rooms", "10 rooms");

  //Arraylist for the comboBox to pick the number of guests
  private ObservableList<String> noguest = FXCollections.observableArrayList("1", "2",
      "3", "4", "5", "6", "7", "8", "9", "10");

  /*Method to populate the number of rooms and guests inside the combobox */
  public void initialize(){
    room_pick.setItems(norooms);//sets the items in the ComboBox
    room_pick.setEditable(true);//Allows the user edit
    room_pick.getSelectionModel().selectFirst();//Sets a default value in the ComboBox

    //Guests
    noguests_pick.setItems(noguest);//sets the items in the ComboBox
    noguests_pick.setEditable(true);//Allows the user edit
    noguests_pick.getSelectionModel().selectFirst();//Sets a default value in the ComboBox
  }

  @FXML
  void changeHomeToManLog(ActionEvent event) throws IOException {
    Parent manLoginParent = FXMLLoader.load(getClass().getResource("ManagerLogin.fxml"));
    Scene managerScene = new Scene(manLoginParent);

    Stage mLWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
    mLWindow.setScene(managerScene);
    mLWindow.show();
  }

  /*Method that changes the scene from "home scene" to "check availability scene" when the user
  presses the check availability button in the home scene */
  public void changeScreenRoomAv(ActionEvent actionEvent) throws IOException {
    Parent roomAvailableParent = FXMLLoader.load(getClass().getResource("RoomAvailability.fxml"));
    Scene roomAvScene = new Scene(roomAvailableParent);

    Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
    window.setScene(roomAvScene);
    window.show();
  }

  @FXML
  void changeScreenUserAccount(ActionEvent actionEvent) throws IOException {
    Parent userAccountParent = FXMLLoader.load(getClass().getResource("UserAccount.fxml"));
    Scene roomAvScene = new Scene(userAccountParent);

    Stage uAWindow = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
    uAWindow.setScene(roomAvScene);
    uAWindow.show();
  }
  //==============================================================================================
}
