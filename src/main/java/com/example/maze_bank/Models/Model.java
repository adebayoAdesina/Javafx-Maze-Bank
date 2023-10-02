package com.example.maze_bank.Models;

import com.example.maze_bank.Views.ViewFactory;

public class Model {
    private static Model model;
    private final ViewFactory viewFactory;

    private Model(ViewFactory viewFactory) {
        this.viewFactory = viewFactory;
    }

    public static  synchronized  Model getInstance() {
        if (model == null) {
            model = new Model(new ViewFactory());
        }
        return model;
    }

    public ViewFactory getViewFactory() {
        return viewFactory;
    }
}
