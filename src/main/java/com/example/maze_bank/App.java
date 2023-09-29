package com.example.maze_bank;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        try{
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("FXML/Login.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setScene(scene);
            stage.show();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

 
}
