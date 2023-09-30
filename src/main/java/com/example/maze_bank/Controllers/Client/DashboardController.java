package com.example.maze_bank.Controllers.Client;

import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {
    public Label login_date;
    public Text user_name;
    public Label checking_balance;
    public Label checking_acc_one;
    public Label savings_account;
    public Label checking_acc_two;
    public Label income_label;
    public Label expense_label;
    public ListView transaction_listview;
    public TextField payee_label;
    public TextField amount_label;
    public Button send_money_btn;
    public TextArea message_label;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
