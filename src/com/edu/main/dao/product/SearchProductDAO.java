/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.main.dao.product;

import static com.edu.main.dao.product.AddNewProductDAO.dbconnect;
import com.edu.main.dbconnect.DBConnector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gihan Chathuranga
 */
public class SearchProductDAO {
    public static Connection dbconnect() throws ClassNotFoundException, SQLException {
        DBConnector dbConnector = new DBConnector();
        Connection connection = dbConnector.connection();
        return connection;
    }
    
    public ResultSet searchFromdb(String proId) throws ClassNotFoundException, SQLException {
        
        Connection connection = dbconnect();
        
        String sql="select * from products where id = '"+proId+"'";
        
        Class.forName("com.mysql.jdbc.Driver");
        Statement stm=connection.createStatement();
	ResultSet result = stm.executeQuery(sql);
        
        return result;
    }
}
