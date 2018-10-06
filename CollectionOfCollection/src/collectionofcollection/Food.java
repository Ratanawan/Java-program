package collectionofcollection;

public class Food {
    char id;
    String food;
    
    public Food(char id, String food)
    {
        this.id = id;
        this.food = food;
    }
    
    public String toString()
    {
        return id + " : " + food;
    }
}
