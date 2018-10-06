package addingobjectsintothecollection;

public class Student extends Object{

    int id; 
    String name;
    
    public Student(int id, String name)
    {
         this.id = id;
         this.name = name;
    }
    
    @Override 
    public String toString()
    {
        return id + " " + name;
    }
    
}
