package T_DataOutputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class MyFileInputStream {
    public static void main(String[] args) {
        byte b[] = new byte[300];
        
        try{
            FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\Java Files\\HelloWorld.txt");
            System.out.println("File opened...");
            
            fis.read(b);
            String str = new String(b);
            System.out.println("The data is: ");
            System.out.println(str);
            fis.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
