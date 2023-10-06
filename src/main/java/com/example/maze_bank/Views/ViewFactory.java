package com.example.maze_bank.Views;

import com.example.maze_bank.App;
import com.example.maze_bank.Controllers.Admin.AdminController;
import com.example.maze_bank.Controllers.Client.ClientController;
import com.example.maze_bank.Enums.AdminMenuOption;
import com.example.maze_bank.Enums.ClientMenuOption;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewFactory {

    /** user **/

    private final ObjectProperty<ClientMenuOption> clientsSelectedItem;
    private AnchorPane dashboardView;
    private  AnchorPane transactionView;
    private AnchorPane accountView;

    public ViewFactory() {
        this.clientsSelectedItem = new SimpleObjectProperty<>();
        this.adminSelectedItem = new SimpleObjectProperty<>();
    }

    public ObjectProperty<ClientMenuOption> getClientsSelectedItem() {
        return clientsSelectedItem ;
    }

    public AnchorPane getAccountView() {
        if(accountView == null)
        {
            try {
                accountView = new FXMLLoader(App.class.getResource("FXML/Client/Accounts.fxml")).load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return accountView;
    }

    public AnchorPane getTransactionView() {
        if (transactionView == null) {
            try{
                transactionView = new FXMLLoader(App.class.getResource("FXML/Client/Transactions.fxml")).load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return transactionView;
    }

    public AnchorPane getDashboardView() {
        if(dashboardView == null) {
            try{
                dashboardView = new FXMLLoader(App.class.getResource("FXML/Client/Dashboard.fxml")).load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        return dashboardView;
    }

    public void showLogInWindow() {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("FXML/Login.fxml"));
        createStage(fxmlLoader);
    }

    private void createStage(FXMLLoader fxmlLoader) {
        Scene scene;
        try {
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.getIcons().add(new Image(String.valueOf(App.class.getResource("FXML/Images/icon.png"))));
        stage.setResizable(false);
        stage.setTitle("MAZE BANK");
        stage.show();
    }

    public void showClientWindow() {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("FXML/Client/Client.fxml"));
        ClientController clientController = new ClientController();
        fxmlLoader.setController(clientController);
        createStage(fxmlLoader);
    }

    public void showAdminWindow() {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("FXML/Admin/Admin.fxml"));
        AdminController adminController = new AdminController();
        fxmlLoader.setController(adminController);
        createStage(fxmlLoader);

    }

    public void closeStage(Stage stage) {
        stage.close();
    }

    /** Admin **/
    private final ObjectProperty<AdminMenuOption> adminSelectedItem;
    private AnchorPane createClientView;

    private AnchorPane clientView;
    private AnchorPane depositView;

    public AnchorPane getDepositView() {
        if (depositView == null) {
            try {
                depositView = new FXMLLoader(App.class.getResource("FXML/Admin/Deposit.fxml")).load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return depositView;
    }

    public AnchorPane getCreateClientView() {
        if (createClientView == null)
        {
            try {
                createClientView = new FXMLLoader(App.class.getResource("FXML/Admin/CreateClient.fxml")).load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return createClientView;
    }

    public AnchorPane getClientView() {
        if (clientView == null)
        {
            try {
                clientView = new FXMLLoader(App.class.getResource("FXML/Admin/Clients.fxml")).load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return clientView;
    }

    public ObjectProperty<AdminMenuOption> getAdminSelectedItem() {
        return adminSelectedItem;
    }
}
