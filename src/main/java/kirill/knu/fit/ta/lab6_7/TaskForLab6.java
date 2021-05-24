/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kirill.knu.fit.ta.lab6_7;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author savch
 */
public class TaskForLab6 {
    
    public boolean isANumber(String s){
    
       if (s.matches("[-+]?\\d+"))
           return true;
       else
           return false;
    }
    
    public int[] translate(String text){
    
        List<String> listResult = Arrays.asList(text.split(" "));
        
        int[] result = new int[listResult.size()];
        int[] fake = {Integer.MIN_VALUE};
        
        if (listResult.size() < 2)
            return fake;
        
        for (int i = 0; i < listResult.size(); i++)
            if (isANumber(listResult.get(i)))
                result[i] = Integer.parseInt(listResult.get(i));
            else 
                return fake;
        
        return result;
    }
    
    public int arith(int[] progr, int n){
    
        int d = progr[1] - progr[0];
        
        if (n > 1){
            return (arith(progr,n - 1) + d);
        }
        return progr[0];
    }
    
    public String answer(String text, int n){
    
       int [] progr = translate(text);
       if (progr[0] == Integer.MIN_VALUE){
           return "Error,this array should only contain numbers";
       }
       
       return getAnswer(progr, n);
    }
    
    public String getAnswer(int[] progr, int n){
    
       if (n >= 1){
           return arith(progr,n) + ", " + getAnswer(progr,n - 1);
       } 
       return "";
    }
}
