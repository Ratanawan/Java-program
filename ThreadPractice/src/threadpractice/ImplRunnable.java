package threadpractice;

public class ImplRunnable implements Runnable{
    @Override
    public void run()
    {
        try
        {
            for(int i = 0; i<10; i++)
            {
                System.out.println("Implementiing Runnable...");
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
            System.out.println("InterruptedException in Runnable interface...");
        }
    }
    
}
