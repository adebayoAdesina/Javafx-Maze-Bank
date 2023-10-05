package com.example.maze_bank.Controllers.Client;

import com.example.maze_bank.Enums.ClientMenuOption;
import com.example.maze_bank.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientMenuController implements Initializable {

    public Button dashboard_btn;
    public Button profile_btn;
    public Button transaction_btn;
    public Button account_btn;
    public Button logout_btn;
    public Button report_btn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        addListeners();
    }

    private void addListeners() {
        dashboard_btn.setOnAction(event -> onDashBoard());
        transaction_btn.setOnAction(event -> onTransaction());
        account_btn.setOnAction(event -> onAccount());
    }

    private void onDashBoard() {
        Model.getInstance().getViewFactory().getClientsSelectedItem().set(ClientMenuOption.DASHBOARD);
    }

    private void onTransaction() {
        Model.getInstance().getViewFactory().getClientsSelectedItem().set(ClientMenuOption.TRANSACTIONS);
    }

    private void onAccount(){ Model.getInstance().getViewFactory().getClientsSelectedItem().set(ClientMenuOption.ACCOUNTS);}

}
