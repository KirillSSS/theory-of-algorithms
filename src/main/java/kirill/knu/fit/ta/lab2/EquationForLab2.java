/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kirill.knu.fit.ta.lab2;

import org.springframework.stereotype.Component;

/**
 *
 * @author savch
 */

@Component
public class EquationForLab2 {
    
    public static float equation(float a, float b, float c, float x){
        
        float d = b * b - 4 * a * c;
        
        if ((a * x * x + b * x + c) == 0) {return Integer.MAX_VALUE;}
        return d / (a * x * x + b * x + c);
    }
}
