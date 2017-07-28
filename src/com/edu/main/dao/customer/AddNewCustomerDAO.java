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
public class AddNewCustomerDAO {
    public static Connection dbconnect() throws ClassNotFoundException, SQLException {
        DBConnector dbConnector = new DBConnector();
        Connection connection = dbConnector.connection();
        return connection;
    }

    public int addTodb(String cusId, String cusName, String cusNIC, String cusEmail, String cusContactno) throws ClassNotFoundException, SQLException {
         //To change body of generated methods, choose Tools | Templates.
        double cusCNIC1 = Integer.parseInt(cusNIC);
        double cusContactno1 = Integer.parseInt(cusContactno);
        
        Connection connection = dbconnect();
        
        String sql="insert into customer values('00','"+cusId+"','"+cusName+"','"+cusCNIC1+"','"+cusEmail+"','"+cusContactno1+"')";
        
        Class.forName("com.mysql.jdbc.Driver");
        Statement stm=connection.createStatement();
	int result = stm.executeUpdate(sql);
        
        return result;
    }
    
}
