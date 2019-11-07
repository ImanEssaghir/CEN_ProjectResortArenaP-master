package ResortArenaPalace;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.stage.Stage;

public class ConfirmMessage {
  @FXML
  private DialogPane dialog_p;

  @FXML
  private Button OkayBtn;

  @FXML
  void userDetails(ActionEvent event) throws IOException {
    Parent userAccountParent = FXMLLoader.load(getClass().getResource("UserReservationDetails.fxml"));
    Scene roomAvScene = new Scene(userAccountParent);

    Stage uAWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
    uAWindow.setScene(roomAvScene);
    uAWindow.show();

  }

}




