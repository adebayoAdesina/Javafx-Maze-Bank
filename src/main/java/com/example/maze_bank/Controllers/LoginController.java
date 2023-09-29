package com.example.maze_bank.Controllers;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController  implements Initializable {
    @FXML public ChoiceBox account_selector;
    @FXML public TextField payee_address;
    @FXML public PasswordField passwordField;
    @FXML public Label error_label;
    ObservableList<String> list = FXCollections.observableArrayList("Admin", "User");
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        account_selector.setItems(list);
        account_selector.selectionModelProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observableValue, Object o, Object t1) {
                System.out.println(observableValue.getValue());
            }
        });
    }
}

