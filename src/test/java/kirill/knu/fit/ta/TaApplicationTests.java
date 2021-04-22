package kirill.knu.fit.ta;

import kirill.knu.fit.ta.lab2.EquationForLab2;
import kirill.knu.fit.ta.lab3.TaskForLab3;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TaApplicationTests {

    @Autowired
    EquationForLab2 equationForLab2;
    //TaskForLab3 tfl3;
    
        @Test
	void contextLoads() {
	}
        
        /*@Test
        void testforlab2(){
        assertEquals(Integer.MAX_VALUE,equationForLab2.equation(0,0,0,0));
        assertEquals(2,equationForLab2.equation(0,4,0,2));
        assertEquals(0.1,equationForLab2.equation(2,-3,1,3));
        
        }*/
        
        @Test
        void testforlab2(){
        assertEquals(-1,equationForLab2.equation(2));
        assertEquals(0,equationForLab2.equation(0));
        
        }

        @Test
        void testforlab3CheckForNegatives(){
            
        TaskForLab3 tfl3 = new TaskForLab3();
        
        int[] x = {1, 2, 3};
        assertEquals("" + 0,tfl3.checkForNegative(x));
        
        int[] y = {1, -2, 3, -4, 5, 0};  
        assertEquals("" + 2,tfl3.checkForNegative(y));
        
        int[] z = {-1, -2, -3, -4};  
        assertEquals("" + 4,tfl3.checkForNegative(z));
        
        int[] xz = {};  
        assertEquals("" + 0,tfl3.checkForNegative(xz));
        }
        
        
        @Test
        void testforlab3Check(){
        
        TaskForLab3 tfl3 = new TaskForLab3();
            
        int[] x = {1, 2, 3};
        assertEquals("" + 0,tfl3.check(x));
        
        int[] y = {-1, -2, 3, -4, 5, 0};  
        assertEquals("" + 2,tfl3.check(y));
        
        int[] z = {-1, -2, -3};  
        assertEquals("" + 3,tfl3.check(z));
        }
}
