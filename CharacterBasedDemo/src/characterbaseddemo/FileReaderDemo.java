package characterbaseddemo;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    
    public static void main(String[] args) {
        CharArray();
    }
    
     public static void CharArray(){
        //characters array
        char ch[] = new char[5000];
        try
        {
            FileReader fr = new FileReader("C:\\Users\\Admin\\Desktop\\Java Files");
            fr.read(ch);
            System.out.println(ch);
            fr.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
            System.out.println("File has been read...");
        }
    }
    
     //character by character
     public static void CharByChar()
     {
        try
        {
            int ch = -1;
            FileReader fr = new FileReader("C:\\Users\\Admin\\Desktop\\Java Files");
            while((ch = fr.read()) != -1)
            {
                System.out.print((char)ch);
            }
            fr.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
            System.out.println("File has been read...");
        }
     }
}
