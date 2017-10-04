/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.main.dao.pos;

import static com.edu.main.dao.pos.PurchaseDAO.dbconnect;
import com.edu.main.dbconnect.DBConnector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gihan Chathuranga
 */
public class MainReportDAO {

    public static Connection dbconnect() throws ClassNotFoundException, SQLException {
        DBConnector dbConnector = new DBConnector();
        Connection connection = dbConnector.connection();
        return connection;
    }

    public ResultSet searchFromdb() throws ClassNotFoundException, SQLException {
        Connection connection = dbconnect();

        String sql = " select * From purches;";

        Class.forName("com.mysql.jdbc.Driver");
        Statement stm = connection.createStatement();
        ResultSet result = stm.executeQuery(sql);

        return result;
    }

    public ResultSet searchByProduct(String pid) throws ClassNotFoundException, SQLException {
        Connection connection = dbconnect();

        String sql = " select * From purches where product_id = " + pid + ";";

        Class.forName("com.mysql.jdbc.Driver");
        Statement stm = connection.createStatement();
        ResultSet result = stm.executeQuery(sql);

        return result;
    }

    public ResultSet searchBycustomer(String cusid) throws ClassNotFoundException, SQLException {
        Connection connection = dbconnect();

        String sql = " select * From purches where customer_id = "+cusid+" ;";

        Class.forName("com.mysql.jdbc.Driver");
        Statement stm = connection.createStatement();
        ResultSet result = stm.executeQuery(sql);

        return result;
    
    }

    public ResultSet searchBydate(String dateof) throws ClassNotFoundException, SQLException {
       Connection connection = dbconnect();

        String sql = " select * From purches where date = " + dateof + ";";

        Class.forName("com.mysql.jdbc.Driver");
        Statement stm = connection.createStatement();
        ResultSet result = stm.executeQuery(sql);

        return result;
    }
}
