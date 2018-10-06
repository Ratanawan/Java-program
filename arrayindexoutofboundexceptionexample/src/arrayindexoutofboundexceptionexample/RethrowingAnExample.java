package arrayindexoutofboundexceptionexample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RethrowingAnExample {
    public void openFile()throws FileNotFoundException, IOException
    {
        FileReader f1 = new FileReader("file1");
        f1.read();
    }
    public void openFile1() throws FileNotFoundException, IOException{
        openFile();
    }
    public void openFile2() throws FileNotFoundException, IOException{
        openFile1();
    }
    public static void main(String[] args) {
        RethrowingAnExample r = new RethrowingAnExample();
        try{
            r.openFile2();
        }
        catch(FileNotFoundException fi1)
        {
            System.out.println("File1 can't be opened.Opening File 2");
            try{
                FileReader f2 = new FileReader("file2");
            }
            catch(FileNotFoundException fi2)
            {
                System.out.println("File2 can't be opened. Opening File 3");
                try{
                    FileReader f3 = new FileReader("File3");
                }
                catch(FileNotFoundException fi3)
                {
                    System.out.println("File3 can't be opened. That's it!!! No more opening file!!!!");
                }
            }
            
        }
        catch(IOException i)
        {
            System.out.println("This is IOException!");
        }
    }
}
/* Wann Schrazo*/
/* Wann Scherzo*/