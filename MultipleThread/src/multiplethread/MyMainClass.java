package multiplethread;

public class MyMainClass {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ExtendsThread());
        Thread t2 = new Thread(new ImplRunnable());
        
        System.out.println("Before join...");
        t1.start();
        t2.start();
        
        try
        {
            t1.join(); //Current Thread will wait until t1 finish 
            //it won't wait until t2 finish too, unless you put t2.join()
            System.out.println("After join...");
        }
                
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
