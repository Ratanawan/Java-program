package threadcreationlightweight;

public class ThreadCreationLightWeight implements Runnable{
    
    @Override 
    public void run()
    {
        try
        {
            System.out.println("Sleeping for 1 second...");
            Thread.sleep(1000);
            System.out.println("This is from run()");
        }
        catch(InterruptedException e)
        {
            System.out.println("InterruptedException...");
        }
    }
    
}
