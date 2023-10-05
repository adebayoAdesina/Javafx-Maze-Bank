package com.example.maze_bank.Controllers;

import com.example.maze_bank.Enums.AccountType;
import com.example.maze_bank.Models.Model;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController  implements Initializable {
    public ChoiceBox<AccountType> account_selector;
    public TextField payee_address;
    public PasswordField passwordField;
    public Label error_label;

    public Button login_button;
    ObservableList<AccountType> list = FXCollections.observableArrayList(AccountType.ADMIN, AccountType.CLIENT);
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        account_selector.setItems(list);

        login_button.setOnAction(event -> onLogin());
    }
    private void onLogin() {
        Stage stage = (Stage) error_label.getScene().getWindow();
        if (account_selector.getValue() == null) {
            error_label.setText("Please choose an account type");

        } else if (account_selector.getValue().equals(AccountType.ADMIN)){
            Model.getInstance().getViewFactory().showAdminWindow();
            Model.getInstance().getViewFactory().closeStage(stage);
        }else {
            Model.getInstance().getViewFactory().showClientWindow();
            Model.getInstance().getViewFactory().closeStage(stage);
        }


    }
}


