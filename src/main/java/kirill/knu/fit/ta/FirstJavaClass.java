/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kirill.knu.fit.ta;

/**
 *
 * @author savch
 */
public class FirstJavaClass {

    private int MyInt;
    private static int myStaticInt;
    
    public FirstJavaClass() {
    }

    public FirstJavaClass(int MyInt) {
        this.MyInt = MyInt;
    }
    
    public static int getMyStaticInt() {
        return myStaticInt;
    }

    public static void setMyStaticInt(int aMyStaticInt) {
        myStaticInt = aMyStaticInt;
    }

    public int getMyInt() {
        return MyInt;
    }

    public void setMyInt(int MyInt) {
        this.MyInt = MyInt;
    }

    @Override
    public String toString() {
        return "FirstJavaClass{" + "MyInt=" + MyInt + '}';
    }
    
    
    
}
