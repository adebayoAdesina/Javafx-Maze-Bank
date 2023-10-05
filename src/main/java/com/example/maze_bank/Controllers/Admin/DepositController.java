package com.example.maze_bank.Controllers.Admin;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class DepositController implements Initializable {
    public TextField payee_address_textfield;
    public Button search_btn;
    public ListView result_listview;
    public TextField amount_textfield;
    public Button deposit_btn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
