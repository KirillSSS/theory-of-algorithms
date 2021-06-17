/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kirill.knu.fit.ta;

import java.text.DecimalFormat;
import kirill.knu.fit.ta.exam.TaskForExam1;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author savch
 */
public class ExamTest {
    
    DecimalFormat df = new DecimalFormat("###.###");
        
    @Test  
    void testforexam(){
            
        TaskForExam1 tfe1 = new TaskForExam1();
            
        assertEquals(2.5,tfe1.f(10));    
        assertEquals("1,786",df.format(tfe1.f(5.717f)));
        assertEquals("0,833",df.format(tfe1.f(0)));
        assertEquals(0,tfe1.f(-5));
        assertEquals(df.format(Float.MAX_VALUE),df.format(tfe1.f(Float.MAX_VALUE)));
    }
}
