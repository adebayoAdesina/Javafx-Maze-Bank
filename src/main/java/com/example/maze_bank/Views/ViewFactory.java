package com.example.maze_bank.Views;

import com.example.maze_bank.App;
import com.example.maze_bank.Controllers.Client.ClientController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewFactory {
    private AnchorPane dashboardView;

    public AnchorPane getDashboardView() {
        if(dashboardView == null) {
            try{
                dashboardView = new FXMLLoader(App.class.getResource("/FXML/Client/dashboard.fxml")).load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        return dashboardView;
    }

    public void showLogInWindow() {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("FXML/Login.fxml"));
        createStage(fxmlLoader);
    }

    private void createStage(FXMLLoader fxmlLoader) {
        Scene scene;
        try {
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("MAZE BANK");
        stage.show();
    }

    public void showClientWindow() {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("FXML/Client/Client.fxml"));
        ClientController clientController = fxmlLoader.getController();
        createStage(fxmlLoader);
    }

    public void closeStage(Stage stage) {
        stage.close();
    }
}
