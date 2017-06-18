/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.main.dao.product;

import static com.edu.main.dao.product.AddNewProductDAO.dbconnect;
import com.edu.main.dbconnect.DBConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 *
 * @author Gihan Chathuranga
 */
public class UpdateProductDAO {

    public static Connection dbconnect() throws ClassNotFoundException, SQLException {
        DBConnector dbConnector = new DBConnector();
        Connection connection = dbConnector.connection();
        return connection;
    }

    public int addTodb(String proId, String proName, String proPrice, String proType, String proManufa, String proQty) throws ClassNotFoundException, SQLException {
        double proPrice1 = Double.parseDouble(proPrice);
        double proQty1 = Double.parseDouble(proQty);

        Connection connection = dbconnect();
        String sql = "Update products  set name= ?, price=?, type=?, manufacture= ? , quantity = ? where id=?";
        PreparedStatement stm = connection.prepareStatement(sql);
        //stm.setObject(1, "90");
        stm.setObject(1, proName);
        stm.setObject(2, proPrice1);
        stm.setObject(3, proType);
        stm.setObject(4, proManufa);
        stm.setObject(5, proQty1);
        stm.setObject(6, proId);

        int result = stm.executeUpdate();

        return result;
    }

}
