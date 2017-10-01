/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.main.view;

import com.edu.main.dao.user.PasswordHashing;
import com.edu.main.dbconnect.DBConnector;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

/**
 *
 * @author Gihan Chathuranga
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        //setimage();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        imagelable = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        useridTextfield = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        canclebutton = new javax.swing.JButton();
        pswdfield = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        usertypeText = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(609, 354));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        imagelable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edu/images/27-samplelogo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagelable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagelable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 320));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("User ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Password");

        useridTextfield.setText("0001");

        loginButton.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        loginButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gihan Chathuranga\\Desktop\\Temp\\New folder\\png\\24x24\\unlocked.png")); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        canclebutton.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        canclebutton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gihan Chathuranga\\Desktop\\Temp\\New folder\\png\\24x24\\block.png")); // NOI18N
        canclebutton.setText("Cancle");
        canclebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canclebuttonActionPerformed(evt);
            }
        });

        pswdfield.setText("admin");
        pswdfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswdfieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("User Type");

        usertypeText.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Shop keeper", "Cashier" }));
        usertypeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usertypeTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(canclebutton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pswdfield, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usertypeText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(useridTextfield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usertypeText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(useridTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pswdfield, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(canclebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 0, 360, 330));

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 610, 320);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        try {
            PasswordHashing ph = new PasswordHashing();
            String userType = usertypeText.getSelectedItem().toString();
            String userid = useridTextfield.getText();
            String pwda = Arrays.toString(pswdfield.getPassword());
            String pwd = ph.get_SHA_512_SecurePassword(pwda, "inter");
            String sql = "";
            Connection con = DBConnector.connection();
            Statement stm = con.createStatement();

            if (userType.equalsIgnoreCase("admin")) {
                sql = "select * from user where id='" + userid + "' and type='admin'";
                ResultSet userlist = stm.executeQuery(sql);

                if (userlist.next()) {
                    //userlist.beforeFirst();
                    if (userlist.getString("pass").equalsIgnoreCase(pwd)) {
                        MainWindowa mainWindow = new MainWindowa();
                        mainWindow.setExtendedState(JFrame.MAXIMIZED_BOTH);
                        mainWindow.setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Invalied password!");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Invalied user name!");
                }
            } else if (userType.equalsIgnoreCase("Shop keeper")) {
                sql = "select * from user where id='" + userid + "' and type='Shop keeper'";
                ResultSet userlist = stm.executeQuery(sql);

                if (userlist.next()) {
                    if (userlist.getString("pass").equalsIgnoreCase(pwd)) {
                        StocKeeprWindow mainWindow = new StocKeeprWindow();
                        mainWindow.setExtendedState(JFrame.MAXIMIZED_BOTH);
                        mainWindow.setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Invalied user password!");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Invalied user name!");

                }
            } else if (userType.equalsIgnoreCase("Cashier")) {
                sql = "select * from user where id='" + userid + "' and type='cashier'";
                ResultSet userlist = stm.executeQuery(sql);
//                userlist.next();
                if (userlist.next()){
                    if (userlist.getString("pass").equalsIgnoreCase(pwd)) {
                        CashierMainWindowa mainWindow = new CashierMainWindowa();
                        mainWindow.setExtendedState(JFrame.MAXIMIZED_BOTH);
                        mainWindow.setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Invalied user password!");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Invalied user name!");
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_loginButtonActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //setimage();
    }//GEN-LAST:event_formWindowActivated

    private void pswdfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswdfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswdfieldActionPerformed

    private void canclebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canclebuttonActionPerformed
        this.dispose();
    }//GEN-LAST:event_canclebuttonActionPerformed

    private void usertypeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usertypeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usertypeTextActionPerformed

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

            // setTheme(String themeName, String licenseKey, String logoString)
            com.jtattoo.plaf.acryl.AcrylLookAndFeel.setTheme("Black", "INSERT YOUR LICENSE KEY HERE", "my company");

            // select the Look and Feel
            UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");

            // start the demo application
            //new SimpleThemesDemo();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton canclebutton;
    private javax.swing.JLabel imagelable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField pswdfield;
    private javax.swing.JTextField useridTextfield;
    private javax.swing.JComboBox usertypeText;
    // End of variables declaration//GEN-END:variables

//    private void setimage() {
//            ImageIcon imageIcon = new ImageIcon("CV.jpg");
//        Image img = imageIcon.getImage();
//        //Image newImage = img.getScaledInstance(imagelable.getWidth(), imagelable.getHeight(), Image.SCALE_SMOOTH);
//        Image newImage = img.getScaledInstance(260, 320, Image.SCALE_SMOOTH);
//        ImageIcon image = new ImageIcon(newImage);
//        imagelable.setIcon(image);    
//    }
}
