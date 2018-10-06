package override;

public class Child extends Parent
{
    int z = 200;
    
    @Override
    public void add()
    {
//        super.add();
        System.out.println("x + y + z = " + (x+y+z));
    }
    
    public static void main(String[] args)
    {
        Parent ch = new Child();
        ch.add();
    }
}
