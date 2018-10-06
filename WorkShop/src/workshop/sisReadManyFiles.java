package workshop;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Vector;

public class sisReadManyFiles {
    public static void main(String[] args) {
        String path1 = "C:\\Users\\Admin\\Desktop\\WorkShop\\File1.txt";
        String path2 = "C:\\Users\\Admin\\Desktop\\WorkShop\\File2.txt";
        String path3 = "C:\\Users\\Admin\\Desktop\\WorkShop\\File3.txt";
        String path4 = "C:\\Users\\Admin\\Desktop\\WorkShop\\File4.txt";
        int ch ;
        
        try{
            FileInputStream fis1 = new FileInputStream(path1);
            FileInputStream fis2 = new FileInputStream(path2);
            FileInputStream fis3 = new FileInputStream(path3);
            FileInputStream fis4 = new FileInputStream(path4);
            
            Vector v = new Vector();
            v.add(fis1);
            v.add(fis2);
            v.add(fis3);
            v.add(fis4);
            
            SequenceInputStream sis = new SequenceInputStream(v.elements());
           
            while((ch = sis.read()) != -1){
                System.out.print((char) ch);
            }
            sis.close();
            
        }
        catch(IOException e)
        {
            System.out.println("IOException...");
            System.out.println(e.getMessage());
        }
    }
}
