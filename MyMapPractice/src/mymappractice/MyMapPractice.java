package mymappractice;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class MyMapPractice {
    
    public static void main(String[] args) {
        Map<Integer, LinkedList> map = new HashMap <Integer, LinkedList>();
        
        LinkedList <Fruit> l1 = new LinkedList<Fruit>();
        LinkedList <Food> l2 = new LinkedList <Food>();
        
        Fruit fruit1 = new Fruit(1, "Apple");
        Fruit fruit2 = new Fruit(2, "Banana");
        
        l1.add(fruit1);
        l1.add(fruit2);
        
        Food food1 = new Food(1, "Pizza");
        Food food2 = new Food(2, "Hamberger");
        
        l2.add(food1);
        l2.add(food2);
        
        map.put(1, l1);
        map.put(2, l2);
        
        System.out.println(map);
        
        for(Map.Entry<Integer, LinkedList> e: map.entrySet())
        {
            System.out.println(e);
            System.out.println("-------------------------------");
        }
    }
    
}
