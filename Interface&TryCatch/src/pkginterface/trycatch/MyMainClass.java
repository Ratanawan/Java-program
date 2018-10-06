package pkginterface.trycatch;

import java.util.Scanner;
import java.io.ArithmaticException;

public class MyMainClass {
    public static double input;
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input binary number: ");
        input = s.nextInt();
        
        MyInterface obj = new MyTryCatch();
        try{
            System.out.println("The code is loaded successfully!");
            obj.MyFunction((int) input); 
        }
        catch(ArithmaticException a){
            System.out.println("Fail");
        }
          
    }
}
