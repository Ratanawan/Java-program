package multiplethread;

public class ExtendsThread extends Thread{
    @Override
    public void run()
    {
        System.out.println("Extending Thread class...");
        for(int i=0; i<5; i++)
        {
            System.out.println("Hello...");
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
