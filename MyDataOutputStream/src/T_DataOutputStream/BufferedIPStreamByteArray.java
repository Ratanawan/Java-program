package T_DataOutputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class BufferedIPStreamByteArray {
    public static void main(String[] args) {
        
        byte b[] = new byte[300];
        
        try{
            FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\Java Files\\FileInputStreamByteForm");
            System.out.println("File opened succesfully..");
            
            fis.read(b);
            System.out.println(new String(b)); //convert byte into String
            
            fis.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Can't open the file...");
        }
    }
}
