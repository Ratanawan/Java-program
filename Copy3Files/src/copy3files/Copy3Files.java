package copy3files;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Copy3Files {

    //writing data
    public static void writeData()
    {
        String str, path ;
        Scanner s = new Scanner(System.in);
        
        try{
            path = "C:\\Users\\Admin\\Desktop\\Java Files\\Copy_3_Files";
            
            DataOutputStream dis = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(path)));
            System.out.println("Date opened...");
            
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
            System.out.println("Fail to open the file...");
        }
    }
    
    //copy entirely to File 2
    public static void copy(final InputStream in, final OutputStream out) throws IOException        
    {
        try
        {
            try
            {
                final byte[] buffer = new byte[1024];
                int n;
                while((n = in.read(buffer)) != -1)
                out.write(buffer, 0, n);
            }
            finally
            {
                out.close();
            }
        }
        finally
        {
                in.close();
        }
        
    }
}
