/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.main.dao.customer;

import com.edu.main.dbconnect.DBConnector;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gihan Chathuranga
 */
public class DeleteCustomerDAO {

    public static Connection dbconnect() throws ClassNotFoundException, SQLException {
        DBConnector dbConnector = new DBConnector();
        Connection connection = dbConnector.connection();
        return connection;
    }
    
    public int deleteFromdb(String proId) throws ClassNotFoundException, SQLException {
        
        Connection connection = dbconnect();
        
        String sql=" delete From products where id = '"+proId+"'";
        
        Class.forName("com.mysql.jdbc.Driver");
        Statement stm=connection.createStatement();
	int result = stm.executeUpdate(sql);
        
        return result;
    }
    
}
