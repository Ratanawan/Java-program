package threadcreationlightweight;

public class MyMainClass {
    public static void main(String[] args) {
        ThreadCreationLightWeight tt = new ThreadCreationLightWeight();
        Thread t = new Thread(tt);
        
        try
        {
            System.out.println("Sleeping for 2 seconds...");
            t.sleep(2000);
            t.start();
        }
        catch(InterruptedException e)
        {
            System.out.println("InterruptedException in main class...");
        }
    }
}
