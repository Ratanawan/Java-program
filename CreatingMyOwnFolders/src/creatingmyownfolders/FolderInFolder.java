package creatingmyownfolders;


import java.io.File;
import java.util.Scanner;

public class FolderInFolder {
    public static void main(String[] args) {
        String path = "C:\\Users\\Admin\\Desktop\\Practice_java";
        
        File f = new File(path);
        int num;
        
        System.out.println("Enter number of folders you want to create: ");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        
        String arr[] = new String[num];
        if(f.exists()){
            
            System.out.println("Enter the name for folders: ");
            for(int i=0; i<num ; i++)
            {
                arr[i] = s.next(); //with one space it will consider another line of code
                path = path + arr[i] + "\\";
            }
            System.out.println(f.getAbsoluteFile());
            f.mkdir();
            System.out.println("The Folders created...");
        }
    }
}
