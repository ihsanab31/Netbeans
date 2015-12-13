/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkir;

import java.util.HashMap;
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
public class KmasukIT {
    
    public KmasukIT() {
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

    @Test
    public void testLahan1() {
        System.out.println("lahan1");
        int c = 89;
        int d = 1;
        Kmasuk instance = new Kmasuk();
        int exResult = c - d;
        instance.lahan1(c, d);
         assertEquals(exResult, instance);
    }

}
