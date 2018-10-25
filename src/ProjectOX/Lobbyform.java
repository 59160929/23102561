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
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Admin
 */
public class Lobbyform extends javax.swing.JFrame {

    /**
     * Creates new form Lobby
     */
    public Lobbyform() throws SQLException {
        PreparedStatement pst;
        initComponents();
        ShowIDRoom();

    }

    public void ShowIDRoom() throws SQLException {
        ArrayList result = new ArrayList();
        try {
            String serverName = "db144.hostinger.in.th";
            String mydatabase = "u572797458_soft";
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            String username = "u572797458_soft";
            String password = "password0880";
            Connection connection = DriverManager.getConnection(url, username, password);
            connection.createStatement();

            //String sql="SELECT idroom  FROM room ;";
            String sql = "SELECT idroom,NameRoom,StatusRoom  FROM room ;";
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            int columnCount = rs.getMetaData().getColumnCount();
            DefaultListModel listModel = new DefaultListModel();
            String idroom = "";
            String nameroom = "";
            String statusroom = "";
            int row = 0;
            while (rs.next()) {
                result.add(rs.getString("idroom"));
                if (rs.getString("idroom").length() == 1) {
                    idroom = "                                                         ";
                    if (rs.getString("NameRoom").length() == 12) {
                        nameroom = "                                             ";
                    } else if (rs.getString("NameRoom").length() == 11) {
                        nameroom = "                                                ";
                    } else if (rs.getString("NameRoom").length() == 10) {
                        nameroom = "                                              ";
                    } else if (rs.getString("NameRoom").length() == 9) {
                        nameroom = "                                                 ";
                    } else if (rs.getString("NameRoom").length() == 8) {
                        nameroom = "                                                   ";
                    } else if (rs.getString("NameRoom").length() == 7) {
                        nameroom = "                                                       ";
                    } else if (rs.getString("NameRoom").length() == 6) {
                        nameroom = "                                                      ";
                    } else if (rs.getString("NameRoom").length() == 5) {
                        nameroom = "                                                        ";
                    } else if (rs.getString("NameRoom").length() == 4) {
                        nameroom = "                                                           ";
                    } else if (rs.getString("NameRoom").length() == 3) {
                        nameroom = "                                                              ";
                    } else if (rs.getString("NameRoom").length() == 2) {
                        nameroom = "                                                             ";
                    }

                } else if (rs.getString("idroom").length() == 2) {
                    idroom = "                                                       ";
                    if (rs.getString("NameRoom").length() == 12) {
                        nameroom = "                                              ";
                    } else if (rs.getString("NameRoom").length() == 11) {
                        nameroom = "                                                ";
                    } else if (rs.getString("NameRoom").length() == 10) {
                        nameroom = "                                              ";
                    } else if (rs.getString("NameRoom").length() == 9) {
                        nameroom = "                                                   ";
                    } else if (rs.getString("NameRoom").length() == 8) {
                        nameroom = "                                                    ";
                    } else if (rs.getString("NameRoom").length() == 7) {
                        nameroom = "                                                    ";
                    } else if (rs.getString("NameRoom").length() == 6) {
                        nameroom = "                                                     ";
                    } else if (rs.getString("NameRoom").length() == 5) {
                        nameroom = "                                                         ";
                    } else if (rs.getString("NameRoom").length() == 4) {
                        nameroom = "                                                           ";
                    } else if (rs.getString("NameRoom").length() == 3) {
                        nameroom = "                                                              ";
                    } else if (rs.getString("NameRoom").length() == 2) {
                        nameroom = "                                                            ";
                    }
                }

                listModel.addElement(" " + rs.getString("idroom") + idroom + rs.getString("NameRoom") + nameroom + rs.getString("StatusRoom"));

            }

//            for(int i=0;i<result.size();i++)
//            {
//                //result.add(rs.getString("idroom"));
//                listModel.addElement(result.get(i));
//                
//            }
            listRoom.setModel(listModel);

        } catch (Exception e) {

        }

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
        exitbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        profilebtn = new javax.swing.JButton();
        createroombtn = new javax.swing.JButton();
        joinroombtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listRoom = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1028, 982));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(13, 71, 161));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lobby");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 10, 150, 70);

        exitbtn.setBackground(new java.awt.Color(230, 81, 0));
        exitbtn.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        exitbtn.setText("Logout");
        exitbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });
        jPanel1.add(exitbtn);
        exitbtn.setBounds(760, 10, 210, 80);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1030, 110);

        jPanel2.setBackground(new java.awt.Color(0, 96, 100));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 110, 100, 870);

        jPanel3.setBackground(new java.awt.Color(0, 77, 64));
        jPanel3.setLayout(null);

        profilebtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        profilebtn.setText("ข้อมูลส่วนตัว");
        profilebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profilebtnActionPerformed(evt);
            }
        });
        jPanel3.add(profilebtn);
        profilebtn.setBounds(130, 720, 220, 80);

        createroombtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        createroombtn.setText("Create Room");
        createroombtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createroombtnActionPerformed(evt);
            }
        });
        jPanel3.add(createroombtn);
        createroombtn.setBounds(570, 720, 200, 80);

        joinroombtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        joinroombtn.setText("เข้าร่วมห้อง");
        joinroombtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinroombtnActionPerformed(evt);
            }
        });
        jPanel3.add(joinroombtn);
        joinroombtn.setBounds(370, 720, 180, 80);

        listRoom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(listRoom);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(120, 90, 610, 338);

        jLabel2.setBackground(new java.awt.Color(102, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Status");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(620, 30, 110, 30);

        jLabel3.setBackground(new java.awt.Color(102, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("IDRoom");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(120, 30, 110, 30);

        jLabel4.setBackground(new java.awt.Color(102, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NameRoom");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(360, 30, 110, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(100, 110, 930, 870);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed

        JDialog.setDefaultLookAndFeelDecorated(true);
        int response = JOptionPane.showConfirmDialog(null, "คุณต้องการออกจากเกมส์ใช่หรือไม่", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.NO_OPTION) {

        } else if (response == JOptionPane.YES_OPTION) {
            System.exit(0);
        }

    }//GEN-LAST:event_exitbtnActionPerformed

    private void createroombtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createroombtnActionPerformed
        new room1().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_createroombtnActionPerformed

    private void joinroombtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinroombtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joinroombtnActionPerformed

    private void profilebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilebtnActionPerformed
        new Profile().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_profilebtnActionPerformed

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
            java.util.logging.Logger.getLogger(Lobbyform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lobbyform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lobbyform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lobbyform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Lobbyform().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Lobbyform.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createroombtn;
    private javax.swing.JButton exitbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton joinroombtn;
    private javax.swing.JList<String> listRoom;
    private javax.swing.JButton profilebtn;
    // End of variables declaration//GEN-END:variables
}
