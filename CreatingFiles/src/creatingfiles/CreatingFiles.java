package creatingfiles;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreatingFiles {
    
    static int num;
    static String arr[], path;
    static Scanner s;
    static File f;
    
    public static void main(String[] args) {
        
        s = new Scanner(System.in);
        path = "C:\\Users\\Admin\\Desktop\\demo\\";
        f = new File(path);
        
        if(f.exists())
        {
            createFiles();
        }
        else
        {
            f.mkdir();
            createFiles();
        }
    }    
        public static void createFiles()
        {
            System.out.println("Enter numbers of folders:");
            num = s.nextInt();
            
            arr = new String[num];
            System.out.println("Enter name of files with extension: ");
            for(int i = 0; i<num ; i++)
            {
                arr[i] = s.next();
                f = new File(path + arr[i]);
                try
                {
                    f.createNewFile();
                }
                catch(IOException e)
                {
                    System.out.println("Unable to create files...");
                }
            }
            System.out.println("Files created..");
            
        }
        
}

