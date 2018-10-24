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
public class LoginService {

    static String serverName = "db144.hostinger.in.th";
    static String mydatabase = "u572797458_soft";
    static String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
    static String username = "u572797458_soft";
    static String password = "password0880";

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
     public static boolean checkNull(String username, String Password) {
        if (username.equals("")|| Password.equals("")== true) {
            return true;
        } else {
            return false;
        }
    }
}
