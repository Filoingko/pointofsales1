/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.main.view.pos;

import com.edu.main.dao.pos.PurchaseDAO;
import com.edu.main.dao.pos.PurchaseE;
import com.edu.main.facade.pos.Purchasefacade;
import com.edu.main.view.product.ProductReport;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gihan Chathuranga
 */
public class Purchase extends javax.swing.JInternalFrame {

    public ArrayList<PurchaseE> tempList = new ArrayList<>();
    String cusId = "Guest Customer";
    
    public Purchase() {
        initComponents();
        productdetailPanel.setVisible(false);
        customerPanel2.setVisible(false);
    }

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
        proidTextfield = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        totalTextfield = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        payButton = new javax.swing.JButton();
        customerPanel2 = new javax.swing.JPanel();
        customerIDButton = new javax.swing.JButton();
        cusnameLable = new javax.swing.JLabel();
        cusidLable = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 51));
        setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        setPreferredSize(new java.awt.Dimension(1021, 461));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        customerPanel.setBackground(new java.awt.Color(0, 0, 51));
        customerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        customerPanel.setForeground(new java.awt.Color(255, 255, 255));
        customerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
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

        productdetailPanel.setBackground(new java.awt.Color(0, 0, 51));
        productdetailPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Product Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        productdetailPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID                : ");
        productdetailPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 44, 92, -1));

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
        productdetailPanel.add(pronameTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 71, 200, -1));

        jLabel3.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name            : ");
        productdetailPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 74, 92, -1));

        jLabel4.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
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
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Type             : ");
        productdetailPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 137, 92, -1));

        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        productdetailPanel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 196, -1, -1));

        addtocartButton.setText("Add to Cart");
        addtocartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtocartButtonActionPerformed(evt);
            }
        });
        productdetailPanel.add(addtocartButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 196, -1, -1));

        jLabel7.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Qty               : ");
        productdetailPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 168, 92, -1));

        proquantityTextfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                proquantityTextfieldFocusLost(evt);
            }
        });
        proquantityTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proquantityTextfieldActionPerformed(evt);
            }
        });
        productdetailPanel.add(proquantityTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 165, 201, -1));

        proidTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proidTextfieldActionPerformed(evt);
            }
        });
        productdetailPanel.add(proidTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 110, -1));

        jPanel1.add(productdetailPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 122, 390, 270));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Items in Cart", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(0, 0, 51));

        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PID", "Name", "Quantity", "Unit Price", "Total Price"
            }
        ));
        jScrollPane1.setViewportView(cartTable);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total Amount");

        payButton.setText("Pay");
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totalTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(payButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalTextfield)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(payButton, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 122, 590, -1));

        customerPanel2.setBackground(new java.awt.Color(0, 0, 51));
        customerPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        customerPanel2.setForeground(new java.awt.Color(255, 255, 255));

        customerIDButton.setText(" Customer ID");
        customerIDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerIDButtonActionPerformed(evt);
            }
        });

        cusnameLable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cusnameLable.setForeground(new java.awt.Color(255, 255, 255));

        cusidLable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cusidLable.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout customerPanel2Layout = new javax.swing.GroupLayout(customerPanel2);
        customerPanel2.setLayout(customerPanel2Layout);
        customerPanel2Layout.setHorizontalGroup(
            customerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customerIDButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cusidLable, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cusnameLable, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        customerPanel2Layout.setVerticalGroup(
            customerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(customerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(customerIDButton, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(cusidLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        addtocartButton.setEnabled(false);
        customerPanel.setVisible(true);
        productdetailPanel.setVisible(false);
        customerPanel2.setVisible(false);
    }//GEN-LAST:event_customerIDButtonActionPerformed

    private void proquantityTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proquantityTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proquantityTextfieldActionPerformed

    private void addtocartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtocartButtonActionPerformed
        try {
            String proId = proidTextfield.getText();
            String proName = pronameTextfield.getText();
            String proPrice = propriceTextfield.getText();
            String proType = protypeTextfield.getText();
            //String proManufa = promanufaTextfield.getText();
            String proQty = proquantityTextfield.getText();

            PurchaseDAO purchaseDAO = new PurchaseDAO();
            if (!proquantityTextfield.equals(" ")) {
                int result = purchaseDAO.addToDB(proId, proName, proPrice, proType, proQty);

                Purchasefacade purchasefacade = new Purchasefacade();
                if (purchasefacade.checkAdd(result)) {
                    updatecart();
                } else {
                    JOptionPane.showInternalMessageDialog(rootPane, "Error");
                }
            } else {
                JOptionPane.showInternalMessageDialog(rootPane, "Enter quantity");
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Purchase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Purchase.class.getName()).log(Level.SEVERE, null, ex);
        }
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

                addtocartButton.setEnabled(true);

            } else {
                JOptionPane.showInternalMessageDialog(rootPane, "No Product Found");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Purchase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Purchase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_productsearchButtonActionPerformed

    private void guestcustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guestcustomerButtonActionPerformed
        addtocartButton.enable(false);
        customerPanel.setVisible(false);
        productdetailPanel.setVisible(true);
        customerPanel2.setVisible(true);
        cusnameLable.setText(" ");
    }//GEN-LAST:event_guestcustomerButtonActionPerformed

    private void cusearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusearchButtonActionPerformed
        try {
            cusId = cusidTextfield.getText();

            PurchaseDAO purchaseDAO = new PurchaseDAO();
            Purchasefacade searchCustomerfacade = new Purchasefacade();

            if (!cusId.equals("")) {
                ResultSet resultSet = purchaseDAO.searchFromdb(cusId);
                if (searchCustomerfacade.checkAvailability(resultSet)) {
                    addtocartButton.setEnabled(false);
                    customerPanel.setVisible(false);
                    customerPanel2.setVisible(true);
                    productdetailPanel.setVisible(true);
                    cusnameLable.setText(resultSet.getString("name"));
                } else {
                    JOptionPane.showMessageDialog(null,
                            "<html><div color=red>No Customer Found!", "Message", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "<html><div color=red>Enter Customer ID", "Message", JOptionPane.ERROR_MESSAGE);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Purchase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Purchase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cusearchButtonActionPerformed

    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payButtonActionPerformed
        try {
            PurchaseDAO purchaseDAO = new PurchaseDAO();
            int result = purchaseDAO.payBill(cusId);

            Purchasefacade purchasefacade = new Purchasefacade();
            if (purchasefacade.checkAdd(result)) {

                try {
                    MessageFormat header = new MessageFormat("Feature Creations");

                    boolean print = cartTable.print(JTable.PrintMode.FIT_WIDTH, header, header);
                } catch (PrinterException ex) {
                    Logger.getLogger(ProductReport.class.getName()).log(Level.SEVERE, null, ex);
                }

                purchaseDAO.clearCart();
                updatecart();

            } else {
                JOptionPane.showInternalMessageDialog(rootPane, "Error");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Purchase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Purchase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_payButtonActionPerformed

    private void proidTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proidTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proidTextfieldActionPerformed

    private void proquantityTextfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_proquantityTextfieldFocusLost
        String quenty = proquantityTextfield.getText();

        try {
            int qty = Integer.parseInt(quenty);
            if (qty < 0) {
                JOptionPane.showMessageDialog(this, "Invalied Quentity!");
                proquantityTextfield.setText("");
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Invalied Quentity!");
            proquantityTextfield.setText("");
        }


    }//GEN-LAST:event_proquantityTextfieldFocusLost

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        proidTextfield.setText("");
        pronameTextfield.setText("");
        propriceTextfield.setText("");
        protypeTextfield.setText("");
        //promanufaTextfield.setText("");
        proquantityTextfield.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addtocartButton;
    private javax.swing.JTable cartTable;
    private javax.swing.JButton cusearchButton;
    private javax.swing.JLabel cusidLable;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton payButton;
    private javax.swing.JPanel productdetailPanel;
    private javax.swing.JButton productsearchButton;
    private javax.swing.JTextField proidTextfield;
    private javax.swing.JTextField pronameTextfield;
    private javax.swing.JTextField propriceTextfield;
    private javax.swing.JTextField proquantityTextfield;
    private javax.swing.JTextField protypeTextfield;
    private javax.swing.JTextField totalTextfield;
    // End of variables declaration//GEN-END:variables

    public ArrayList<PurchaseE> getList() {
        return tempList;
    }

    private void updatecart() {
        try {
            PurchaseDAO cusReportDAO = new PurchaseDAO();
            ResultSet resultSet = cusReportDAO.searchFromdb();
            int total = 0;

            DefaultTableModel model = (DefaultTableModel) cartTable.getModel();
            model.setRowCount(0);
            while (resultSet.next()) {
                Object[] rowData = {resultSet.getString("pid"), resultSet.getString("name"), resultSet.getString("qty"), resultSet.getString("unit_price"), resultSet.getString("total_price")};
                total = total + Integer.parseInt(resultSet.getString("total_price"));
                model.addRow(rowData);
            }
            totalTextfield.setText(Integer.toString(total));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Purchase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Purchase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void addToList() {

    }

}
