/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.main.view.customer;

import com.edu.main.dao.customer.AddNewCustomerDAO;
import com.edu.main.dao.product.AddNewProductDAO;
import com.edu.main.dbconnect.DBConnector;
import com.edu.main.facade.customer.AddNewCustomerfacade;
import com.edu.main.facade.product.AddNewProductfacade;
import com.edu.main.view.product.AddNewProduct;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gihan Chathuranga
 */
public class AddNewCustomer extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddNewProduct
     */
    public AddNewCustomer() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cusidTextfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cusnameTextfield = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cusCNICTextfield = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cusemailTextfield = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cuscontactnoTextfield = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cussaveButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setAlignmentX(1.0F);
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(883, 450));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Usuzi", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Add New customer");

        jLabel2.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        jLabel2.setText("ID                : ");

        cusidTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusidTextfieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        jLabel3.setText("Name           : ");

        cusnameTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusnameTextfieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        jLabel4.setText("CNIC           : ");

        cusCNICTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusCNICTextfieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        jLabel5.setText("E-mail           : ");

        cusemailTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusemailTextfieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        jLabel6.setText("Contact No    :");

        cuscontactnoTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuscontactnoTextfieldActionPerformed(evt);
            }
        });

        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancle");

        cussaveButton.setText("Save");
        cussaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cussaveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cussaveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cusnameTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(cusidTextfield)
                            .addComponent(cusCNICTextfield)
                            .addComponent(cusemailTextfield)
                            .addComponent(cuscontactnoTextfield))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cusidTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cusnameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cusCNICTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cusemailTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cuscontactnoTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(cussaveButton))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cusidTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusidTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusidTextfieldActionPerformed

    private void cusnameTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusnameTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusnameTextfieldActionPerformed

    private void cusCNICTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusCNICTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusCNICTextfieldActionPerformed

    private void cusemailTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusemailTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusemailTextfieldActionPerformed

    private void cuscontactnoTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuscontactnoTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuscontactnoTextfieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cussaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cussaveButtonActionPerformed
        String cusId = cusidTextfield.getText();
        String cusName = cusnameTextfield.getText();
        String cusNIC = cusCNICTextfield.getText();
        String cusEmail = cusemailTextfield.getText();
        String cusContactno = cuscontactnoTextfield.getText();

        AddNewCustomerDAO addNewCustomerDAO = new AddNewCustomerDAO();

        int result;
        try {
            result = addNewCustomerDAO.addTodb(cusId, cusName, cusNIC, cusEmail, cusContactno);

            AddNewCustomerfacade addNewCustomer = new AddNewCustomerfacade();
            if (addNewCustomer.checkUpdate(result)) {
                System.out.println("Sucess");
            } else {
                System.out.println("Faield");
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddNewCustomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddNewCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_cussaveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cusCNICTextfield;
    private javax.swing.JTextField cuscontactnoTextfield;
    private javax.swing.JTextField cusemailTextfield;
    private javax.swing.JTextField cusidTextfield;
    private javax.swing.JTextField cusnameTextfield;
    private javax.swing.JButton cussaveButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
