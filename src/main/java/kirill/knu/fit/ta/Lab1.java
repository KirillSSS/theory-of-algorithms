/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kirill.knu.fit.ta;

import java.util.ArrayList;
import java.util.List;
import kirill.knu.fit.ta.lab2.EquationForLab2;
import kirill.knu.fit.ta.lab3.TaskForLab3;
import kirill.knu.fit.ta.lab4.TaskForLab4;
import kirill.knu.fit.ta.lab6_7.TaskForLab6;
import kirill.knu.fit.ta.lab6_7.TaskForLab7;
import kirill.knu.fit.ta.lab8.TaskForLab8;
import kirill.knu.fit.ta.lab8.Timer;
import lab5.Task1ForLab5;
import lab5.TaskForLab5;

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
    /*String text5 = "air apple banana ping-pong crazy green bouble double";
    
    System.out.println(tfl4.text);
    System.out.println("--------------" + tfl4.getList(tfl4.text));
    System.out.println("--------------" + tfl4.getList(tfl4.text).size());
    System.out.println("==============" + tfl4.getSet(tfl4.text));
    System.out.println("==============" + tfl4.getSet(tfl4.text).size());
    System.out.println("" + tfl4.Task4(tfl4.getList(tfl4.text), 8, 0));
    System.out.println("" + tfl4.Task5(text5, "p"));
    System.out.println("" + tfl4.Task6(tfl4.text, 4));
    System.out.println("" + tfl4.Task7(tfl4.getList(tfl4.text), 7));
    */
    
    /*int a = 100;
    TaskForLab5 tfl5 = new TaskForLab5(a);
    Task1ForLab5 t1fl5 = new Task1ForLab5();
    
    
    
    System.out.println(tfl5.getUnsortedStringList());
    System.out.println(tfl5.sortApproach2String());
    System.out.println(tfl5.Task3String("A", tfl5.sortApproach2String()));
    System.out.println(tfl5.getUnsortedByteList());
    System.out.println(tfl5.sortApproach2Byte());
    System.out.println(tfl5.Task3Byte((byte)18, tfl5.sortApproach2Byte()));
    
    //System.out.println(tfl4.getList(tfl4.text));
    System.out.println(t1fl5.Task1("the", 0, 13, tfl4.getList(tfl4.text)));
    System.out.println(t1fl5.Task1Reverse("the", 0, 13, tfl4.getList(tfl4.text)));
    }*/
    
    /*String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    
    List<String> alph = new ArrayList();
    for (int i = 0; i < 52; i++) {
    alph.add("" + a.charAt(i));
    }
    System.out.println("" + alph);
    }*/
    /*
    int a = 50;
    TaskForLab5 tfl5 = new TaskForLab5(a);
    Task1ForLab5 t1fl5 = new Task1ForLab5();
    
    System.out.println(tfl5.sortApproach2String());
    System.out.println(tfl5.Task3String("E", tfl5.sortApproach2String()));*/
    
    /*TaskForLab6 tfl6 = new TaskForLab6();
    
    int[] a = {2, 5, 8};
    String s = "4 18";
    //System.out.println(tfl6.arith(a, 4));
    System.out.println(tfl6.answer(s, 15));
    //System.out.println(tfl6.translate(s));
    
    TaskForLab7 tfl7 = new TaskForLab7();
    
    //{3, 6, 11, 10, 7, 8, 1, 2}.
    
    tfl7.add(3);
    tfl7.add(6);
    tfl7.add(11);
    tfl7.add(10);
    tfl7.add(7);
    tfl7.add(8);
    tfl7.add(1);
    tfl7.add(2);
    
    System.out.println(tfl7.containsNode(15));
    System.out.println(tfl7.containsNode(10));
    System.out.println("=" + tfl7.showTree());
    System.out.println("=" + tfl7.nodeIndexList());
    
    System.out.println(tfl7.traverseInOrder(tfl7.root));
    System.out.println("");
    System.out.println(tfl7.traversePreOrder(tfl7.root));
    System.out.println("");
    System.out.println(tfl7.traversePostOrder(tfl7.root));
    System.out.println("");
    System.out.println(tfl7.traverseLevelOrder(tfl7.root));
    System.out.println("");*/
        
        //tree.delete(10);
        
        /*System.out.println(tree.containsNode(10));
        
        tree.traverseInOrder(tree.root);
        System.out.println("");
        tree.traversePreOrder(tree.root);
        System.out.println("");
        tree.traversePostOrder(tree.root);
        System.out.println("");
        tree.traverseLevelOrder(tree.root);
        System.out.println("");*/
        
        TaskForLab8 tfl8 = new TaskForLab8();
        TaskForLab3 tfl3 = new TaskForLab3();
        Timer timer = new Timer();
        
        int[] a = {176, 56, 176, 218, 3, 10, 98, 16, -33, -56, - 4000, 80};
        
        //int[] a = tfl8.random();
        int b = -56;
        
        tfl8.bubbleSort(a);
        
        System.out.println(tfl3.output(a));
        
        System.out.println(tfl8.linearSearch(a, b));
        System.out.println(timer.linearSearchTime(a, b));
        
        System.out.println(tfl8.binarySearch(a, b, 0, 0));
        System.out.println(timer.binarySearchTime(a, b));
        
        System.out.println(tfl8.exponentialSearch(a, b));
        System.out.println(timer.exponentialSearchTime(a, b));
    }
}
