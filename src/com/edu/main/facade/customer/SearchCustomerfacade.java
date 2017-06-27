/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.main.facade.customer;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Gihan Chathuranga
 */
public class SearchCustomerfacade {
    public boolean checkAvailability(ResultSet resultSet) throws SQLException {
        if(resultSet.next()){
            return true;
        }else{
            return false;
        }
    }
}
