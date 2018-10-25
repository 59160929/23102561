/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectOX;

import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author KirkThunder
 */
public class RegisterServiceTest {
    
       
     @Test
   public void testchecknull(){
       RegisterService instance = new RegisterService();
       String User = "samman";
       String Pass = "12345678";
       String  Repass = "12345678";
       boolean result = instance.checkNull(User,Pass,Repass);
       assertEquals(false, result);
       
       
       User = "";
       Pass = "";
       Repass = "";
       result = instance.checkNull(User,Pass,Repass);
       assertEquals(true, result);
       
       User = "aaaaaaa";
       Pass = "";
       Repass = "";
       result = instance.checkNull(User,Pass,Repass);
       assertEquals(true, result);
       
       User = "";
       Pass = "aaaaaaa";
       Repass = "";
       result = instance.checkNull(User,Pass,Repass);
       assertEquals(true, result);
       
       User = "";
       Pass = "";
       Repass = "aaaaaaaa";
       result = instance.checkNull(User,Pass,Repass);
       assertEquals(true, result);
       
       User = "aaaaaaa";
       Pass = "bbbbbbbbb";
       Repass = "";
       result = instance.checkNull(User,Pass,Repass);
       assertEquals(true, result);
       
       User = "aaaaaaaaa";
       Pass = "";
       Repass = "sfawaaaaa";
       result = instance.checkNull(User,Pass,Repass);
       assertEquals(true, result);
       
       User = "";
       Pass = "awdawdww";
       Repass = "dddddddd";
       result = instance.checkNull(User,Pass,Repass);
       assertEquals(true, result);
       
   }
   
    @Test
   public void testcheckUsernameExist() throws SQLException {
        
       RegisterService instance = new RegisterService();
        String User = "Test1";
        assertEquals(true, instance.checkUsernameExist(User));
        assertEquals(false, instance.checkUsernameExist("sammy"));
    }
   
     
  
    
  
   
    
   
    
}
