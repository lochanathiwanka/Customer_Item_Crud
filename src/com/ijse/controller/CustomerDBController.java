package com.ijse.controller;

import com.ijse.db.DBConnection;
import com.ijse.model.CustomerModel;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerDBController {
    public void addCustomer(CustomerModel customer) throws SQLException, ClassNotFoundException {
        PreparedStatement pstm = DBConnection.getInstance().getConnection().prepareStatement("INSERT INTO Customer VALUES (?, ?, ?)");
        pstm.setObject(1, customer.getCid());
        pstm.setObject(2, customer.getName());
        pstm.setObject(3, customer.getAddress());
        pstm.executeUpdate();
    }
}
