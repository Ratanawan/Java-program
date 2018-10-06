package filepractice;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class BufferedOutput {
    public static void main(String[] args) {
        String str = null;
        Scanner s = new Scanner(System.in);
        
        try{
            //BufferedOutputStream can't interact with the disk directly 
            //it has to depand on FileOutputStream to interact with the disk
            //its benifits is it is fast
            //give the file path with file name a long with its extension
            OutputStream fos = new FileOutputStream("C:\\Users\\Admin\\Desktop\\Java Files\\Yo.py");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            //getting input to write into the file
            System.out.println("Enter the data: ");
            str = s.nextLine();
            //converting string into array of charactor
            char c[] = str.toCharArray();
            //converting characters into integer to get its ASCII value
            for(int i=0; i<c.length; i++)
            {
                int x = c[i];
                //wrting data into file
                bos.write(x);
            }
            System.out.println("Data written...");
            //closing the file
            bos.close();
        }
        //IOException is the parent of FileNotFoundException 
        //Just put IOException, it will handle 404Exception as well
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
