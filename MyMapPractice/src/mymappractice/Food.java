package mymappractice;

public class Food {
    int id ;
    String food;
    
    public Food(int id, String food)
    {
        this.id = id;
        this.food = food;
    }
    
    public String toString()
    {
        return id + " : " + food;
    }
}
