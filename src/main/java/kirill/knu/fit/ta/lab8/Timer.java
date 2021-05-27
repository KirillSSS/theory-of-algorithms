/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kirill.knu.fit.ta.lab8;

/**
 *
 * @author savch
 */
public class Timer {
    
    TaskForLab8 tfl8 = new TaskForLab8();
    
    public String linearSearchTime(int[] a, int elementToSearch){
    
        long startTime = System.nanoTime();
        tfl8.linearSearch(a, elementToSearch);
        long endTime = System.nanoTime();

        return "" + (endTime - startTime) + " ns OR " + ((endTime - startTime) / 1000000.0) + " ms";
    }
    
    public String binarySearchTime(int[] a, int elementToSearch){
    
        long startTime = System.nanoTime();
        tfl8.binarySearch(a, elementToSearch, 0, 0);
        long endTime = System.nanoTime();

        return "" + (endTime - startTime) + " ns OR " + ((endTime - startTime) / 1000000.0) + " ms";
    }
    
    public String exponentialSearchTime(int[] a, int elementToSearch){
    
        long startTime = System.nanoTime();
        tfl8.exponentialSearch(a, elementToSearch);
        long endTime = System.nanoTime();

        return "" + (endTime - startTime) + " ns OR " + ((endTime - startTime) / 1000000.0) + " ms";
    }
}
