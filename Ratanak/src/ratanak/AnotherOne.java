package ratanak;
import java.io.*;
import java.util.*;
public class AnotherOne
{
    private static OutputStream file;
    private static Scanner input = new Scanner(System.in);
    private static String choice = null;
    private static String end = "-1";
    private static byte[] newLine = System.getProperty("line.separator").getBytes();
    private static byte[] codeLine;
    public static void main(String[] args)
    {
        System.out.println("\"<<<Write a C program>>> \"");
        System.out.println("************************");

        //Access the file
        try
        {
            file = new FileOutputStream("C:\\Users\\Admin\\Desktop\\WorkShop\\HelloWorld.py");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("FileNotFound...");
        }

        //Input to the file
        System.out.println("Enter your code and -1 to finish : ");
        try
        {
            while(true)
            {
                choice = input.nextLine();
                if(choice.equalsIgnoreCase(end))
                {
                    break;
                }
                codeLine = choice.getBytes();
                file.write(codeLine);
                file.write(newLine);
                file.flush();
            }
        }
        catch (IOException e)
        {
            System.out.println("IOException...");
        }
        finally
        {
            try
            {
                file.close();
            }
            catch (IOException ex)
            {
                System.out.println("Cannot close file...");
            }
        }
        System.out.println("Program End...");
        System.out.println("**************");
    }
}
