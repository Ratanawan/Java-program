package filepractice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FilePractice {

    public static void main(String[] args) {
        String str = null;
        Scanner s = new Scanner(System.in);
        
        
        String path = "C:\\Users\\Admin\\Desktop\\Java Files\\MyPractice.py"; 
        
        try{
            FileOutputStream fos = new FileOutputStream(path);
            System.out.println("Enter the data: ");
            str = s.nextLine();
            byte b[] = str.getBytes();
            fos.write(b);
            System.out.println("Data Written..");
            fos.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
