package com.example.maze_bank.Controllers.Client;

import com.example.maze_bank.Models.Transaction;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class TransactionCellController implements Initializable {
    public Label sender_label;
    public FontAwesomeIconView in_icon;
    public FontAwesomeIconView out_icon;
    public Label transaction_date_label;
    public Label receiver_label;
    public Label amount_label;

    private final Transaction transaction;

    public TransactionCellController(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
