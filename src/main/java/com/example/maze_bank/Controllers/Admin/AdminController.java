package com.example.maze_bank.Controllers.Admin;

import com.example.maze_bank.Models.Model;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminController implements Initializable {
    public BorderPane admin_parent;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Model.getInstance().getViewFactory().getAdminSelectedItem().addListener((observable, oldValue, newValue) -> {
            switch (newValue) {
                case CLIENTS -> admin_parent.setCenter(Model.getInstance().getViewFactory().getClientView());
                case DEPOSIT -> admin_parent.setCenter(Model.getInstance().getViewFactory().getDepositView());
                default -> admin_parent.setCenter(Model.getInstance().getViewFactory().getCreateClientView());
            }
        });
    }
}
