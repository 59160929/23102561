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

    public static boolean checkUsernameExist(String username) throws SQLException {

        return UserDao.checkUsernameExist(username);
    }

    public static boolean InsertUser(String username, String password) throws SQLException {

        return UserDao.InsertUser(username, password);

    }
    public static boolean UsernameLength(String username){
        int lenght = username.length();
        if(lenght < 5 ){
            return true;
        }else 
            return false;
    
    }
    public static boolean PasswordLenght(String password){
        int lenght = password.length();
        if(lenght < 8 ){
            return true;
        }else 
            return false;
    }
    
}
