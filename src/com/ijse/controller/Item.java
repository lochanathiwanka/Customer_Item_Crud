package com.ijse.controller;

import com.ijse.model.ItemModel;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class Item {
    public TextField txtCode;
    public TextField txtDescription;
    public TextField txtPrice;
    private ItemDBController itemDBController;

    public void btnSaveOnAction(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        ItemModel itemModel = new ItemModel(txtCode.getText(), txtDescription.getText(), txtPrice.getText());
        itemDBController.addItem(itemModel);
    }
}
