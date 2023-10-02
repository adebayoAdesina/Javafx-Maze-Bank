package com.example.maze_bank;

import com.example.maze_bank.Models.Model;

import javafx.application.Application;
import javafx.stage.Stage;


public class App extends Application {
    @Override
    public void start(Stage stage) {
        Model.getInstance().getViewFactory().showLogInWindow();

    }

 
}
