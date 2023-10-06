package com.example.maze_bank.Controllers.Admin;

import com.example.maze_bank.Models.Client;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ClientsCellController {
    public Label first_name;
    public Label last_name;
    public Label payee_address;
    public Label ch_account_balance;
    public Label savings_account_balance;
    public Label date_sent;
    public Button delete_btn;

    private final Client client;

    public ClientsCellController(Client client) {
        this.client = client;
    }
}
