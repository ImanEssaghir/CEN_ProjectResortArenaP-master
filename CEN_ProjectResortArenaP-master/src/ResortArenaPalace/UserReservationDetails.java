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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class UserReservationDetails {

  @FXML
  private Label lbl_TitleReservation;

  @FXML
  private TextArea txtA_ReservationDet;

  @FXML
  private Button btn_CancelR;

  @FXML
  private Button btn_SignOut;

  @FXML
  void changeResDetToHome(ActionEvent event) throws IOException {
    Parent resDetParent = FXMLLoader.load(getClass().getResource("LandingPage.fxml"));
    Scene ReservationScene = new Scene(resDetParent);

    Stage rDWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
    rDWindow.setScene(ReservationScene);
    rDWindow.show();
  }

}
