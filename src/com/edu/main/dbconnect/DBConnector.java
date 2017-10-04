/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.main.dbconnect;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gihan Chathuranga
 */
public class DBConnector {

    private static java.sql.Connection conn;
    private static DBConnector dBConnection;

    public static Connection connection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        if (null == dBConnection) {
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/pointofsale", "root", "");
        }
        return (Connection) conn;
    }

    public static DBConnector getDBConnection() throws SQLException, ClassNotFoundException {
        if (null == dBConnection) {
            dBConnection = new DBConnector();
        }
        return dBConnection;
    }

    public java.sql.Connection getConnection() {
        return conn;
    }
}
