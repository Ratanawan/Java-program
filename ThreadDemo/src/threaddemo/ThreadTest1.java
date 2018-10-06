package threaddemo;

public class ThreadTest1 extends Thread{
    @Override 
    public void run()
    {
        try
        {
            for(int i = 0; i<10; i++)
            {
                System.out.println("Thepanom");
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException ie)
        {
            System.out.println("InteruptedException");
        }
    }
    
}
