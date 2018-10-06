package abstractkeyword;

public class Subclass extends AbstractClass //inherit from AbstractClass
{
    @Override //override the abstract class
    void demo()
    {
        System.out.println("Override abstract class."); 
    }
    public static void main(String[] args)
    {
        Subclass s = new Subclass();
        s.demo();
    }
}
