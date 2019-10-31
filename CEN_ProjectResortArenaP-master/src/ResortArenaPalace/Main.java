package ResortArenaPalace;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Project Resort Arena Palace.
 * Description: The current version of the software includes tabs for the future pages.
 * @author Legendary Coders
 */


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("LandingPage.fxml"));
        primaryStage.setTitle("Resort Arena Palace");
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
