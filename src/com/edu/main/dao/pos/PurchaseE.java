/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.main.dao.pos;

/**
 *
 * @author Gihan Chathuranga
 */
public class PurchaseE {

    private String proId;
    private String proName;
    private String proPrice;
    private String proType;
    private String proManufa;
    private String proQty;

    public PurchaseE(String proId, String proName, String proPrice, String proType, String proQty) {
        this.proId = proId;
        this.proName = proName;
        this.proPrice = proPrice;
        this.proType = proType;
        this.proManufa = proManufa;
        this.proQty = proQty;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProPrice() {
        return proPrice;
    }

    public void setProPrice(String proPrice) {
        this.proPrice = proPrice;
    }

    public String getProType() {
        return proType;
    }

    public void setProType(String proType) {
        this.proType = proType;
    }

    public String getProManufa() {
        return proManufa;
    }

    public void setProManufa(String proManufa) {
        this.proManufa = proManufa;
    }

    public String getProQty() {
        return proQty;
    }

    public void setProQty(String proQty) {
        this.proQty = proQty;
    }

    public void allSetter(String proId, String proName, String proPrice, String proType, String proManufa, String proQty) {

    }
}
