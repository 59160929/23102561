/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectOX;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author 59160929
 */
class connection {
    public static void main(String[] args) throws SQLException{
        new connection ().getConnection();
    }

    static PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void getConnection() throws SQLException {
             PreparedStatement pst;
           String serverName = "db144.hostinger.in.th";
           String mydatabase = "u572797458_soft";
           String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
           String username = "u572797458_soft";
           String password = "password0880";
           Connection connection = DriverManager.getConnection(url, username, password);
           connection.createStatement();
        
    }
}
