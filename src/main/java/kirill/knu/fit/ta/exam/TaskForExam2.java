/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kirill.knu.fit.ta.exam;

import java.util.Random;

/**
 *
 * @author savch
 */
public class TaskForExam2 {
    
    Random rand = new Random();
    
    public int[] random(){
        
        int arrayLeng = rand.nextInt(100);
        int[] result = new int[arrayLeng];

        for (int j = 0; j < arrayLeng; j++) {
            result[j] = rand.nextInt(100 * 2) - 100;
        }

        return result;
    }
    
    public void bubbleSort(int[] a) {
        
        boolean sorted = false;
        int temp;
        
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] < a[i+1]) {
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    sorted = false;
                }
            }
        }
    } 
    
    public String binarySearch(int a[], int elementToSearch, int start, int finish) {

        if (start < 0)
            start = 0;
        if (finish <= 0 || finish >= a.length)
            finish = a.length - 1;

        //System.out.println(finish + "------");
        
        while(start <= finish) {
            
            int middle = (start + finish) / 2;
            
            //System.out.println("middle " + middle + " ========");

            if (a[middle] == elementToSearch) {
                return "" + middle;
            }
            else if (a[middle] > elementToSearch){
                start = middle + 1;
            }
            else if (a[middle] < elementToSearch){
                finish = middle - 1;
            }
            //System.out.println(start + " ========");
        }
        return "there is no such number";
    }
    
}
