package T_DataOutputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BISByteToString {
    public static void main(String[] args) {
        String str;
        byte b[] = new byte[300];
    
    try{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\Admin\\Desktop\\Java Files\\HelloWorld.txt"));
        bis.read(b);
        str = new String(b);
        System.out.println("The data in the file is: \n" + str);
        System.out.println("Data read..."); 
        bis.close();
    }
    catch(IOException e)
    {
        System.out.println(e.getMessage());
        System.out.println("file fail to read...");
    }
    }
}
