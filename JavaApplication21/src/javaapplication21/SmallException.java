package javaapplication21;

import java.lang.ArithmeticException;

public class SmallException {
    public static int a=10,b=1,c;
    
    public static void main(String[] args) {
    
        try{
            c =a/b;
        }
        catch(ArithmeticException a) //ArithmeticException a = new Arithmetic();
        {
            System.out.println("ArithmaticException");
        }
        System.out.println("No Exception");
        
    }
    
}
