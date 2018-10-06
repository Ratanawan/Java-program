package exception;

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {
        
        int a, b, c; 
        
        Scanner s = new Scanner(System.in);
        System.out.println("Input a and b: ");
        a = s.nextInt();
        b = s.nextInt();
                
        try{
            c = a/b;
            System.out.println("C = " + c );
        }
        catch(ArithmeticException e)
        {
            System.out.println("This is arithmatic exception...");
        }
        System.out.println("After execution...");
    }
}
