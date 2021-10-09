package com.ijse.controller;

import com.ijse.db.DBConnection;
import com.ijse.model.ItemModel;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ItemDBController {
    public void addItem(ItemModel item) throws SQLException, ClassNotFoundException {
        PreparedStatement pstm = DBConnection.getInstance().getConnection().prepareStatement("INSERT INTO Item VALUES (?, ?, ?)");
        pstm.setObject(1, item.getCode());
        pstm.setObject(2, item.getDescription());
        pstm.setObject(3, item.getPrice());
        pstm.executeUpdate();
    }
}
