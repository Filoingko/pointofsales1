/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.main.view.pos;

import com.edu.main.dao.pos.PurchaseDAO;
import com.edu.main.dao.pos.PurchaseE;
import com.edu.main.facade.pos.Purchasefacade;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gihan Chathuranga
 */
public class Purchase extends javax.swing.JInternalFrame {

    public ArrayList<PurchaseE> tempList = new ArrayList<>();
    /**
     * Creates new form Purchase
     */
    public Purchase() {
        initComponents();
        productdetailPanel.setVisible(false);
        customerPanel2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        customerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cusidTextfield = new javax.swing.JTextField();
        cusearchButton = new javax.swing.JButton();
        guestcustomerButton = new javax.swing.JButton();
        productdetailPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        proidTextfield = new javax.swing.JTextField();
        productsearchButton = new javax.swing.JButton();
        pronameTextfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        propriceTextfield = new javax.swing.JTextField();
        protypeTextfield = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        addtocartButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        proquantityTextfield = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        paymentTable = new javax.swing.JTable();
        customerPanel2 = new javax.swing.JPanel();
        customerIDButton = new javax.swing.JButton();
        cusnameLable = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        customerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Customer"));
        customerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Customer ID :");
        customerPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 30, 102, 25));
        customerPanel.add(cusidTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 32, 182, -1));

        cusearchButton.setText("Search");
        cusearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusearchButtonActionPerformed(evt);
            }
        });
        customerPanel.add(cusearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, 30));

        guestcustomerButton.setText("Guest Customer");
        guestcustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guestcustomerButtonActionPerformed(evt);
            }
        });
        customerPanel.add(guestcustomerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, 30));

        jPanel1.add(customerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 590, 90));

        productdetailPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Product Detail"));
        productdetailPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        jLabel2.setText("ID                : ");
        productdetailPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 44, 92, -1));

        proidTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proidTextfieldActionPerformed(evt);
            }
        });
        productdetailPanel.add(proidTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 41, 111, -1));

        productsearchButton.setText("Search");
        productsearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productsearchButtonActionPerformed(evt);
            }
        });
        productdetailPanel.add(productsearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 40, 80, -1));

        pronameTextfield.setEditable(false);
        pronameTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pronameTextfieldActionPerformed(evt);
            }
        });
        productdetailPanel.add(pronameTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 71, 201, -1));

        jLabel3.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        jLabel3.setText("Name            : ");
        productdetailPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 74, 92, -1));

        jLabel4.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        jLabel4.setText("Price              : ");
        productdetailPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 105, 92, -1));

        propriceTextfield.setEditable(false);
        propriceTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propriceTextfieldActionPerformed(evt);
            }
        });
        productdetailPanel.add(propriceTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 102, 201, -1));

        protypeTextfield.setEditable(false);
        protypeTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                protypeTextfieldActionPerformed(evt);
            }
        });
        productdetailPanel.add(protypeTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 134, 201, -1));

        jLabel5.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        jLabel5.setText("Type             : ");
        productdetailPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 137, 92, -1));

        jButton3.setText("Reset");
        productdetailPanel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 196, -1, -1));

        addtocartButton.setText("Add to Cart");
        addtocartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtocartButtonActionPerformed(evt);
            }
        });
        productdetailPanel.add(addtocartButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 196, -1, -1));

        jLabel7.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        jLabel7.setText("Qty               : ");
        productdetailPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 168, 92, -1));

        proquantityTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proquantityTextfieldActionPerformed(evt);
            }
        });
        productdetailPanel.add(proquantityTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 165, 201, -1));

        jPanel1.add(productdetailPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 122, 390, 270));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Items in Cart"));

        paymentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CID", "PID", "Quantity", "Unit Price", "Total Price"
            }
        ));
        jScrollPane1.setViewportView(paymentTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 122, 596, -1));

        customerPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Customer"));

        customerIDButton.setText(" Customer ID");
        customerIDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerIDButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout customerPanel2Layout = new javax.swing.GroupLayout(customerPanel2);
        customerPanel2.setLayout(customerPanel2Layout);
        customerPanel2Layout.setHorizontalGroup(
            customerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customerIDButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50)
                .addComponent(cusnameLable, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
        );
        customerPanel2Layout.setVerticalGroup(
            customerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(customerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(customerIDButton, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(cusnameLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.add(customerPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 16, 390, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customerIDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerIDButtonActionPerformed
        addtocartButton.enable(false);
        customerPanel.setVisible(true);
        productdetailPanel.setVisible(false);
        customerPanel2.setVisible(false);
    }//GEN-LAST:event_customerIDButtonActionPerformed

    private void proquantityTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proquantityTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proquantityTextfieldActionPerformed

    private void addtocartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtocartButtonActionPerformed
        String proId = proidTextfield.getText();
        String proName = pronameTextfield.getText();
        String proPrice = propriceTextfield.getText();
        String proType = protypeTextfield.getText();
        //String proManufa = promanufaTextfield.getText();
        String proQty = proquantityTextfield.getText();

        PurchaseE purchaseE = new PurchaseE(proId, proName, proPrice, proType, proQty);
        tempList.add(purchaseE);

        System.out.println(tempList.size());
    }//GEN-LAST:event_addtocartButtonActionPerformed

    private void protypeTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_protypeTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_protypeTextfieldActionPerformed

    private void propriceTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_propriceTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_propriceTextfieldActionPerformed

    private void pronameTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pronameTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pronameTextfieldActionPerformed

    private void productsearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productsearchButtonActionPerformed
        try {
            String proId = proidTextfield.getText();

            proidTextfield.setText("");
            pronameTextfield.setText("");
            propriceTextfield.setText("");
            protypeTextfield.setText("");
            //promanufaTextfield.setText("");
            proquantityTextfield.setText("");

            PurchaseDAO purchaseDAO = new PurchaseDAO();
            Purchasefacade searchProductfacade = new Purchasefacade();

            ResultSet resultSet = purchaseDAO.searchFromdbproduct(proId);

            if (searchProductfacade.checkAvailability(resultSet)) {
                proidTextfield.setText(resultSet.getString("id"));
                pronameTextfield.setText(resultSet.getString("name"));
                propriceTextfield.setText(Double.toString(resultSet.getDouble("price")));
                protypeTextfield.setText(resultSet.getString("type"));
                //promanufaTextfield.setText(resultSet.getString("manufacture"));

            } else {
                JOptionPane.showInternalMessageDialog(rootPane, "No Product Found");

            }
        } catch (SQLException ex) {
            Logger.getLogger(Purchase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Purchase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_productsearchButtonActionPerformed

    private void proidTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proidTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proidTextfieldActionPerformed

    private void guestcustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guestcustomerButtonActionPerformed
        addtocartButton.enable(false);
        customerPanel.setVisible(false);
        productdetailPanel.setVisible(true);
        customerPanel2.setVisible(true);
    }//GEN-LAST:event_guestcustomerButtonActionPerformed

    private void cusearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusearchButtonActionPerformed
        try {
            String cusId = cusidTextfield.getText();

            PurchaseDAO purchaseDAO = new PurchaseDAO();
            Purchasefacade searchCustomerfacade = new Purchasefacade();

            ResultSet resultSet = purchaseDAO.searchFromdb(cusId);

            if (searchCustomerfacade.checkAvailability(resultSet)) {
                addtocartButton.enable(false);
                customerPanel.setVisible(false);
                productdetailPanel.setVisible(true);
                cusnameLable.setText(resultSet.getString("name"));
            } else {
                JOptionPane.showInternalMessageDialog(rootPane, "No Customer Found");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Purchase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Purchase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cusearchButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addtocartButton;
    private javax.swing.JButton cusearchButton;
    private javax.swing.JTextField cusidTextfield;
    private javax.swing.JLabel cusnameLable;
    private javax.swing.JButton customerIDButton;
    private javax.swing.JPanel customerPanel;
    private javax.swing.JPanel customerPanel2;
    private javax.swing.JButton guestcustomerButton;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable paymentTable;
    private javax.swing.JPanel productdetailPanel;
    private javax.swing.JButton productsearchButton;
    private javax.swing.JTextField proidTextfield;
    private javax.swing.JTextField pronameTextfield;
    private javax.swing.JTextField propriceTextfield;
    private javax.swing.JTextField proquantityTextfield;
    private javax.swing.JTextField protypeTextfield;
    // End of variables declaration//GEN-END:variables

public ArrayList<PurchaseE> getList(){
    return tempList;
}
}
