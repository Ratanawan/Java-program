package mythread;

public class ThreadTest extends Thread{
    @Override 
    public void run()
    {
        System.out.println("From thread class...");
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
