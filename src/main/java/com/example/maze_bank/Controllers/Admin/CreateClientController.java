package com.example.maze_bank.Controllers.Admin;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CreateClientController implements Initializable {
    public TextField first_name_textfield;
    public TextField last_name_textfield;
    public TextField password_textfield;
    public CheckBox payee_address_checkbox;
    public Label payee_address_label;
    public CheckBox ch_account_box;
    public TextField checking_account_balance_textfield;
    public CheckBox sv_account_box;
    public TextField saving_account_balance_textfield;
    public Button create_new_account;
    public Label error_label;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
