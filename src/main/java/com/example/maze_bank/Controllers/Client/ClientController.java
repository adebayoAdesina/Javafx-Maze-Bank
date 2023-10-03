package com.example.maze_bank.Controllers.Client;

import com.example.maze_bank.Models.Model;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientController implements Initializable {
    public BorderPane client_parent;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Model.getInstance().getViewFactory().getClientsSelectedItem().addListener((observable, oldValue, newValue) -> {
            switch (newValue) {
                case "Transactions" -> client_parent.setCenter(Model.getInstance().getViewFactory().getTransactionView());
                default -> client_parent.setCenter(Model.getInstance().getViewFactory().getDashboardView());
            }
        });
    }
}
