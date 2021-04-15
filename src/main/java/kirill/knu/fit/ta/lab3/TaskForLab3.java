/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kirill.knu.fit.ta.lab3;

import java.util.Random;
import org.springframework.stereotype.Service;

/**
 *
 * @author savch
 */
@Service
public class TaskForLab3 {
    
    Random rand = new Random();
    
    public int[] task(int arrayLeng, int arrayMax){
        
        int[] result = new int[arrayLeng];

        for (int j = 0; j < arrayLeng; j++) {
            result[j] = rand.nextInt(arrayMax * 2) - arrayMax;
        }

        return result;
    }
    
    public String checkForNegative(int[] array){
    
        int k = 0;
        
        for (int j = 0; j < array.length; j++) {
            if (array[j] < 0){
                k++;
            }
        }
        
        return "" + k;
    }
    
    public String check(int[] array){
    
        int k = 0;
        int i = 0;
        int j = 0;
        
        while ((i < 1) || (j > array.length)){
        
            if (array[j] < 0){
                k++;
                j++;
            }
            else {
                i = 2;
            }
        }
        
        return "" + k;
    }
    
    public String output(int[] intArray) {
        String result = "{";

        for (int i : intArray) {
            result += i + ", ";
        }
        result=result.substring(0, result.length()-2);
        result += "}";
        return result;
    }
}
