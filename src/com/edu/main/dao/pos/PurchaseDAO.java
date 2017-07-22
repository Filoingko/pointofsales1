/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.main.dao.pos;

import static com.edu.main.dao.product.AddNewProductDAO.dbconnect;
import static com.edu.main.dao.product.SearchProductDAO.dbconnect;
import com.edu.main.dbconnect.DBConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gihan Chathuranga
 */
public class PurchaseDAO {

    public static Connection dbconnect() throws ClassNotFoundException, SQLException {
        DBConnector dbConnector = new DBConnector();
        Connection connection = dbConnector.connection();
        return connection;
    }

    public ResultSet searchFromdb(String cusId) throws ClassNotFoundException, SQLException {

        Connection connection = dbconnect();

        String sql = "select * from customer where id = '" + cusId + "'";

        Class.forName("com.mysql.jdbc.Driver");
        Statement stm = connection.createStatement();
        ResultSet result = stm.executeQuery(sql);

        return result;
    }

    public ResultSet searchFromdbproduct(String proId) throws ClassNotFoundException, SQLException {
        Connection connection = dbconnect();

        String sql = "select * from products where id = '" + proId + "'";

        Class.forName("com.mysql.jdbc.Driver");
        Statement stm = connection.createStatement();
        ResultSet result = stm.executeQuery(sql);

        return result;
    }

    public int addToDB(String proId, String proName, String proPrice, String proType, String proQty) throws ClassNotFoundException, SQLException {
        double proPrice1 = Double.parseDouble(proPrice);
        double proQty1 = Double.parseDouble(proQty);
        double totalPrice = proPrice1 * proQty1;

        Connection connection = dbconnect();

        String sql = "insert into tempurches values('00','" + proId + "','" + proName + "','" + proQty1 + "','" + proPrice1 + "','" + totalPrice + "')";
        Class.forName("com.mysql.jdbc.Driver");
        Statement stm = connection.createStatement();
        int result1 = stm.executeUpdate(sql);

        
        sql = "select quantity from products where id = '" + proId + "'";
        Class.forName("com.mysql.jdbc.Driver");
        stm = connection.createStatement();
        ResultSet resultset = stm.executeQuery(sql);
        double quentity = 0;
        while (resultset.next()) {
            quentity = Double.parseDouble(resultset.getString("quantity"));
        }
        quentity = quentity - proQty1;
        
        sql = "Update products  set quantity = ? where id=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, quentity);
        pstm.setObject(2, proId);
        int result2 = pstm.executeUpdate();
        
        return result1;
    }
}
