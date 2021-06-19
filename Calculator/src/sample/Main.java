package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        try {
            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("Calculator");
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
