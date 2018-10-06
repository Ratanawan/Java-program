package workshop;

import java.io.FileInputStream;
import java.io.IOException;

public class FISDemo {
    static String path = "C:\\Users\\Admin\\Desktop\\WorkShop\\File1.txt";
    
    public void ReadByteArray()
    {
        byte b[] = new byte[500];
        
        try{
            FileInputStream fis = new FileInputStream(path);
            System.out.println("FileInputStream ReadByteArray()");
            fis.read(b); 
            System.out.println(new String(b));
            fis.close();
        }
        catch(IOException e){
            System.out.println("IOExcetion...");
            System.out.println(e.getMessage());
        }
    }
    
    public void ReadASCII(){
        int ch;
        
        try{
            FileInputStream fis = new FileInputStream(path);
            System.out.println("FileInputStream ReadASCII()");
            while((ch = fis.read()) != -1){
                System.out.print(ch);
            }
            fis.close();
        }
        catch(IOException e){
            System.out.println("IOException...");
            System.out.println(e.getMessage());
        }
    }
}
