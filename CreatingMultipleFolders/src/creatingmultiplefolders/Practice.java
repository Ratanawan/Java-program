package creatingmultiplefolders;

import java.io.File;
import java.util.Scanner;

public class Practice {
    static Scanner s;
    
    public static void main(String[] args){
        String[] str = new String[50];
        String path = new String("C:\\Users\\Admin\\Desktop\\Practice_java\\");
        File f = new File(path);
        System.out.println("How many Folders do you want to create?");
        s = new Scanner(System.in);
        int num = s.nextInt();
        
        if(!f.exists()){
            System.out.println("Input the name of the files one by one: ");
            for(int i = 0; i<str.length; i++){
                System.out.println("Input name for first folder: ");
                str[i] = s.nextLine();
                f = new File(path + str[i]);
                f.mkdir();
        }
    }
}
}
