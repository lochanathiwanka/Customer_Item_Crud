package com.ijse.controller;

import com.ijse.model.CustomerModel;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class Customer {
    public TextField txtCid;
    public TextField txtName;
    public TextField txtAddress;
    private CustomerDBController customerDBController;

    public void btnSaveOnAction(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        CustomerModel customer = new CustomerModel(txtCid.getText(), txtName.getText(), txtAddress.getText());
        customerDBController.addCustomer(customer);
    }
}
