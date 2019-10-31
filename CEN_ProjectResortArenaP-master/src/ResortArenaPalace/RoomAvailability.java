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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class RoomAvailability {

    @FXML
    private AnchorPane lbl_RoomAv;

    @FXML
    private AnchorPane room1;

    @FXML
    private TextArea r1Details;

    @FXML
    private TextArea r3Details;

    @FXML
    private Label room3;

    @FXML
    private Label room2;

    @FXML
    private TextArea r2Details;

    @FXML
    private Label room4;

    @FXML
    private Label room;

    @FXML
    private Button btn_Select1rm;

    @FXML
    private Button btn_GoHomeRA;

    @FXML
    private Button btn_Select3rm;

    @FXML
    private Button btn_Select2rm;

    @FXML
    private TextArea r4Details;

    @FXML
    private Button btn_Select4rm;


    @FXML
    void changeR1toPay(ActionEvent event) throws IOException {
        Parent paymentAccountParent = FXMLLoader.load(getClass().getResource("PaymentAccount.fxml"));
        Scene roomAvScene = new Scene(paymentAccountParent);

        Stage payWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
        payWindow.setScene(roomAvScene);
        payWindow.show();
    }

     @FXML
    void changeRAToHome(ActionEvent event) throws IOException {
        Parent roomAvHParent = FXMLLoader.load(getClass().getResource("LandingPage.fxml"));
        Scene homePScene = new Scene(roomAvHParent);

        Stage homePWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
        homePWindow.setScene(homePScene);
        homePWindow.show();
    }

}
