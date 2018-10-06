package filereadingandwriting;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileReadingAndWriting {

    public static void main(String[] args) {
        String str = null;
        Scanner s = new Scanner(System.in);
        
        str = s.nextLine() + "\n";
        
        byte[] b = str.getBytes();
        
        try{
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\Desktop\\FileReadingAndWriting.txt", true);
            System.out.println("File opened...");
            
            fos.write(b);
            System.out.println("Data written...");
            
            fos.close();
            
        }catch(IOException e)
        {
            System.out.println("IOException, can't find the file");
        }
        
        
    }
}