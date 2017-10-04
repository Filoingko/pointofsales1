/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.main.facade.customer;

/**
 *
 * @author Gihan Chathuranga
 */
public class AddNewCustomerfacade {

    public boolean checkUpdate(int result) {
        if (0 < result) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkInt(String cusNIC) {
        try {
            Integer.parseInt(cusNIC);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public boolean validateEmail(String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        System.out.println(m.matches());
        return m.matches();
    }

    public boolean validayeNumber(String cusContactno) {

        try {
            int tp = Integer.parseInt(cusContactno);
            if (cusContactno.length() == 10) {
                   return true;
            }else{
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }

    }
}
