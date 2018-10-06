package volatilekeyword;

public class ThreadSync {
    
    public static volatile int count=0;
    
    public synchronized static void increase()
    {
        count++;
    }
    public static void main(String[] args) {
        
        Thread t1 = new Thread()
        {
            @Override
            public void run()
            {
                for(int i=0; i<300; i++)
                {
                    count++;
                    System.out.println(count);
                    increase();
                }
            }
        };
        
        Thread t2 = new Thread()
        {
            @Override
            public void run()
            {
                for(int i=0; i<500; i++)
                {
                    System.out.println(count);
                    count++;
                }
            };
        };
        
        t1.start();
        t2.start();
        
        try
        {
            t1.join();
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            
        }
        
        long end = System.currentTimeMillis();
        System.out.println("Count = " + count);
        System.out.println(end);
    }
}
