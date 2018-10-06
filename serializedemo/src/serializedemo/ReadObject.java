package serializedemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
         try
    {
        FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\Java Files\\Serialization\\Serialization.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        Student s = (Student)ois.readObject();
        
        System.out.println(s);
    }
    catch(IOException |ClassNotFoundException ex)
    {
        System.out.println(ex.getMessage(
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        ));
        System.out.println("Fail to read the file...");
    }
    }
}
