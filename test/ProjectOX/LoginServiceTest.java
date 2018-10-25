
package ProjectOX;

import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class LoginServiceTest {
     @Test
   public void testcheckNull(){
      LoginService instance = new LoginService();
       String User = "samman";
       String Pass = "12345678";
      
       boolean result = instance.checkNull(User,Pass);
       assertEquals(false, result);
       
       
       User = "";
       Pass = "";
       result = instance.checkNull(User,Pass);
       assertEquals(true, result);
       
        User = "dawdawdawd";
       Pass = "";
       result = instance.checkNull(User,Pass);
       assertEquals(true, result);
       
        User = "";
       Pass = "wafafwawfaw";
       result = instance.checkNull(User,Pass);
       assertEquals(true, result);
       
   }
   
    public void testgetuser() throws SQLException  {
        
       LoginService instance = new LoginService();
        String User = "sammammn" ;
        String Pass = "12345678";
        assertEquals(false, instance.getuser(User,Pass));
        User = "test1" ;
        Pass = "12345678";
        assertEquals(false, instance.getuser(User,Pass));
        User = "test1" ;
        Pass = "test55555555";
        assertEquals(false, instance.getuser(User,Pass));
        User = "test1" ;
        Pass = "testtest";
        assertEquals(false, instance.getuser(User,Pass));
    }
    
}
