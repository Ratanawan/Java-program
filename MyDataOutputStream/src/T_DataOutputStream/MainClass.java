package T_DataOutputStream;

import java.io.IOException;

public class MainClass extends MyDataOutputStream{
    public static void main(String[] args) {
        
        try{
            System.out.println("Write the data: ");
            writingData();
            System.out.println("Reading the data \n");
            readingData();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
