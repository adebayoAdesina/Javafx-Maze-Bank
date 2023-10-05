package com.example.maze_bank.Controllers.Admin;

import com.example.maze_bank.Enums.AdminMenuOption;
import com.example.maze_bank.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminMenuController implements Initializable {
    public Button create_client_btn;
    public Button clients_btn;
    public Button deposit_btn;
    public Button log_out_btn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        addListeners();
    }

    private void addListeners(){
        create_client_btn.setOnAction(event -> onCreateClient());
        clients_btn.setOnAction(event -> onClients());

    }

    private void onCreateClient() {
        Model.getInstance().getViewFactory().getAdminSelectedItem().set(AdminMenuOption.CREATE_CLIENT);
    }

    private void onClients() {
        Model.getInstance().getViewFactory().getAdminSelectedItem().set(AdminMenuOption.CLIENTS);
    }
}
