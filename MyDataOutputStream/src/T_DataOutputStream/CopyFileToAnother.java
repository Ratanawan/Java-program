package T_DataOutputStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyFileToAnother {
    
    public static String path;
    
    //Writing Data into txt file
      public static void writeData()
      {
           path = "C:\\Users\\Admin\\Desktop\\Java Files\\Copy_3_Files\\Full_Data.txt";
           String str;
           Scanner s = new Scanner(System.in);
           
           try
           {
               DataOutputStream dis = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(path)));
               System.out.println("File Opened...");
               
               System.out.println("Enter data into the file: ");
               str = s.nextLine();
               
               char ch[] = str.toCharArray();
               
               for(int i=0; i<ch.length; i++)
               {
                   int x = ch[i];
                   dis.write(x);
               }
               System.out.println("Data has been written...");
               dis.close();
           }
           catch(IOException e)
           {
               System.out.println(e.getMessage());
               System.out.println("Fail to write the data into file...");
           }
      }
}
