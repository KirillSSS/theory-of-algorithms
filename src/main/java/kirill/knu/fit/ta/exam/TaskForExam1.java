/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kirill.knu.fit.ta.exam;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author savch
 */
public class TaskForExam1 {
    
    DecimalFormat df = new DecimalFormat("###.###");
    Random rand = new Random();
    
    public float f(float x){
        
        if(x == Float.MAX_VALUE)
            return Float.MAX_VALUE;
        
        int a = 5;
        int b = 6;
        
        return (x + a)/b;
    }
    
    public String equation(String num){
    
        if(num.equals(""))
            {return "Please enter another length";}
        else if(Integer.parseInt(num) < 0)
            {return "Please enter another length greater than zero";}
        
        int n = Integer.parseInt(num);
        float x;    
        List<Float> answer = new ArrayList<>();
        List<Float> answerList = new ArrayList<>();
        String result = "";
        
        for (int i = 0; i < n; i++){
            
            x = rand.nextFloat() + rand.nextInt(10);
            answer.add(f(x));
            answerList.add(x);
            
            result += "x= " + df.format(answerList.get(i)) + " => f(x)= " + df.format(answer.get(i)) + "   ||   ";
        }
        
        return result;
    }
    
}
