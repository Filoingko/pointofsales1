/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.main.view;

import com.edu.main.view.pos.Purchase;
import com.edu.main.view.pos.Payment;
import com.edu.main.view.customer.AddNewCustomer;
import com.edu.main.view.customer.UpdateCustomer;
import com.edu.main.view.customer.CustomerReport;
import com.edu.main.view.customer.DeleteCustomer;
import com.edu.main.view.customer.SearchCustomer;
import com.edu.main.view.product.UpdateProduct;
import com.edu.main.view.product.DeleteProduct;
import com.edu.main.view.product.SearchProduct;
import com.edu.main.view.product.AddNewProduct;
import com.edu.main.view.product.ProductReport;
import javax.swing.JFrame;

/**
 *
 * @author Gihan Chathuranga
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
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
        jPanel2 = new javax.swing.JPanel();
        displayDesktopPane = new javax.swing.JDesktopPane();
        jPanel3 = new javax.swing.JPanel();
        productPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        addproductbutton = new javax.swing.JLabel();
        productreportButton = new javax.swing.JLabel();
        searchproductButton = new javax.swing.JLabel();
        updateproductButton = new javax.swing.JLabel();
        deleteproductButton = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        posButton = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        customerPanel = new javax.swing.JPanel();
        addcustomerButton = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        searchcustomerButton = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        updatecustomerButton = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        deletecustomerButton = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        customerreportButton = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        viewMenu = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        repoartMenu = new javax.swing.JMenu();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(960, 630));
        setSize(new java.awt.Dimension(765, 475));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1470, 540));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 100));

        javax.swing.GroupLayout displayDesktopPaneLayout = new javax.swing.GroupLayout(displayDesktopPane);
        displayDesktopPane.setLayout(displayDesktopPaneLayout);
        displayDesktopPaneLayout.setHorizontalGroup(
            displayDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1370, Short.MAX_VALUE)
        );
        displayDesktopPaneLayout.setVerticalGroup(
            displayDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        jPanel1.add(displayDesktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 1370, 490));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(1000, 100));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productPanel.setLayout(null);

        jLabel2.setText("Add New Product");
        productPanel.add(jLabel2);
        jLabel2.setBounds(10, 80, 100, 14);

        jLabel4.setText("Search Product");
        productPanel.add(jLabel4);
        jLabel4.setBounds(120, 80, 100, 14);

        jLabel6.setText("Update Product");
        productPanel.add(jLabel6);
        jLabel6.setBounds(220, 80, 100, 14);

        jLabel8.setText("Delete Product");
        productPanel.add(jLabel8);
        jLabel8.setBounds(320, 80, 90, 14);

        jLabel10.setText("Product Repoart");
        productPanel.add(jLabel10);
        jLabel10.setBounds(410, 80, 100, 14);

        addproductbutton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gihan Chathuranga\\Desktop\\Temp\\DEF.png")); // NOI18N
        addproductbutton.setMinimumSize(new java.awt.Dimension(0, 0));
        addproductbutton.setPreferredSize(new java.awt.Dimension(60, 45));
        addproductbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addproductbuttonMouseClicked(evt);
            }
        });
        productPanel.add(addproductbutton);
        addproductbutton.setBounds(420, 10, 70, 60);

        productreportButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gihan Chathuranga\\Desktop\\Temp\\DEF.png")); // NOI18N
        productreportButton.setText("jLabel1");
        productreportButton.setMinimumSize(new java.awt.Dimension(0, 0));
        productreportButton.setPreferredSize(new java.awt.Dimension(60, 45));
        productreportButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productreportButtonMouseClicked(evt);
            }
        });
        productPanel.add(productreportButton);
        productreportButton.setBounds(320, 10, 70, 60);

        searchproductButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gihan Chathuranga\\Desktop\\Temp\\DEF.png")); // NOI18N
        searchproductButton.setText("jLabel1");
        searchproductButton.setMinimumSize(new java.awt.Dimension(0, 0));
        searchproductButton.setPreferredSize(new java.awt.Dimension(60, 45));
        searchproductButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchproductButtonMouseClicked(evt);
            }
        });
        productPanel.add(searchproductButton);
        searchproductButton.setBounds(220, 10, 70, 60);

        updateproductButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gihan Chathuranga\\Desktop\\Temp\\DEF.png")); // NOI18N
        updateproductButton.setText("jLabel1");
        updateproductButton.setMinimumSize(new java.awt.Dimension(0, 0));
        updateproductButton.setPreferredSize(new java.awt.Dimension(60, 45));
        updateproductButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateproductButtonMouseClicked(evt);
            }
        });
        productPanel.add(updateproductButton);
        updateproductButton.setBounds(120, 10, 70, 60);

        deleteproductButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gihan Chathuranga\\Desktop\\Temp\\DEF.png")); // NOI18N
        deleteproductButton.setText("jLabel1");
        deleteproductButton.setMinimumSize(new java.awt.Dimension(0, 0));
        deleteproductButton.setPreferredSize(new java.awt.Dimension(60, 45));
        deleteproductButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteproductButtonMouseClicked(evt);
            }
        });
        productPanel.add(deleteproductButton);
        deleteproductButton.setBounds(20, 10, 70, 60);

        jPanel3.add(productPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 104));

        jPanel6.setPreferredSize(new java.awt.Dimension(164, 105));

        jLabel22.setText("Poin of Sale");

        posButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gihan Chathuranga\\Desktop\\Temp\\DEF.png")); // NOI18N
        posButton.setText("jLabel1");
        posButton.setMinimumSize(new java.awt.Dimension(0, 0));
        posButton.setPreferredSize(new java.awt.Dimension(60, 45));
        posButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                posButtonMouseClicked(evt);
            }
        });

        jLabel23.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gihan Chathuranga\\Desktop\\Temp\\DEF.png")); // NOI18N
        jLabel23.setText("jLabel1");
        jLabel23.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel23.setPreferredSize(new java.awt.Dimension(60, 45));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });

        jLabel24.setText("Payment");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(posButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 52, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(posButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel24))
                .addGap(1, 1, 1))
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, 250, -1));

        customerPanel.setLayout(null);

        addcustomerButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gihan Chathuranga\\Desktop\\Temp\\DEF.png")); // NOI18N
        addcustomerButton.setText("jLabel1");
        addcustomerButton.setMinimumSize(new java.awt.Dimension(0, 0));
        addcustomerButton.setPreferredSize(new java.awt.Dimension(60, 45));
        addcustomerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addcustomerButtonMouseClicked(evt);
            }
        });
        customerPanel.add(addcustomerButton);
        addcustomerButton.setBounds(30, 10, 68, 62);

        jLabel26.setText("Add New Customer");
        customerPanel.add(jLabel26);
        jLabel26.setBounds(10, 80, 110, 14);

        searchcustomerButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gihan Chathuranga\\Desktop\\Temp\\DEF.png")); // NOI18N
        searchcustomerButton.setText("jLabel1");
        searchcustomerButton.setMinimumSize(new java.awt.Dimension(0, 0));
        searchcustomerButton.setPreferredSize(new java.awt.Dimension(60, 45));
        searchcustomerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchcustomerButtonMouseClicked(evt);
            }
        });
        customerPanel.add(searchcustomerButton);
        searchcustomerButton.setBounds(140, 10, 69, 62);

        jLabel28.setText("Search Customer");
        customerPanel.add(jLabel28);
        jLabel28.setBounds(130, 80, 100, 14);

        updatecustomerButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gihan Chathuranga\\Desktop\\Temp\\DEF.png")); // NOI18N
        updatecustomerButton.setText("jLabel1");
        updatecustomerButton.setMinimumSize(new java.awt.Dimension(0, 0));
        updatecustomerButton.setPreferredSize(new java.awt.Dimension(60, 45));
        updatecustomerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatecustomerButtonMouseClicked(evt);
            }
        });
        customerPanel.add(updatecustomerButton);
        updatecustomerButton.setBounds(250, 10, 69, 62);

        jLabel30.setText("Update Customer");
        customerPanel.add(jLabel30);
        jLabel30.setBounds(240, 80, 100, 14);

        deletecustomerButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gihan Chathuranga\\Desktop\\Temp\\DEF.png")); // NOI18N
        deletecustomerButton.setText("jLabel1");
        deletecustomerButton.setMinimumSize(new java.awt.Dimension(0, 0));
        deletecustomerButton.setPreferredSize(new java.awt.Dimension(60, 45));
        deletecustomerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletecustomerButtonMouseClicked(evt);
            }
        });
        customerPanel.add(deletecustomerButton);
        deletecustomerButton.setBounds(360, 10, 69, 62);

        jLabel32.setText("Delete Customer");
        customerPanel.add(jLabel32);
        jLabel32.setBounds(350, 80, 100, 14);

        customerreportButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gihan Chathuranga\\Desktop\\Temp\\DEF.png")); // NOI18N
        customerreportButton.setText("jLabel1");
        customerreportButton.setMinimumSize(new java.awt.Dimension(0, 0));
        customerreportButton.setPreferredSize(new java.awt.Dimension(60, 45));
        customerreportButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerreportButtonMouseClicked(evt);
            }
        });
        customerPanel.add(customerreportButton);
        customerreportButton.setBounds(470, 10, 69, 62);

        jLabel34.setText("Customer Repoart");
        customerPanel.add(jLabel34);
        jLabel34.setBounds(460, 80, 110, 14);

        jPanel3.add(customerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 580, 104));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1370, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 620));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1370, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 1370, 90));

        fileMenu.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("New Product");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem1);

        jMenuItem2.setText("New Customer");
        fileMenu.add(jMenuItem2);

        jMenuItem3.setText("New User");
        fileMenu.add(jMenuItem3);

        jMenuItem4.setText("Purche Product");
        fileMenu.add(jMenuItem4);

        jMenuItem5.setText("Payment");
        fileMenu.add(jMenuItem5);

        jMenuItem6.setText("Print");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem6);

        jMenuBar1.add(fileMenu);

        editMenu.setText("Edit");

        jMenuItem7.setText("Update User");
        editMenu.add(jMenuItem7);

        jMenuItem8.setText("Remove User");
        editMenu.add(jMenuItem8);
        editMenu.add(jSeparator1);

        jMenuItem9.setText("Update Product");
        editMenu.add(jMenuItem9);

        jMenuItem10.setText("Remove Product");
        editMenu.add(jMenuItem10);
        editMenu.add(jSeparator2);

        jMenuItem11.setText("Update Customer");
        editMenu.add(jMenuItem11);

        jMenuItem12.setText("Remove Customer");
        editMenu.add(jMenuItem12);

        jMenuBar1.add(editMenu);

        viewMenu.setText("View");

        jMenu6.setText("Search User");

        jMenuItem13.setText("By Name");
        jMenu6.add(jMenuItem13);

        jMenuItem14.setText("By ID");
        jMenu6.add(jMenuItem14);

        jMenuItem15.setText("By Type");
        jMenu6.add(jMenuItem15);

        viewMenu.add(jMenu6);

        jMenu7.setText("Search Product");

        jMenuItem16.setText("By Name");
        jMenu7.add(jMenuItem16);

        jMenuItem17.setText("By ID");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem17);

        jMenuItem20.setText("By Type");
        jMenu7.add(jMenuItem20);

        viewMenu.add(jMenu7);

        jMenu8.setText("Search Customer");

        jMenuItem18.setText("By Name");
        jMenu8.add(jMenuItem18);

        jMenuItem19.setText("By ID");
        jMenu8.add(jMenuItem19);

        viewMenu.add(jMenu8);

        jMenuBar1.add(viewMenu);

        repoartMenu.setText("Report");

        jMenuItem21.setText("Product Repoart");
        repoartMenu.add(jMenuItem21);

        jMenuItem22.setText("Customer Repoart");
        repoartMenu.add(jMenuItem22);

        jMenuBar1.add(repoartMenu);

        helpMenu.setText("Help");

        jMenuItem23.setText("Shortcuts");
        helpMenu.add(jMenuItem23);

        jMenuItem24.setText("About Us");
        helpMenu.add(jMenuItem24);

        jMenuBar1.add(helpMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void addproductbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addproductbuttonMouseClicked
        displayDesktopPane.removeAll();
        AddNewProduct obj=new AddNewProduct();
        displayDesktopPane.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_addproductbuttonMouseClicked

    private void searchproductButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchproductButtonMouseClicked
        displayDesktopPane.removeAll();
        SearchProduct obj=new SearchProduct();
        displayDesktopPane.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_searchproductButtonMouseClicked

    private void updateproductButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateproductButtonMouseClicked
        displayDesktopPane.removeAll();
        UpdateProduct obj=new UpdateProduct();
        displayDesktopPane.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_updateproductButtonMouseClicked

    public void updateProductedditButton(){
        System.out.println("oooooo");
        displayDesktopPane.removeAll();
        UpdateProduct obj=new UpdateProduct();
        displayDesktopPane.add(obj);
        obj.setVisible(true);
    }
    
    private void deleteproductButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteproductButtonMouseClicked
        displayDesktopPane.removeAll();
        DeleteProduct obj=new DeleteProduct();
        displayDesktopPane.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_deleteproductButtonMouseClicked

    private void productreportButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productreportButtonMouseClicked
        displayDesktopPane.removeAll();
        ProductReport obj=new ProductReport();
        displayDesktopPane.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_productreportButtonMouseClicked

    private void addcustomerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addcustomerButtonMouseClicked
        displayDesktopPane.removeAll();
        AddNewCustomer obj=new AddNewCustomer();
        displayDesktopPane.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_addcustomerButtonMouseClicked

    private void searchcustomerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchcustomerButtonMouseClicked
        displayDesktopPane.removeAll();
        SearchCustomer obj=new SearchCustomer();
        displayDesktopPane.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_searchcustomerButtonMouseClicked

    private void updatecustomerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatecustomerButtonMouseClicked
        displayDesktopPane.removeAll();
        UpdateCustomer obj=new UpdateCustomer();
        displayDesktopPane.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_updatecustomerButtonMouseClicked

    private void deletecustomerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletecustomerButtonMouseClicked
        displayDesktopPane.removeAll();
        DeleteCustomer obj=new DeleteCustomer();
        displayDesktopPane.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_deletecustomerButtonMouseClicked

    private void customerreportButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerreportButtonMouseClicked
        // TODO add your handling code here:
        displayDesktopPane.removeAll();
        CustomerReport obj=new CustomerReport();
        displayDesktopPane.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_customerreportButtonMouseClicked

    private void posButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_posButtonMouseClicked
        displayDesktopPane.removeAll();
        Purchase obj=new Purchase();
        displayDesktopPane.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_posButtonMouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        displayDesktopPane.removeAll();
        Payment obj=new Payment();
        displayDesktopPane.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_jLabel23MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                MainWindow mainWindow = new MainWindow();
//                mainWindow.setExtendedState(JFrame.MAXIMIZED_BOTH);
//                mainWindow.setVisible(true);
                new MainWindow().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addcustomerButton;
    private javax.swing.JLabel addproductbutton;
    private javax.swing.JPanel customerPanel;
    private javax.swing.JLabel customerreportButton;
    private javax.swing.JLabel deletecustomerButton;
    private javax.swing.JLabel deleteproductButton;
    private javax.swing.JDesktopPane displayDesktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel posButton;
    private javax.swing.JPanel productPanel;
    private javax.swing.JLabel productreportButton;
    private javax.swing.JMenu repoartMenu;
    private javax.swing.JLabel searchcustomerButton;
    private javax.swing.JLabel searchproductButton;
    private javax.swing.JLabel updatecustomerButton;
    private javax.swing.JLabel updateproductButton;
    private javax.swing.JMenu viewMenu;
    // End of variables declaration//GEN-END:variables
}
