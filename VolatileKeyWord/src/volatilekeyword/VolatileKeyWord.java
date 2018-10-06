package volatilekeyword;

import java.util.Scanner;

public class VolatileKeyWord {
    
    public static volatile boolean status = true;
    
    public static void main(String[] args) 
    {
        Thread t1 = new Thread()
        {
            public void run()
            {
                while(status)
                {
                    try
                    {
                        System.out.println("Hello...");
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException e)
                    {
                        System.out.println(e.getMessage());
                        System.out.println("InterruptedException...");
                    }
                }
            }
        };
        t1.start();
        System.out.println("Enter some text and press return to stop...");
        
        new Scanner(System.in).next();
        stop();
    }
    public static void stop()
    {
        status = false;
    }
}
