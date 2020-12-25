package sample;

import com.coffeemachine.models.Person;
import com.coffeemachine.models.Technician;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;

public class Main extends Application {




    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Coffee Machine");
        primaryStage.setScene(new Scene(root, 1000, 800 ));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}


