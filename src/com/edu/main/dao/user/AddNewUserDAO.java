/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.main.dao.user;

import com.edu.main.dbconnect.DBConnector;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gihan Chathuranga
 */
public class AddNewUserDAO {
    public static Connection dbconnect() throws ClassNotFoundException, SQLException {
        DBConnector dbConnector = new DBConnector();
        Connection connection = dbConnector.connection();
        return connection;
    }

    public int addTodb(String userId, String userName, String userpswd, String usertype) throws ClassNotFoundException, SQLException, UnsupportedEncodingException {
                
        Connection connection = dbconnect();
        
        PasswordHashing hashing = new PasswordHashing();
        String passwd = hashing.get_SHA_512_SecurePassword(userpswd, "inter");
        
        
        String sql="insert into user values('00','"+userId+"','"+userName+"','"+passwd+"','"+usertype+"')";
        
        Class.forName("com.mysql.jdbc.Driver");
        Statement stm=connection.createStatement();
	int result = stm.executeUpdate(sql);
        
        return result;
    }
}
