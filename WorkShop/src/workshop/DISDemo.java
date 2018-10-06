package workshop;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DISDemo {

    static String path = "C:\\Users\\Admin\\Desktop\\WorkShop\\File1.txt";
    
    public void ReadByteArray()
    {
        byte b[] = new byte[500];
        
        try{
            FileInputStream fis = new FileInputStream(path);
            BufferedInputStream bis = new BufferedInputStream(fis);
            DataInputStream dis = new DataInputStream(bis);
        //or
//          DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(path)));
            
            System.out.println("\nDataInputStream ReadByteArray()");
            dis.read(b);
            System.out.println(new String(b));
            dis.close();
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
            DataInputStream dis = new DataInputStream(bis);
        //or
//          DataInputStream bis = new DataInputStream(new BufferedInputStream(new FileInputStream(path)));

            System.out.println("DataInputStream ReadASCII()");
            while((ch = dis.read()) != -1){
                System.out.print((char)ch);
            }
            dis.close();
        }
        catch(IOException e){
            System.out.println("IOException...");
            System.out.println(e.getMessage());
        }
    }
}



