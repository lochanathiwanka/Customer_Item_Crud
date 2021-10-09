package com.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MainForm {
    public AnchorPane childPane;

    public void btnCustomerPaneOnAction(ActionEvent actionEvent) throws IOException {
        childPane.getChildren().clear();
        AnchorPane pane = FXMLLoader.load(this.getClass().getResource("../view/Customer.fxml"));
        childPane.getChildren().setAll(pane.getChildren());
    }

    public void btnItemPaneOnAction(ActionEvent actionEvent) {
    }
}
