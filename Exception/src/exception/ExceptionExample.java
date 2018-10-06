package exception;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;


public class ExceptionExample {

    public static void main(String[] args) {
        try
        {
            FileReader f = new FileReader("C:\\Users\\Admin\\Desktop\\404Exception.txt");
            System.out.println("File is loaded successfully!!");
            f.read();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("I don't know....");
        }
        catch(IOException e) //Input Output Exception 
        {
            System.out.println("This is IO Exception.");
        }
    }
    
}
