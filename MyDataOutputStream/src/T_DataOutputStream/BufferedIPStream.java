package T_DataOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BufferedIPStream {
    public static void main(String[] args) {
        String str, path;
        Scanner s = new Scanner(System.in);
    
    //Writing the file
        try{
            path = "C:\\Users\\Admin\\Desktop\\Java Files\\FileInputStream.txt";
            FileOutputStream fos = new FileOutputStream(path);
            System.out.println("Input data into FileInputStream.txt: ");
            str = s.nextLine();
            
            char c[] = str.toCharArray();
            for(int i = 0; i<c.length; i++)
            {
                int x = c[i];
                fos.write(x);
            }
            System.out.println("File written...");
            fos.close(); 
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Can't write the file...");
        }
        
    //reading file char by char; convert it into ASCII
        int ch;
        try{

            FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\Java Files\\FileInputStream.txt");
            System.out.println("File opened...");
            
            //-1 is the last charactor
            while((ch = fis.read()) != -1)
            {
                System.out.print((char)ch); //println: output will be new line char by char; //print: no new line
            }

            fis.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
            System.out.println("File Fail to open...");
        }
    }
}
