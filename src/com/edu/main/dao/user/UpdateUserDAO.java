/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.main.dao.user;

import static com.edu.main.dao.customer.UpdateCustomerDAO.dbconnect;
import com.edu.main.dbconnect.DBConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Gihan Chathuranga
 */
public class UpdateUserDAO {
    
    public static Connection dbconnect() throws ClassNotFoundException, SQLException {
        DBConnector dbConnector = new DBConnector();
        Connection connection = dbConnector.connection();
        return connection;
    }
    
    public int addTodb(String userId, String userName, String userpwd, String userType) throws ClassNotFoundException, SQLException {
        
        Connection connection = dbconnect();
        String sql = "Update user  set name= ?, cnic=?, e_mail = ?,  where id=?";
        PreparedStatement stm = connection.prepareStatement(sql);
        //stm.setObject(1, "90");
        stm.setObject(1, userName); 
        stm.setObject(2, userName);
        stm.setObject(3, userpwd);
        stm.setObject(4,  userId);


        int result = stm.executeUpdate();

        return result;
    }
}
