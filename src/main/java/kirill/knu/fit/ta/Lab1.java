/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kirill.knu.fit.ta;

import kirill.knu.fit.ta.lab2.EquationForLab2;
import kirill.knu.fit.ta.lab3.TaskForLab3;
import kirill.knu.fit.ta.lab4.TaskForLab4;

/**
 *
 * @author savch
 */
public class Lab1 {
    
    
    /*public static void main(String[] args) {
        FirstJavaClass fjc = new FirstJavaClass(7);
        
        System.out.println(fjc.toString());
        
        FirstJavaClass.setMyStaticInt(477);
        
        System.out.println(FirstJavaClass.getMyStaticInt());
    }*/
    /*public static void main(String[] args) {
    float x = EquationForLab2.equation(1, 2, 3, 4);
    System.out.println(x);
    }*/
    /*public static void main(String[] args) {
    Tasks2 t2 = new Tasks2();
    
    System.out.println(t2.arrayPrint(t2.arrayShuffle(t2.arrayRange(25), 294)));
    }*/
        
    public static void main(String[] args) {
        /*TaskForLab3 t = new TaskForLab3();
        
        int arlng = 20;
        int armax = 10;*/
    
    /*int[] x = t.task(arlng, armax);
    
    System.out.println(t.output(x));
    System.out.println("" + t.checkForNegative(x));
    System.out.println("" + t.check(x));*/
    
    /*int[] x = {};
    System.out.println(t.output(x));
    System.out.println("" + t.checkForNegative(x));
    //System.out.println("= " + x.length);
    System.out.println("" + t.check(x));
    }*/
    
    
    TaskForLab4 tfl4 = new TaskForLab4();
    String text5 = "air apple banana ping-pong crazy green bouble double";
        
    System.out.println(tfl4.text);
    System.out.println("--------------" + tfl4.getList(tfl4.text));
    System.out.println("--------------" + tfl4.getList(tfl4.text).size());
    System.out.println("==============" + tfl4.getSet(tfl4.text));
    System.out.println("==============" + tfl4.getSet(tfl4.text).size());
    System.out.println("" + tfl4.Task4(tfl4.getList(tfl4.text), 8, 0));
    System.out.println("" + tfl4.Task5(text5, "p"));
    System.out.println("" + tfl4.Task6(tfl4.text, 4));
    System.out.println("" + tfl4.Task7(tfl4.getList(tfl4.text), 7));
    }
}
