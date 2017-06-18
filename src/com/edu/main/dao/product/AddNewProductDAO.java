/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.main.dao.product;

import com.edu.main.dbconnect.DBConnector;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gihan Chathuranga
 */
public class AddNewProductDAO {
    public static Connection dbconnect() throws ClassNotFoundException, SQLException {
        DBConnector dbConnector = new DBConnector();
        Connection connection = dbConnector.connection();
        return connection;
    }

    public int addTodb(String proId, String proName, String proPrice, String proType, String proManufa, String proQty) throws ClassNotFoundException, SQLException {
        
        double proPrice1 = Double.parseDouble(proPrice);
        double proQty1 = Double.parseDouble(proQty);
        
        Connection connection = dbconnect();
        
        String sql="insert into products values('00','"+proId+"','"+proName+"','"+proPrice1+"','"+proType+"','"+proManufa+"','"+proQty1+"')";
        
        Class.forName("com.mysql.jdbc.Driver");
        Statement stm=connection.createStatement();
	int result = stm.executeUpdate(sql);
        
        return result;
    }
    
    
}
