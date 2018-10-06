package creatingmultiplefolders;

import java.io.File;
import java.util.Scanner;

public class CreatingMultipleFolders {
      
    public static void main(String[] args) {
       String path = new String("C:\\Users\\Admin\\Desktop\\Hey\\You\\Stewpeed\\");
       
       int num=0;
       Scanner s = new Scanner(System.in);
       System.out.println("Enter numbers of folders to be created: ");
       num = s.nextInt();
       
       String []str = new String[num];
       
       File f = new File(path);
       if(!f.exists());
       {
           System.out.println("Enter names of folders: ");
           for(int i = 0; i<str.length; i++)
           {
                str[i] = s.next();
                f = new File(path + " " + str[i]);
                f.mkdirs();
           }
       }
    }
    
}
