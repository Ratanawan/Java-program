package threadpractice;

public class ThreadPractice {

    public static void main(String[] args) {
        //1st
         Thread t1 = new Thread(new ImplRunnable()); //create obj for thread class and pass ImplRunnable
         t1.start();
         
         //2nd
         Thread t2 = new Thread(new ExtendsThread()); //create obj for Thread class and Extend Thread
         t2.start();
         
         try{
             t1.join();
             System.out.println("After join...");
         }
         catch(InterruptedException e)
         {
             System.out.println("InterruptedException coz of join()");
         }
         
         //3rd
         //Ananymous Thread in Ananymous Class without implement Runnable interface
         new Thread()
         {
             @Override
             public void run()
             {
                 System.out.println("Ananymous Thread in Ananymous class...");
             }
         }.start();
         
         //4th
         //Ananymous Thread in Ananymous Class and implement Runnable interface
         new Thread(new Runnable()
         {
             @Override
             public void run()
             {
                 System.out.println("Ananymous Thread in Ananymous class and implement Runnable.");
             }
         }).start();
         
         //5th
         //Thread with anynomous class that implement Runnable interface.
         Thread t4 = new Thread(new Runnable()
         {
             @Override
             public void run()
             {
                 System.out.println("In Thread with anynomous class that implement Runnable interface.");
             }
         });
         
         t4.start();
         
         Thread t5 = new Thread()
         {
             public void run()
             {
                 System.out.println("t5");
             }
         };
    }
    
}
