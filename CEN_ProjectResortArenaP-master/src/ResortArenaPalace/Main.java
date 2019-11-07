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
 * @author Legendary Coders.
 *
 * TEAM 7.
 */

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("LandingPage.fxml"));
        primaryStage.setTitle("Resort Arena Palace");
        primaryStage.setScene(new Scene(root, 1000, 600));
        primaryStage.show();
        testDatabaseConnection();
    }

    public static void main(String[] args) {
        launch(args);
    }

    /*Check line 48 and 25 there is an error */

    // Database Connection Test

    private final String JDBC_DRIVER = "org.h2.Driver";
    private final String DB_URL = "jdbc:h2:./res/arenadb";
    private final String USER = "";
    private final String PASS = "";
    private static Connection conn;

    private void testDatabaseConnection(){
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




