package filereadingandwriting;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFileAsInteger {
    public static void main(String[] args) {
        String str = new String();
        Scanner s = new Scanner(System.in);
        str = s.nextLine();
        
        char ch[] = str.toCharArray();
        
        try{
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\Desktop\\Java Files\\Hey_You.scala");
            
            for(int i=0; i<ch.length; i++)
            {
                int x = ch[i];
                fos.write(x);
            }
            System.out.println("Data written...");
            fos.close();
            
        }catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
