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
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class ManReport {

  @FXML
  private TableView<?> tablev_Report;

  @FXML
  private Label lbl_TitleReport;

  @FXML
  private Button btn_CancelR;

  @FXML
  private Button btn_SoldOut;

  @FXML
  private Button btn_BackRepToMan;

  @FXML
  void changeRepToManLog(ActionEvent event) throws IOException {
    Parent manSumParent = FXMLLoader.load(getClass().getResource("LandingPage.fxml"));
    Scene manSumScene = new Scene(manSumParent);

    Stage mSWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
    mSWindow.setScene(manSumScene);
    mSWindow.show();
  }

}
