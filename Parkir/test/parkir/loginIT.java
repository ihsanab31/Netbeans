/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkir;
import parkir.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ihsan-450
 */
public class loginIT {
    
    public loginIT() {
          }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of login method, of class login.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String a = "";
        String b ="";
        login instance = new login();
        instance.login(a,b);
        assertEquals(a,b);
         
         }
        @Test
    public void testLogin1() {
        System.out.println("login");
        String a = "1011";
        String b ="02030405ab";
        login instance = new login();
        String a1 = "1011";
        String b1 = "02030405ab";
        instance.login(a, b);
        assertEquals(b,b1);
         
         }
    
}
