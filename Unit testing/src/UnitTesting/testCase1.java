package UnitTesting;
import org.junit.Test;
import static org.junit.Assert.*;  
import UnitTesting.UnitTesting1;
  
public class testCase1 {  
  
    @Test  
    public void testFindMax(){  
        assertEquals(4,UnitTesting1.findMax(new int[]{1,3,4,2}));  
        assertEquals(-1,UnitTesting1.findMax(new int[]{-12,-1,-3,-4,-2}));  
    } 
    @Test
    public void testadd() {
    	assertEquals(30,UnitTesting1.add(10, 10));
    	assertEquals("working",30,UnitTesting1.add(20, 10));
    }
}  