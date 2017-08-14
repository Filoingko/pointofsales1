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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

        return result2;
    }

    public ResultSet searchFromdb() throws ClassNotFoundException, SQLException {
        Connection connection = dbconnect();

        String sql = " select * From tempurches;";

        Class.forName("com.mysql.jdbc.Driver");
        Statement stm = connection.createStatement();
        ResultSet result = stm.executeQuery(sql);

        return result;
    }

    public int payBill(String cusId) throws ClassNotFoundException, SQLException {
        Connection connection = dbconnect();
        String sql = " select * From tempurches;";

        Class.forName("com.mysql.jdbc.Driver");
        Statement stm = connection.createStatement();
        ResultSet resultSet = stm.executeQuery(sql);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate localDate = LocalDate.now();

        int result = 0;
        while (resultSet.next()) {
            sql = "insert into purches values (?,?,?,?,?,?)";
            PreparedStatement pstm = connection.prepareStatement(sql);
            pstm.setObject(1, "00");
            pstm.setObject(2, resultSet.getString("pid"));
            pstm.setObject(3, cusId);
            pstm.setObject(4, resultSet.getString("qty"));
            pstm.setObject(5, resultSet.getString("total_price"));
            pstm.setObject(6, dtf.format(localDate));

            result = pstm.executeUpdate();
        }

        return result;
    }

    public int clearCart() throws ClassNotFoundException, SQLException {

        Connection connection = dbconnect();
        String sql = "TRUNCATE tempurches";

        Class.forName("com.mysql.jdbc.Driver");
        Statement stm = connection.createStatement();
        int result = stm.executeUpdate(sql);

        return result;
    }
}
