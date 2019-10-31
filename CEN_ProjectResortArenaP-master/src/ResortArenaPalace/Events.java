package ResortArenaPalace;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import java.io.IOException;

public class Events {

    @FXML
    private Button eventButton;

    public void openResaurant(ActionEvent actionEvent) throws IOException {
        Parent restaurantParent = FXMLLoader.load(getClass().getResource("Restaurant.fxml"));
        Scene restaurant = new Scene(restaurantParent);

        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(restaurant);
        window.show();

    }


}

