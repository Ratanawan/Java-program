package T_DataOutputStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class MyDataOutputStream {

    static FileOutputStream fos = null ;
    static BufferedOutputStream bos = null;
    static DataOutputStream dos = null;
    static FileInputStream fis = null;
        
    public static void writingData() throws IOException{
   
            String str = null;
            Scanner s = new Scanner(System.in);

            try{
                fos = new FileOutputStream("C:\\Users\\Admin\\Desktop\\Java Files\\PythonFromJava.py", true);
                bos = new BufferedOutputStream(fos);
                dos = new DataOutputStream(bos);

                System.out.println("Enter data: ");
                for(int j=0; j<4; j++)
                {
                    str = s.nextLine();
                }

                char c[] = str.toCharArray();
                for(int i=0; i<c.length; i++)
                {
                    int x = c[i];
                    dos.write(x);
                }
                System.out.println("Data written...");

            }
            finally
            {
                dos.close();
                System.out.println();
            }
    }
    
    public static void readingData () throws IOException
    {
        byte b[] = new byte[300];
        
        try
        {
            fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\Java Files\\PythonFromJava.py");
            
            fis.read(b);
            String readStr = new String(b);
            System.out.println("The data output is: ");
            System.out.println(readStr);
        }
        finally
        {
            System.out.println("Data is read...");
        }
    }
    
} 
   
