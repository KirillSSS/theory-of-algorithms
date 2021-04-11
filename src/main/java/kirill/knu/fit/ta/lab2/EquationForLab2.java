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
    
    /*public static float equation(float a, float b, float c, float x){
    
    float d = b * b - 4 * a * c;
    
    if ((a * x * x + b * x + c) == 0) {return Integer.MAX_VALUE;}
    return d / (a * x * x + b * x + c);
    }*/
    
    public static float equation(float x){
    
        float a = 2;
        float b = -3;
        float c = -6;
        float d = 8;
        
        double y1 = Math.sqrt(d * x);
        
        double y2 = a * Math.pow(x,2) + b * x + c;
        
        if (((y1 / y2)<= 0.000001) && ((y1 / y2) >= 0)){return (float) 0;}
        else if (((y1 / y2) >= -0.000001 ) && ((y1 / y2) <= 0)) {return (float) 0;}
        else return (float) (y1 / y2);
        
        //I did this so that the error created by actions with type float did not affect testing of the program
    }
}
