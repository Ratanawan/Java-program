package mythread;

public class MyThread {

    public static void main(String[] args) {
        
        ThreadTest t2 = new ThreadTest();
        ImplRunnable im = new ImplRunnable();
        Thread t1 = new Thread(t2);
        Thread t3 = new Thread(im);
        
        t1.start();
        t3.start();
        
        //Thread with ananymous class implements Runnable interface
        Thread t4 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println("Private run method....");
            }
        });
        
        t4.start();
        
        //Ananymous Thread with Ananymous class and implements Runnable interface
        new Thread(new Runnable()
        {
            public void run()
            {
                System.out.println("Ananymous thread, can be called only once...");
            }
        }).start();
        
        //Ananymous Thread with Ananymous class without implements Runnable interface
        new Thread()
        {
            @Override
            public void run()
            {
                System.out.println("Ananymous Thread with Ananymous class without implements Runnable interface...");
            }
        }.start();
        
        //Ananymous Thread in Thread class object
        Thread t6 = new Thread()
        {
            @Override
            public void run()
            {
                System.out.println("Ananymous Thread in Thread class t6...");
            }
        };
        
       t6.start();
       
       
        
    }
    
}
