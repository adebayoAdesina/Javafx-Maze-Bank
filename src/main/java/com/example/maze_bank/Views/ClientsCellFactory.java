package com.example.maze_bank.Views;

import com.example.maze_bank.App;
import com.example.maze_bank.Controllers.Admin.ClientsCellController;
import com.example.maze_bank.Models.Client;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListCell;

import java.io.IOException;

public class ClientsCellFactory extends ListCell<Client> {
    @Override
    protected void updateItem(Client client, boolean empty) {
        super.updateItem(client, empty);
        if (empty) {
            setText(null);
            setGraphic(null);
        }
        else {
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("FXML/Admin/ClientCell.fxml"));
            ClientsCellController clientsCellController = new ClientsCellController(client);
            fxmlLoader.setController(clientsCellController);
            setText(null);
            try {
                setGraphic(fxmlLoader.load());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
