
package banking;

import banking.Banking;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestBank {
    
    Banking b;
    
    public TestBank() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        b=new Banking();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void testDeposit() {
         assertEquals(1000,b.deposit(1000),0.01);
     
     }
     
     @Test 
     public void testWithdraw() {
         
         assertEquals(2000,b.deposit(2000),0.01);
         assertEquals(1000,b.withdraw(1000),0.01);
     
     }
       
     
     
}
