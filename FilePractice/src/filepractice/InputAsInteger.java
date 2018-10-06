package filepractice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class InputAsInteger {

    public static void main(String[] args) {
        String str = null;
        Scanner s = new Scanner(System.in);
        String path = "C:\\Users\\Admin\\Desktop\\Java Files\\InputAsInteger.py";
        try{
            FileOutputStream fos = new FileOutputStream(path);
            
            System.out.println("Enter the data: ");
            str = s.nextLine();

            char c[] = str.toCharArray();
            for(int i=0; i<c.length; i++){
                int x = c[i];
                fos.write(x);
            }
            System.out.println("Data Written...");
            fos.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
