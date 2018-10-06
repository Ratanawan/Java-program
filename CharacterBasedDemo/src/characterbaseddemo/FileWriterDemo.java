package characterbaseddemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterDemo {
    public static void main(String[] args) {
        FileWriterDemo fwd = new FileWriterDemo();
        fwd.StringVersion();
//        fwd.CharArrayVersion();
//        fwd.IntegerVersion();
    }
    
    static Scanner s = new Scanner(System.in);
    //Writing String version
    public static void StringVersion()
    {
        try
        {
            String str;

            FileWriter fw = new FileWriter("C:\\Users\\Admin\\Desktop\\WorkShop\\Demo1.txt");
            System.out.println("Enter the data to write into the file: ");
            str = s.nextLine();
            fw.write(str);
            System.out.println("File written...");
            fw.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
            System.out.println("File fail to write...");
        }
    }
    
    //Writing Char Array Version
    public static void CharArrayVersion()
    {
        String str;
        try
        {
            FileWriter fw = new FileWriter("C:\\Users\\Admin\\Desktop\\Java Files\\CharacterBased\\FileWriter.txt"); //throw IOException
            BufferedWriter bfw = new BufferedWriter(fw);
            
            str = s.nextLine();
            char ch[] = str.toCharArray();
            
            for(int i=0; i<ch.length; i++)
            {
                bfw.write(ch[i]);
                System.out.println(ch[i]);
            }
            bfw.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
            System.out.println("File fail to write; IOException");
        }
    }
    
    //Integer Version
    public void IntegerVersion()
    {
        String str;
         try
        {
            FileWriter fw = new FileWriter("C:\\Users\\Admin\\Desktop\\Java Files\\CharacterBased\\FileWriter.txt"); //throw IOException
            BufferedWriter bfw = new BufferedWriter(fw);
            
            System.out.println("Enter data to write into the file: ");
            str = s.nextLine();
            char ch[] = str.toCharArray();
            
            for(int i=0; i<ch.length; i++)
            {
                int x = ch[i];
                bfw.write(x);
                System.out.println(ch.toString());
            }
            bfw.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
            System.out.println("File fail to write; IOException");
        }
    }
}
