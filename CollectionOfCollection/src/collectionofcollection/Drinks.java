package collectionofcollection;

public class Drinks {
    double id;
    String drinks;
    
    public Drinks(double id, String drinks)
    {
        this.id = id;
        this.drinks = drinks;
    }
    
    public String toString()
    {
        return id + " : " + drinks;
    }
}
