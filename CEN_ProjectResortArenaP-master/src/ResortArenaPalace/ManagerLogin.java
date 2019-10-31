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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ManagerLogin {

  @FXML
  private Label lbl_ManagerLog;

  @FXML
  private Label lbl_MUName;

  @FXML
  private TextField txtField_MUName;

  @FXML
  private Label lbl_MUPassword;

  @FXML
  private PasswordField passfld_MUPassword;

  @FXML
  private Button btn_ManagerSignIn;


  @FXML
  void changeManToReport(ActionEvent event) throws IOException {
    Parent manReportParent = FXMLLoader.load(getClass().getResource("ManReport.fxml"));
    Scene mReportScene = new Scene(manReportParent);

    Stage mRepWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
    mRepWindow.setScene(mReportScene);
    mRepWindow.show();
  }

}
