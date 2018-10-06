package anotherpackage;

import accessspecifiers.DefaultAccessSpecifiers.*; 

public class AnotherClass{
    public static void main(String[] args) {
        DefaultAccessSpecifiers obj = new DefaultAccessSpecifiers(); //compile time error
        obj.demo();
    }    
}



