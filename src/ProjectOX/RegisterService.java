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

/**
 *
 * @author 59160929
 */
public class RegisterService {

 

    public static boolean checkNull(String username, String Password, String RePassword) {
        if (username.equals("")|| Password.equals("")|| RePassword.equals("") == true) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean checkUsernameExist(String username)  throws SQLException {
         PreparedStatement pst;
        boolean russ = false;

        String CheckUser = username;
        String sql = "SELECT Username FROM u572797458_soft.Username where Username=?";
        pst = connection.prepareStatement(sql);
        pst.setString(1, CheckUser);
        ResultSet rs = pst.executeQuery();

        russ = rs.next();
        return russ;
    }
    public static boolean getuser(String username, String password) throws SQLException {
        PreparedStatement pst;
        Connection connection;

        connection = DriverManager.getConnection(db.url, db.username, db.password);
        connection.createStatement();
        pst = connection.prepareStatement("Select * from Username where Username = ? AND password= ?");
        pst.setString(1, username);
        pst.setString(2, password);
        User user = new User(username, password);
        ResultSet rs = pst.executeQuery();
        boolean result = rs.next();
        connection.close();
        return result;

    }
}