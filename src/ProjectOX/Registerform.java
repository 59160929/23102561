package ProjectOX;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Registerform extends javax.swing.JFrame {

    /**
     * Creates new form Registrerform
     */
    public Registerform() {
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

        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        Register1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Usernamefield = new javax.swing.JTextField();
        Repasswordfield = new javax.swing.JPasswordField();
        Passwordfield = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        Clear = new javax.swing.JButton();
        Register = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1028, 957));
        getContentPane().setLayout(null);

        jPanel5.setBackground(new java.awt.Color(255, 63, 52));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 130, 1040, 60);

        jPanel2.setBackground(new java.awt.Color(239, 87, 119));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 72)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Register");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(30, 10, 310, 110);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1030, 130);

        jPanel4.setBackground(new java.awt.Color(15, 188, 249));
        jPanel4.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/register.png"))); // NOI18N
        jPanel4.add(jLabel2);
        jLabel2.setBounds(0, 30, 530, 500);

        jPanel7.setBackground(new java.awt.Color(255, 221, 89));

        Register1.setBackground(new java.awt.Color(5, 196, 107));
        Register1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Register1.setText("Back");
        Register1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Register1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(248, Short.MAX_VALUE)
                .addComponent(Register1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(230, Short.MAX_VALUE)
                .addComponent(Register1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        jPanel4.add(jPanel7);
        jPanel7.setBounds(-10, 360, 540, 410);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 190, 480, 890);

        jPanel1.setBackground(new java.awt.Color(75, 207, 250));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Username");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 40, 220, 70);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Password");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 190, 220, 70);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Re-Password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 330, 310, 70);

        Usernamefield.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Usernamefield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        Usernamefield.setOpaque(false);
        Usernamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernamefieldActionPerformed(evt);
            }
        });
        jPanel1.add(Usernamefield);
        Usernamefield.setBounds(100, 100, 410, 40);

        Repasswordfield.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Repasswordfield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        Repasswordfield.setOpaque(false);
        Repasswordfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepasswordfieldActionPerformed(evt);
            }
        });
        jPanel1.add(Repasswordfield);
        Repasswordfield.setBounds(100, 400, 410, 50);

        Passwordfield.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Passwordfield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        Passwordfield.setOpaque(false);
        Passwordfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordfieldActionPerformed(evt);
            }
        });
        jPanel1.add(Passwordfield);
        Passwordfield.setBounds(100, 250, 410, 50);

        jPanel3.setBackground(new java.awt.Color(255, 221, 89));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(-480, 640, 0, 0);

        jPanel6.setBackground(new java.awt.Color(255, 221, 89));

        Clear.setBackground(new java.awt.Color(245, 59, 87));
        Clear.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Register.setBackground(new java.awt.Color(233, 30, 99));
        Register.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Register.setText("Register");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(417, Short.MAX_VALUE)
                .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
        );

        jPanel1.add(jPanel6);
        jPanel6.setBounds(-390, 480, 1000, 300);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(480, 190, 550, 800);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UsernamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernamefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernamefieldActionPerformed

    private void RepasswordfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepasswordfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RepasswordfieldActionPerformed

    private void PasswordfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordfieldActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        ClearFill();
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearActionPerformed

    private void Register1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Register1ActionPerformed
        new LoginForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Register1ActionPerformed
    
    
    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed

        PreparedStatement pst;

        if (RegisterService.checkNull(Usernamefield.getText(), String.valueOf(Passwordfield.getPassword()), String.valueOf(Repasswordfield.getPassword())) == true) {
            JOptionPane.showMessageDialog(null, "กรุณากรอกข้อมูลให้ครบ !");

        } else {
            if (RegisterService.UsernameLength(Usernamefield.getText()) ==true) {
                JOptionPane.showMessageDialog(null, "ชื่อผู้ใช้งานต้องมีไม่น้อยกว่า 5 ตัว !");

            } else {
                if (RegisterService.PasswordLenght(new String(Passwordfield.getPassword()))==true) {
                    JOptionPane.showMessageDialog(null, "รหัสผ่านต้องมีไม่น้อยกว่า 8 ตัว !");

                } else if (new String(Passwordfield.getPassword()).equals(new String(Repasswordfield.getPassword()))) {

                    try {

                        if (RegisterService.checkUsernameExist(Usernamefield.getText()) == true) {
                            JOptionPane.showMessageDialog(null, "ชื่อผู้ใช้งานซ้ำ !");
                        } else {
                            RegisterService.InsertUser(Usernamefield.getText(), String.valueOf(Passwordfield.getPassword()));
                            JOptionPane.showMessageDialog(null, "ลงทะเบียนสำเร็จ !");
                            openLoginForm();  
                        }

                    } catch (Exception String) {
                        JOptionPane.showMessageDialog(null, String);

                    }

                } else {
                    JOptionPane.showMessageDialog(null, "รหัสผ่านไม่ตรงกัน !");

                }
            }
        }


    }//GEN-LAST:event_RegisterActionPerformed

    private void ClearFill() {
        Usernamefield.setText("");
        Passwordfield.setText("");
        Repasswordfield.setText("");
    }

    private void openLoginForm() throws SQLException {

        Lobbyform go = new Lobbyform();
        go.setVisible(true);
        setVisible(false);
    }

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
            java.util.logging.Logger.getLogger(Registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registerform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JPasswordField Passwordfield;
    private javax.swing.JButton Register;
    private javax.swing.JButton Register1;
    private javax.swing.JPasswordField Repasswordfield;
    private javax.swing.JTextField Usernamefield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables

}
