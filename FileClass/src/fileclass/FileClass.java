package fileclass;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
//import java.io.FileNotFoundException;

public class FileClass {
    
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\Admin\\Desktop\\40Exception.txt");
        File f2 = new File("C:\\Users\\Admin\\Desktop\\AccessSpecifiers");
        //checking f1
        if(f1.exists())
        {
            System.out.println("f1 is exist...");
            if(f1.isFile())
            {
                System.out.println("f1 is a File...");
            }
            else if(f1.isDirectory())
            {
                System.out.println("f1 is a Directory...");
            }
            else
            {
                System.out.println("f1 is neither a File and a Directory");
            }
        }
        else
        {
            int option;
            System.out.println("f1 is not exist.. Enter \n1.To create a File \n2.To create a Folder");
            Scanner s = new Scanner(System.in);
            option = s.nextInt();
            if(option == 1)
            {
                try
                {
                    f1.createNewFile();
                    System.out.println("The file craeted");
                }
                catch(IOException e)
                {
                    System.out.println("IOException... Unable to create a file");
                }
            }
            else
            {
                f1.mkdir();
                System.out.println("Folder created");
            }
        }
        //checking f2
        if(f2.exists())
        {
            System.out.println("f2 is exist...");
            if(f2.isFile())
            {
                System.out.println("f2 is a file");
            }
            else if(f2.isDirectory())
            {
                System.out.println("f2 is a Directory");
            }
            else
            {
                System.out.println("f2 is neither a file and a directory");
            }
        }
        else
        {
            System.out.println("File or Directory is not exist...");
        }
        
    }
    
}
