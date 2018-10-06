package threadpractice;

public class ExtendsThread extends Thread{
    @Override
    public void run()
    {
        try{
            for(int i=0; i<5; i++)
            {
                System.out.println("Extending Thread class...");
                Thread.sleep(1000);
            }  
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
            System.out.println("InterruptedException...");
        }
    }
}
