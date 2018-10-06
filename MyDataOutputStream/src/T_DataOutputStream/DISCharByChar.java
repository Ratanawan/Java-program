package T_DataOutputStream;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DISCharByChar {
    public static void main(String[] args) {
        String str;
        int ch;
        
        try
        {
            DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("C:\\Users\\Admin\\Desktop\\Java Files\\HelloWorld.txt")));
            System.out.println("File opened...");
            
            while((ch = dis.read()) != -1)
            {
                System.out.println((char) ch);
            }
            dis.close();   
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
            System.out.println("File Fail to open...");
        }
    }
}
