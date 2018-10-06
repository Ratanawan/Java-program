package binaryconverter;

import java.util.Scanner;

public class BinaryConverter {
    public static int num;
    public static void main(String[] args) {
        System.out.println("Input '1' for Binary to Decimal.");
        System.out.println("Input '2' for Binary to Octal.");
        System.out.println("Input '3' for Binary to Hexadecimal.");
        System.out.println("Input '4' for Decimal to Binary.");
        System.out.println("Input '5' for Decimal to Octal.");
        System.out.println("Input '6' for Decimal to Hexadecimal.");
        System.out.println("Input '7' for Hexadecimal to Decimal.");
        System.out.println("Input '8' for Hexadecimal to Octal.");
        System.out.println("Input '9' for Hexadecimal to Binary.");
        System.out.println("Input '10' for Octal to Decimal.");
        System.out.println("Input '11' for Octal to Binary.");
        System.out.println("Input '12' for Octal to Hexadecimal.");
        
        System.out.println("Input a number for your desire converting: ");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        
        //switch case
        switch(num)
        { 
            case '1' : {
                CoverterInterface one = new BinToDec();
                one.BinToDecFunction();
            }
        }
}
