package workshop;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BISDemo {

    static String path = "C:\\Users\\Admin\\Desktop\\WorkShop\\File1.txt";
    
    public void ReadByteArray()
    {
        byte b[] = new byte[500];
        
        try{
            FileInputStream fis = new FileInputStream(path);
            BufferedInputStream bis = new BufferedInputStream(fis);
        //or
//          BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
            
            System.out.println("\nBufferedInputStream ReadByteArray()");
            bis.read(b);
            System.out.println(new String(b));
            bis.close();
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
            BufferedInputStream bis = new BufferedInputStream(fis);
        //or
//          BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));

            System.out.println("BufferedInputStream ReadASCII()");
            while((ch = bis.read()) != -1){
                System.out.print((char)ch);
            }
            bis.close();
        }
        catch(IOException e){
            System.out.println("IOException...");
            System.out.println(e.getMessage());
        }
    }
}


