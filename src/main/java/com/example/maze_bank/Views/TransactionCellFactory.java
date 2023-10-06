package com.example.maze_bank.Views;

import com.example.maze_bank.App;
import com.example.maze_bank.Controllers.Client.TransactionCellController;
import com.example.maze_bank.Models.Transaction;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListCell;

import java.io.IOException;


public class TransactionCellFactory extends ListCell<Transaction> {
    @Override
    protected void updateItem(Transaction transaction, boolean empty) {
        super.updateItem(transaction, empty);
        if (empty) {
            setText(null);
            setGraphic(null);
        }
        else {
            FXMLLoader loader = new FXMLLoader(App.class.getResource("FXML/Client/TransactionCell.fxml"));
            TransactionCellController transactionCellController = new TransactionCellController(transaction);
            loader.setController(transactionCellController);
            setText(null);
            try {
                setGraphic(loader.load());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
