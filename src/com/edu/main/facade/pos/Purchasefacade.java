/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.main.facade.pos;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Gihan Chathuranga
 */
public class Purchasefacade {
    public boolean checkAvailability(ResultSet resultSet) throws SQLException {
        if(resultSet.next()){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean checkAdd(int result) throws SQLException {
        if(result > 0) {
            return true;
        }else{
            return false;
        }
    }
}
