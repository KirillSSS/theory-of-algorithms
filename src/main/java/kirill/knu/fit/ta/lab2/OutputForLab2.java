/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kirill.knu.fit.ta.lab2;

import java.text.DecimalFormat;
import org.springframework.stereotype.Service;

/**
 *
 * @author savch
 */
@Service
public class OutputForLab2 {
    
    DecimalFormat df = new DecimalFormat("###.##");
    
    public String output(String xString){
        
        if(xString.equals("")){return "Please enter a new x";}
        
        Float x = Float.parseFloat(xString);      
        
        if(x<0){return "Wrong x. x must be greater than zero";}
        else {return df.format(EquationForLab2.equation(x));}
            
    
    }
    
}
