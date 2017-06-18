/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.main.facade.product;

/**
 *
 * @author Gihan Chathuranga
 */
public class DeleteProductfacade {

    public boolean checkUpdate(int result) {
        if(0<result){
            return true;
        }else{
            return false;
        }
    }
    
}
