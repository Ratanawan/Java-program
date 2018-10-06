package arrayindexoutofboundexceptionexample;

import java.util.Scanner;

public class MyArrayIndexOutOfBoundException {

    public static void main(String[] args) {
        String array[] = new String[5];
        Scanner s = new Scanner(System.in);
        
        try{
             for(int i=0; i<array.length+1; i++)
                array[i] = s.nextLine();
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("There is an exception and it is handled.");
        }
        for(int j=0; j<array.length +1 ; j++){
            System.out.println(array[j]);
        }
        
    }
    
}
