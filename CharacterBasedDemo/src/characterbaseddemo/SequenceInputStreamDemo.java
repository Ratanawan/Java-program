package characterbaseddemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamDemo {
    public static void main(String[] args) {
        int ch;
        try
        {
            FileInputStream fis1 = new FileInputStream("C:\\Users\\Admin\\Desktop\\Java Files\\CharacterBased\\Sequence1.txt");
            FileInputStream fis2 = new FileInputStream("C:\\Users\\Admin\\Desktop\\Java Files\\CharacterBased\\Sequence2.txt");
            
            SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
            
            while((ch = sis.read()) != -1)
            {
                System.out.println((char)ch);
            }
            sis.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
