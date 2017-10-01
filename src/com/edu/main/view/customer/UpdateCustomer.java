/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.main.view.customer;

import com.edu.main.dao.customer.AddNewCustomerDAO;
import com.edu.main.dao.customer.SearchCustomerDAO;
import com.edu.main.dao.customer.UpdateCustomerDAO;
import com.edu.main.facade.customer.AddNewCustomerfacade;
import com.edu.main.facade.customer.SearchCustomerfacade;
import com.edu.main.facade.customer.UpdateCustomerfacade;
import com.edu.main.view.product.SearchProduct;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gihan Chathuranga
 */
public class UpdateCustomer extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddNewProduct
     */
    public UpdateCustomer() {
        initComponents();
        errorText.setVisible(false);
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
        resetButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cussaveButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        errorText = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setAlignmentX(1.0F);
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(1021, 461));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Usuzi", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Edit Customer Informatation");

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));

        jLabel2.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID                : ");

        cusidTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusidTextfieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name            : ");

        cusnameTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusnameTextfieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CNIC           : ");

        cusCNICTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusCNICTextfieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("E-mail           : ");

        cusemailTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusemailTextfieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contact No    : ");

        cuscontactnoTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuscontactnoTextfieldActionPerformed(evt);
            }
        });

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Cancle");

        cussaveButton.setText("Save");
        cussaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cussaveButtonActionPerformed(evt);
            }
        });

        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        errorText.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        errorText.setForeground(new java.awt.Color(255, 0, 0));
        errorText.setText("Error!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                            .addComponent(cusnameTextfield)
                            .addComponent(cusCNICTextfield)
                            .addComponent(cusemailTextfield)
                            .addComponent(cuscontactnoTextfield)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(cusidTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cussaveButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(resetButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2))
                            .addComponent(errorText, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cusidTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(7, 7, 7)
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
                .addGap(18, 18, 18)
                .addComponent(errorText, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(resetButton)
                    .addComponent(cussaveButton))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(299, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(263, 263, 263))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(222, 222, 222))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        cusidTextfield.setText("");
        cusnameTextfield.setText("");
        cusCNICTextfield.setText("");
        cusemailTextfield.setText("");
        cuscontactnoTextfield.setText("");
    }//GEN-LAST:event_resetButtonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String cusId = cusidTextfield.getText();

        updatesearchbuttonactionperformed(cusId);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void cussaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cussaveButtonActionPerformed
        String cusId = cusidTextfield.getText();
        String cusName = cusnameTextfield.getText();
        String cusNIC = cusCNICTextfield.getText();
        String cusEmail = cusemailTextfield.getText();
        String cusContactno = cuscontactnoTextfield.getText();

        UpdateCustomerDAO updateCustomerDAO = new UpdateCustomerDAO();
        UpdateCustomerfacade updateCustomer = new UpdateCustomerfacade();
        AddNewCustomerfacade addNewCustomer = new AddNewCustomerfacade();
        int result;
        try {

            if (!(cusId.equals("")) && !(cusName.equals("")) && !(cusNIC.equals("")) && !(cusEmail.equals("")) && !(cusContactno.equals(""))) {
                if (addNewCustomer.checkInt(cusNIC)) {
                    if (addNewCustomer.validateEmail(cusEmail)) {
                        if (addNewCustomer.checkInt(cusContactno)) {
                            result = updateCustomerDAO.addTodb(cusId, cusName, cusNIC, cusEmail, cusContactno);

                            if (updateCustomer.checkUpdate(result)) {
                                JOptionPane.showInternalMessageDialog(this, "Update Success");
                                cusidTextfield.setText("");
                                cusnameTextfield.setText("");
                                cusCNICTextfield.setText("");
                                cusemailTextfield.setText("");
                                cuscontactnoTextfield.setText("");
                                errorText.setVisible(false);
                            } else {
                                JOptionPane.showInternalMessageDialog(this, "Update Faield");
                            }
                        } else {
                            errorText.setText("Wrong Contact Number");
                            errorText.setVisible(true);
                        }
                    } else {
                        errorText.setText("Wrong email address");
                        errorText.setVisible(true);
                    }
                } else {
                    errorText.setText("Wrong CusNIC");
                    errorText.setVisible(true);
                }
            } else {
                errorText.setText("Enter All Fields");
                errorText.setVisible(true);
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
    private javax.swing.JLabel errorText;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton resetButton;
    // End of variables declaration//GEN-END:variables

    public void updatesearchbuttonactionperformed(String cusId) {
        cusidTextfield.setText("");
        cusnameTextfield.setText("");
        cusCNICTextfield.setText("");
        cusemailTextfield.setText("");
        cuscontactnoTextfield.setText("");

        SearchCustomerDAO searchCustomerDAO = new SearchCustomerDAO();
        SearchCustomerfacade searchCustomerfacade = new SearchCustomerfacade();
        try {
            ResultSet resultSet = searchCustomerDAO.searchFromdb(cusId);

            if (searchCustomerfacade.checkAvailability(resultSet)) {
                cusidTextfield.setText(resultSet.getString("id"));
                cusnameTextfield.setText(resultSet.getString("name"));
                cusCNICTextfield.setText(Integer.toString(resultSet.getInt("cnic")));
                cusemailTextfield.setText(resultSet.getString("e_mail"));
                cuscontactnoTextfield.setText(resultSet.getString("contact_no"));
            } else {
                JOptionPane.showInternalMessageDialog(rootPane, "No Data Found");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchProduct.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SearchProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
