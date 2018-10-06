package multiplethread;

public class ImplRunnable implements Runnable{
    @Override
    public void run()
    {
        System.out.println("Implement Runnable interface...");
        for(int i=0; i<5; i++)
        {
            System.out.println("World...");
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
}
