package javaapplication22;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileNotFoundException {

    public static void main(String[] args) {
        try{
            FileReader o = new FileReader("C:\\Users\\Admin\\Desktop\\AccessSpecifier");
            o.read();
        }
        catch(FileNotFoundException f){
            System.out.println("FileNotFoundExcption");
        }
        catch(IOException io){
            System.out.println("IOException");
        }
        System.out.println("I'm outside");
    }
}
