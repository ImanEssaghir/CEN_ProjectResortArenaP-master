package ResortArenaPalace;
import java.sql.DriverManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.sql.Connection;

/**
 * Project Resort Arena Palace.
 * Team 7.
 * Description: The current version of the software includes tabs for the future pages.
 * @author Legendary Coders.
 */

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("LandingPage.fxml"));
        primaryStage.setTitle("Resort Arena Palace");
        primaryStage.setScene(new Scene(root, 1000, 800));
        primaryStage.show();
        testDatabaseConnection();
    }

    public static void main(String[] args) {
        launch(args);
    }







    // Database Connection Test

    final String JDBC_DRIVER = "org.h2.Driver";
    final String DB_URL = "jdbc:h2:./res/test";
    final String USER = "";
    final String PASS = "";
    private static Connection conn;

    public void testDatabaseConnection(){
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Database Connected!");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Database Failed to Connect!");
        }
    }



}




