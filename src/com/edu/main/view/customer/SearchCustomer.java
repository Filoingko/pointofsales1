/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.main.view.customer;

import com.edu.main.dao.customer.SearchCustomerDAO;
import com.edu.main.dao.product.SearchProductDAO;
import com.edu.main.facade.customer.SearchCustomerfacade;
import com.edu.main.facade.product.SearchProductfacade;
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
public class SearchCustomer extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddNewProduct
     */
    public SearchCustomer() {
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
        jButton2 = new javax.swing.JButton();
        cusedditButton = new javax.swing.JButton();
        cussearchButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setAlignmentX(1.0F);
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(1021, 461));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Usuzi", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Search customer");

        jLabel2.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        jLabel2.setText("ID                : ");

        cusidTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusidTextfieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        jLabel3.setText("Name            : ");

        cusnameTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusnameTextfieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        jLabel4.setText("CNIC           :");

        cusCNICTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusCNICTextfieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        jLabel5.setText("E-mail           :");

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

        jButton2.setText("Cancle");

        cusedditButton.setText("Edit");

        cussearchButton.setText("Search");
        cussearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cussearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cusedditButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
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
                            .addComponent(cusCNICTextfield)
                            .addComponent(cusemailTextfield)
                            .addComponent(cuscontactnoTextfield)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cusidTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cussearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cusidTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cussearchButton))
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
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(cusedditButton))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
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

    private void cussearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cussearchButtonActionPerformed
        String cusId = cusidTextfield.getText();

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
                cusedditButton.setEnabled(true);
            } else {
                JOptionPane.showInternalMessageDialog(rootPane, "No Data Found");
                cusedditButton.setEnabled(false);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchProduct.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SearchProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_cussearchButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cusCNICTextfield;
    private javax.swing.JTextField cuscontactnoTextfield;
    private javax.swing.JButton cusedditButton;
    private javax.swing.JTextField cusemailTextfield;
    private javax.swing.JTextField cusidTextfield;
    private javax.swing.JTextField cusnameTextfield;
    private javax.swing.JButton cussearchButton;
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
