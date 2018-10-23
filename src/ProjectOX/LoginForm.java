/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectOX;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LoginForm extends javax.swing.JFrame {

    public LoginForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Usernamefield = new javax.swing.JTextField();
        Passwordfield = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Clear = new javax.swing.JButton();
        Register1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1030, 860));
        setSize(new java.awt.Dimension(1200, 1200));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 118, 117));
        jPanel1.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Username");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(150, 10, 220, 70);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("Password");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(150, 80, 220, 70);

        Usernamefield.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Usernamefield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        Usernamefield.setOpaque(false);
        Usernamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernamefieldActionPerformed(evt);
            }
        });
        jPanel1.add(Usernamefield);
        Usernamefield.setBounds(380, 20, 460, 40);

        Passwordfield.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Passwordfield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        Passwordfield.setOpaque(false);
        Passwordfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordfieldActionPerformed(evt);
            }
        });
        jPanel1.add(Passwordfield);
        Passwordfield.setBounds(380, 90, 460, 50);

        login.setBackground(new java.awt.Color(255, 87, 34));
        login.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Login");
        login.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 10, 5, new java.awt.Color(0, 153, 153)));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login);
        login.setBounds(430, 160, 190, 90);

        jPanel3.setBackground(new java.awt.Color(108, 92, 231));
        jPanel3.setLayout(null);

        Clear.setBackground(new java.awt.Color(255, 63, 52));
        Clear.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Clear.setForeground(new java.awt.Color(255, 255, 255));
        Clear.setText("Clear");
        Clear.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 10, 5, new java.awt.Color(0, 0, 0)));
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel3.add(Clear);
        Clear.setBounds(620, 0, 216, 90);

        Register1.setBackground(new java.awt.Color(51, 105, 30));
        Register1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Register1.setForeground(new java.awt.Color(255, 255, 255));
        Register1.setText("Register");
        Register1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 10, 5, new java.awt.Color(0, 0, 0)));
        Register1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Register1ActionPerformed(evt);
            }
        });
        jPanel3.add(Register1);
        Register1.setBounds(220, 0, 216, 90);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 260, 1030, 190);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 440, 1030, 360);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Game");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(102, 0, 204)));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(530, 180, 270, 120);

        jPanel11.setBackground(new java.awt.Color(255, 63, 52));
        jPanel11.setLayout(null);

        jPanel12.setBackground(new java.awt.Color(162, 155, 254));
        jPanel12.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 72)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Login");
        jPanel12.add(jLabel7);
        jLabel7.setBounds(110, 0, 230, 110);

        jPanel11.add(jPanel12);
        jPanel12.setBounds(580, 0, 450, 130);

        jPanel7.setBackground(new java.awt.Color(52, 231, 228));
        jPanel7.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("OX Game");
        jPanel7.add(jLabel1);
        jLabel1.setBounds(100, 10, 240, 80);

        jPanel11.add(jPanel7);
        jPanel7.setBounds(70, 10, 440, 0);

        getContentPane().add(jPanel11);
        jPanel11.setBounds(0, 0, 1060, 130);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Logo-xo.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 140, 750, 290);

        jPanel8.setBackground(new java.awt.Color(255, 152, 0));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel8);
        jPanel8.setBounds(0, 130, 1040, 310);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UsernamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernamefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernamefieldActionPerformed

    private void PasswordfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordfieldActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        Usernamefield.setText("");
        Passwordfield.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void Register1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Register1ActionPerformed
        //TODO add your handling code here:
        new Registerform().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Register1ActionPerformed
    public boolean IsUserMatch() throws SQLException {
        boolean Result = Usernamefield.getText().equals(new String(Passwordfield.getPassword()));
        return Result;

    }

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed

        try {

            if (LoginService.getuser(Usernamefield.getText(),String.valueOf(Passwordfield.getPassword())) == true) {
                if (IsUserMatch() == true);
                {
                    JOptionPane.showMessageDialog(this, "ลงชื่อเข้าใจสำเร็จ");
                }
                setVisible(false);
                Lobbyform mf = new Lobbyform();
                mf.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Username หรือ Password ผิดพลาด");
                Usernamefield.setText("");
                Passwordfield.setText("");
            }
        } catch (SQLException ex) {

        }

    }//GEN-LAST:event_loginActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JPasswordField Passwordfield;
    private javax.swing.JButton Register1;
    private javax.swing.JTextField Usernamefield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JButton login;
    // End of variables declaration//GEN-END:variables
}
