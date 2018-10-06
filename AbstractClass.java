package abstractclass;

public abstract class AbstractClass  //abstract class
{
    abstract void demo(); //abstract function
    
    public void demo1() 
    {
        System.out.println("Concrete function");
    }
    
    public static void main(String[] args) {
        AbstractClass a = new AbstractClass() //ananomous function
        {
            @Override 
            void demo()
            {
                System.out.println("Ananomous Class");
            }
        };
        a.demo();
        a.demo1();
    } 
}
