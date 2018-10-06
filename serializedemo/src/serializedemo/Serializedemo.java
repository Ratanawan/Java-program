package serializedemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Serializedemo {
    
    public static void main(String[] args) {
        Student s1 = new Student(1, "Wann");
        String str;
        Scanner s;
        try
        {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\Desktop\\Java Files\\Serialization\\Serialization.bin");
            System.out.println("Input the data: ");
            s = new Scanner(System.in);
            str = s.nextLine();
            char ch[] = str.toCharArray();
            
            for(int i=0; i<ch.length; i++)
            {
                int x = ch[i];
                fos.write(x);
            }
            System.out.println("File has been written...");
            
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(s1);
            oos.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Fail to write the file...");
        }
    }
    
}
