package kirill.knu.fit.ta;

import kirill.knu.fit.ta.lab2.EquationForLab2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TaApplicationTests {

    @Autowired
    EquationForLab2 equationForLab2;
    
        @Test
	void contextLoads() {
	}
        
        @Test
        void testforlab2(){
        assertEquals(Integer.MAX_VALUE,equationForLab2.equation(0,0,0,0));
        assertEquals(2,equationForLab2.equation(0,4,0,2));
        assertEquals(0.1,equationForLab2.equation(2,-3,1,3));
        
        }

}
