package ratanak;
import java.io.*;
import java.util.*;
public class FileOutputStreamDemo
{
    private static OutputStream file;
    private static Scanner input = new Scanner(System.in);
    private static String choice = "1";
    private static byte[] newLine = System.getProperty("line.separator").getBytes();
    private static byte[] codeLine;
    public static void main(String[] args)
    {
        System.out.println("\"<<<Write a C program>>> \"");
        System.out.println("**********************");
        
        //Access the file
        try
        {
            file = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\HelloWorld.c",true);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("FileNotFound...");
        }

        //Input to the file
        do
        {
            System.out.print("Enter 0 to stop, else to write code: ");
            choice = input.next();
            input.nextLine();
            
            System.out.println("Enter a line of code: ");
            codeLine = input.nextLine().getBytes();
            try
            {
                file.write(codeLine);
                file.write(newLine);
                file.flush();
            }
            catch(IOException e)
            {
                System.out.println("IOException...");
            }

        }while(choice != "0");

        //Close the file
        try
        {
            file.close();
        }
        catch (IOException ex)
        {
            System.out.println("Cannot close file...");
        }
    }
}
