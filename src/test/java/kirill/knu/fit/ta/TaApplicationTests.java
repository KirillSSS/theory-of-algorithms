package kirill.knu.fit.ta;

import kirill.knu.fit.ta.lab2.EquationForLab2;
import kirill.knu.fit.ta.lab3.TaskForLab3;
import kirill.knu.fit.ta.lab4.TaskForLab4;
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
        
        assertEquals(-0.40406102f,equationForLab2.equation(1f));
        assertEquals(1.6329932f,equationForLab2.equation(3f));
        assertEquals(0.40406102f,equationForLab2.equation(4f));
        assertEquals(0.027454766f,equationForLab2.equation(15f));
        
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
        
        
        @Test
        void testforlab4(){
        
        TaskForLab4 tfl4 = new TaskForLab4();
        String t = tfl4.text;
            
        //Test For Task4
        
        assertEquals("",tfl4.Task4(tfl4.getList(t), 0, 1));
        assertEquals("1: the = 22 | 2: to = 18 | ",tfl4.Task4(tfl4.getList(t), 2, 1));
        assertEquals("1: the = 22 | 2: to = 18 | 3: and = 15 | ",tfl4.Task4(tfl4.getList(t), 3, 1));
        assertEquals("1: the = 22 | 2: to = 18 | 3: and = 15 | 4: of = 13 | ",tfl4.Task4(tfl4.getList(t), 4, 1));
        assertEquals("1: the = 22 | 2: to = 18 | 3: and = 15 | 4: of = 13 | 5: internet = 9 | ",tfl4.Task4(tfl4.getList(t), 5, 1));
        
        assertEquals("",tfl4.Task4(tfl4.getList(t), 0, 0));
        assertEquals("1: a = 122 | 2: in = 53 | ",tfl4.Task4(tfl4.getList(t), 2, 0));
        assertEquals("1: a = 122 | 2: in = 53 | 3: the = 29 | ",tfl4.Task4(tfl4.getList(t), 3, 0));
        assertEquals("1: a = 122 | 2: in = 53 | 3: the = 29 | 4: on = 27 | ",tfl4.Task4(tfl4.getList(t), 4, 0));
        assertEquals("1: a = 122 | 2: in = 53 | 3: the = 29 | 4: on = 27 | 5: to = 25 | ",tfl4.Task4(tfl4.getList(t), 5, 0));
        
        //Test For Task5
        
        String text5 = "airq appleq bananaq ping-pongq crazyq greenq boubleq doubleq";
        
        assertEquals("4",tfl4.Task5(text5, "a"));
        assertEquals("5",tfl4.Task5(text5, "b"));
        assertEquals("7",tfl4.Task5(text5, "c"));
        assertEquals("6",tfl4.Task5(text5, "p"));
        assertEquals("8",tfl4.Task5(text5, "w"));
        assertEquals("0",tfl4.Task5(text5, "q"));
        
        //Test For Task6
        
        String text6 = "air apple banana ping-pong crazy green bouble double";
        
        assertEquals("2",tfl4.Task6(text6, 4));
        assertEquals("2",tfl4.Task6(text6, 3));
        assertEquals("0",tfl4.Task6(text6, 7));
        assertEquals("0",tfl4.Task6(text6, 0));
        assertEquals("3",tfl4.Task6(text6, 5));
        
        //Test For Task7
        
        assertEquals("",tfl4.Task7(tfl4.getList(tfl4.text), 0));
        assertEquals("1: the = 29 | 2: ing = 21 | ",tfl4.Task7(tfl4.getList(tfl4.text), 2));
        assertEquals("1: the = 29 | 2: ing = 21 | 3: and = 16 | ",tfl4.Task7(tfl4.getList(tfl4.text), 3));
        assertEquals("1: the = 29 | 2: ing = 21 | 3: and = 16 | 4: int = 15 | ",tfl4.Task7(tfl4.getList(tfl4.text), 4));
        }
}
