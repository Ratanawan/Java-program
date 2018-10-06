package mycomparator;

public class MyConstructor {
    
    int id; 
    String name;
    
    public MyConstructor(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public String toString()
    {
        return id + " : " + name;
    }
    
    @Override
    public String toString(){
        return id + " : " + name;
    }
}
