package mymappractice;

public class Fruit {
    int id;
    String fruit;
    
    public Fruit(int id, String fruit)
    {
        this.id = id;
        this.fruit = fruit;
    }
    
    public String toString()
    {
        return id + " : " + fruit;
    }
}
