package constructoroverloading;

public class FunctionOverloading
{
    int id;
    String name;
    
    public void demo()
    {
        System.out.println("No argument.");
    }
    public void demo(int id)
    {
        System.out.println("Integer argument.");
    }
    public void demo(int id, String name)
    {
        System.out.println("Integer and String arguments.");
    }
    public void demo(String name, int id)
    {
        System.out.println("String and Integer arguments.");
    }
    public void demo(String name)
    {
        System.out.println("String argument.");
    }
    
    //main function
    public static void main(String[] args)
    {
        FunctionOverloading f = new FunctionOverloading();
        f.demo(212, "wann");
        f.demo("Wann");
        
    }
}