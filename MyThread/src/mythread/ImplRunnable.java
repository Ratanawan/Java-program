package mythread;

public class ImplRunnable implements Runnable{
    @Override 
    public void run()
    {
        System.out.println("From Runnable Interface...");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
