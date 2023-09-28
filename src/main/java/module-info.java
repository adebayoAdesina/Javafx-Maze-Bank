module com.example.maze_bank {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires  org.xerial.sqlitejdbc;


    opens com.example.maze_bank to javafx.fxml;
    exports com.example.maze_bank;
    exports com.example.maze_bank.Controllers;
    exports com.example.maze_bank.Controllers.Admin;
    exports com.example.maze_bank.Controllers.Client;
    exports com.example.maze_bank.Models;
    exports com.example.maze_bank.Views;
}