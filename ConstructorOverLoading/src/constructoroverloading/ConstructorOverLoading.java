package constructoroverloading;

public class ConstructorOverLoading
{
    int id;
    String name;
    
    public void ConstructorOverLoading(int id, String name)
    {
        this.id = id;
        this.name = name;
    } 
    public void ConstructorOverloading(String name)
    {
        this.id = 212;
        this.name = name;
        System.out.println("String argument.");h
    }
    
    public void output()
    {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
    }
    
    public static void main(String[] args)
    {
        ConstructorOverLoading fo = new ConstructorOverLoading("Wann");
        fo.output();
    }
}