package com.example.maze_bank.Controllers.Client;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AccountsController implements Initializable {
    public Label checking_account;
    public Label transaction_limit;
    public Label ch_account_date;
    public Label ch_account_balance;
    public Label savings_account;
    public Label withdraw_limit;
    public Label sv_account_date;
    public Label sv_account_balance;
    public TextField amount_to_send_to_savings;
    public Button transfer_to_savings_btn;
    public TextField amount_to_send_to_ch;
    public Button transfer_to_ch_btn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
