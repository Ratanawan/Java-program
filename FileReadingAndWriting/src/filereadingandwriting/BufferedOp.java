package filereadingandwriting;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BufferedOp {
    
   
    public static void main(String[] args) {
        String str = null;
        Scanner s = new Scanner(System.in);
        
        try
        {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\Desktop\\Java Files\\ScalaInJava.scala", true);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            
            System.out.println("Enter the data...");
            str = s.nextLine() + "\n";
            byte b[] = str.getBytes();
            
            bos.write(b);

            fos.close();
        }
        catch(IOException f)
        {
            System.out.println(f.getMessage());
        }  
    }
}
