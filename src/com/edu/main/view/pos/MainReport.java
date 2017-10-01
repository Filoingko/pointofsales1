/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.main.view.pos;

import com.edu.main.dao.pos.MainReportDAO;
import com.edu.main.dao.pos.PurchaseE;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gihan Chathuranga
 */
public class MainReport extends javax.swing.JInternalFrame {

    /**
     * Creates new form Payment
     */
    public MainReport() {
        initComponents();
        runfirst();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        reportTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        searchbyproductButton = new javax.swing.JButton();
        searchbyproducttext = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        searchbydateButton = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        searchbycustomerButton = new javax.swing.JButton();
        searchbycustomrtext = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1021, 461));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Usuzi", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Purchase Report");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(310, 20, 300, 40);

        reportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Customer ID", "Quantity", "Total Price", "Date"
            }
        ));
        jScrollPane1.setViewportView(reportTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(29, 86, 720, 320);

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search By Product", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        searchbyproductButton.setText("Search");
        searchbyproductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbyproductButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchbyproducttext, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbyproductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(searchbyproducttext, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchbyproductButton)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(770, 80, 210, 100);

        jPanel5.setBackground(new java.awt.Color(0, 0, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search By Date", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        jButton3.setText("Search");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchbydateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(searchbydateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap())
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(770, 300, 210, 100);

        jPanel4.setBackground(new java.awt.Color(0, 0, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search By Customer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        searchbycustomerButton.setText("Search");
        searchbycustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbycustomerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchbycustomrtext, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbycustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(searchbycustomrtext, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchbycustomerButton)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(770, 190, 210, 100);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchbyproductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbyproductButtonActionPerformed
        try {
            String productid = searchbyproducttext.getText();

            MainReportDAO cusReportDAO = new MainReportDAO();
            ResultSet resultSet = cusReportDAO.searchByProduct(productid);

            if (resultSet == null) {
                JOptionPane.showMessageDialog(this, "Wrong product ID!");
            } else {
                DefaultTableModel model = (DefaultTableModel) reportTable.getModel();
                model.setRowCount(0);
                while (resultSet.next()) {
                    Object[] rowData = {resultSet.getString("product_id"), resultSet.getString("customer_id"), resultSet.getString("qty"), resultSet.getString("total_price"), resultSet.getString("date")};
                    model.addRow(rowData);
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainReport.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MainReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchbyproductButtonActionPerformed

    private void searchbycustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbycustomerButtonActionPerformed
        try {
            String cusid = searchbycustomrtext.getText();
            
            MainReportDAO cusReportDAO = new MainReportDAO();
            ResultSet resultSet = cusReportDAO.searchBycustomer(cusid);
            
            if (resultSet == null) {
                JOptionPane.showMessageDialog(this, "Wrong Customer ID!");
            } else {
                DefaultTableModel model = (DefaultTableModel) reportTable.getModel();
                model.setRowCount(0);
                while (resultSet.next()) {
                    Object[] rowData = {resultSet.getString("product_id"), resultSet.getString("customer_id"), resultSet.getString("qty"), resultSet.getString("total_price"), resultSet.getString("date")};
                    model.addRow(rowData);
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainReport.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MainReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchbycustomerButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable reportTable;
    private javax.swing.JButton searchbycustomerButton;
    private javax.swing.JTextField searchbycustomrtext;
    private javax.swing.JTextField searchbydateButton;
    private javax.swing.JButton searchbyproductButton;
    private javax.swing.JTextField searchbyproducttext;
    // End of variables declaration//GEN-END:variables

    private void runfirst() {
        try {
            MainReportDAO cusReportDAO = new MainReportDAO();
            ResultSet resultSet = cusReportDAO.searchFromdb();

            if (resultSet == null) {
                JOptionPane.showMessageDialog(this, "No Data added!");
            } else {
                DefaultTableModel model = (DefaultTableModel) reportTable.getModel();
                model.setRowCount(0);
                while (resultSet.next()) {
                    Object[] rowData = {resultSet.getString("product_id"), resultSet.getString("customer_id"), resultSet.getString("qty"), resultSet.getString("total_price"), resultSet.getString("date")};
                    model.addRow(rowData);
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainReport.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MainReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
