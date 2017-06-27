/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.main.dao.customer;

import static com.edu.main.dao.product.UpdateProductDAO.dbconnect;
import com.edu.main.dbconnect.DBConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Gihan Chathuranga
 */
public class UpdateCustomerDAO {
    
    public static Connection dbconnect() throws ClassNotFoundException, SQLException {
        DBConnector dbConnector = new DBConnector();
        Connection connection = dbConnector.connection();
        return connection;
    }

    public int addTodb(String cusId, String cusName, String cusNIC, String cusEmail, String cusContactno) throws ClassNotFoundException, SQLException {
        int cusNIC1 = Integer.parseInt(cusNIC);
        int cusContactno1 = Integer.parseInt(cusContactno);

        Connection connection = dbconnect();
        String sql = "Update customer  set name= ?, cnic=?, e_mail = ?, contact_no= ?  where id=?";
        PreparedStatement stm = connection.prepareStatement(sql);
        //stm.setObject(1, "90");
        stm.setObject(1, cusName); 
        stm.setObject(2, cusNIC1);
        stm.setObject(3, cusEmail);
        stm.setObject(4, cusContactno1);
        stm.setObject(5, cusId);

        int result = stm.executeUpdate();

        return result;
    }
    
}
