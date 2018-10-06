package npedemo;

public class NPEDemo {
    
    public void CallSayHello(TestClass obj)
    {
        System.out.println("Null value was passed to me");
        obj.SayHello();
    }
    public void demo3(TestClass obj)
    {
        CallSayHello(obj);
    }
    public void demo2(TestClass obj)
    {
        demo3(obj);
    }
    public void demo1(TestClass obj)
    {
        demo2(obj);
    }
    public static void main(String[] args) {
        NPEDemo a = new NPEDemo();
        TestClass b = null;
        try
        {
            a.demo1(b);
        }
        catch(NullPointerException c)
        {
            System.out.println("NPE has handled by main function");
        }
        
    }
    
}
